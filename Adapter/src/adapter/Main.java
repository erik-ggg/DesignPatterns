package adapter;

public class Main {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        System.out.println(hole.fits(rpeg));

        SquarePeg spegSmall = new SquarePeg(5);
        SquarePeg spegLarge = new SquarePeg(10);

        System.out.println(hole.fits(new SquarePegAdapter(spegSmall)));
        System.out.println(hole.fits(new SquarePegAdapter(spegLarge)));
    }

}
