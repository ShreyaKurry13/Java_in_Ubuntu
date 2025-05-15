public abstract class Signboard {

    protected Medium material;

    public Signboard() {
        material = material.WOODEN;
    }

    public Signboard(Medium make) {
        material = make;
    }

    public abstract double Area();

    public double Price(){
        return materialPrice() * Area();
    }

    public double materialPrice(){
        double rate;

        switch (material) {
            case METAL:
                rate = 150.0;
                break;
            case WOODEN:
                rate = 90.5;
                break;
            default:
                rate = 55.5;
                break;
        }
        return rate;
    }

}