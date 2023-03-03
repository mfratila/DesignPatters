package designPatterns.structural.adapter;


import designPatterns.structural.adapter.adapters.SquarePegAdapter;
import designPatterns.structural.adapter.round.RoundHole;
import designPatterns.structural.adapter.round.RoundPeg;
import designPatterns.structural.adapter.square.SquarePeg;

public class ExampleApp {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallSqaPeg = new SquarePeg(2);
        SquarePeg largeSqaPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile

        // Adapter solvers the problem
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqaPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqaPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }


}
