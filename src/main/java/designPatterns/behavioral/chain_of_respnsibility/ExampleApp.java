package designPatterns.behavioral.chain_of_respnsibility;


import designPatterns.behavioral.chain_of_respnsibility.middleware.Middleware;
import designPatterns.behavioral.chain_of_respnsibility.middleware.RoleCheckMiddleware;
import designPatterns.behavioral.chain_of_respnsibility.middleware.ThrottlingMiddleware;
import designPatterns.behavioral.chain_of_respnsibility.middleware.UserExistsMiddleware;
import designPatterns.behavioral.chain_of_respnsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleApp {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Enter password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while(!success);
    }


}
