public class CircularBoard extends Signboard implements Wasteful{
    
    private int radius;
    private int layers;

    public CircularBoard(int r) {
        radius = r;
        material = Medium.WOODEN;
    }

    public CircularBoard(int r,Medium make) {
        radius = r;
        material = make;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double extra() {
        return (4 - Math.PI) * radius * radius * layers;
    }
}
