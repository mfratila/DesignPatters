package designPatterns.structural.adapter.adapters;

import designPatterns.structural.adapter.round.RoundPeg;
import designPatterns.structural.adapter.square.SquarePeg;


/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2 ) * 2));
        return result;
    }

}
