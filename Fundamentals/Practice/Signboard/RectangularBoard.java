public class RectangularBoard extends Signboard {

    private int length;
    private int breadth;

    public RectangularBoard(int l,int b) {
        length = l;
        breadth = b;
        material = Medium.METAL;
    }

    public RectangularBoard(int l,int b,Medium make) {
        length = l;
        breadth = b;
        material = make;
    }

    @Override
    public double Area() {
        return length * breadth;
    }
    
}
