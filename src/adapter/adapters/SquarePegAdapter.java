package adapter.adapters;

import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    protected SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
