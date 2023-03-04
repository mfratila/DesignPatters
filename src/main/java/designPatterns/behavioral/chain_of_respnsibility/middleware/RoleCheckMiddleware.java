package designPatterns.behavioral.chain_of_respnsibility.middleware;

public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin");
            return true;
        }
        return checkNext(email, password);
    }
}
