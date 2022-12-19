package adapter;

import adapter.adapters.SquarePegAdapter;
import adapter.round.RoundHole;
import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        SquarePeg squarePeg = new SquarePeg(8);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println(hole.fits(squarePegAdapter));
    }
}
