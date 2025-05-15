public class Program {

    public static double BannerPrice(Signboard poster,int count){
        float discount = count < 10 ? 0 : 0.05f;
        double cost = poster.Price();
        if (poster instanceof CircularBoard c) {
            cost += 0.75 * c.extra();
        }
        return count * cost * (1 - discount);
    }

    public static void main(String[] args) {
        RectangularBoard r = new RectangularBoard(4 , 5);
        System.out.printf("Area of Rectangle = %.2f , Price = %.2f %n" ,r.Area(), BannerPrice(r, 11));

        System.out.println("---------------");

        CircularBoard c = new CircularBoard(5);
        System.out.printf("Area of Circle = %.2f , Price = %.2f %n" ,c.Area(), BannerPrice(c, 5));

        System.out.println("---------------");

        RectangularBoard s = new RectangularBoard(4 , 5,Medium.WOODEN);
        System.out.printf("Area of Rectangle = %.2f , Price = %.2f %n" ,s.Area(), BannerPrice(s, 15));

        System.out.println("---------------");

        CircularBoard p = new CircularBoard(5,Medium.METAL);
        System.out.printf("Area of Rectangle = %.2f , Price = %.2f %n" ,p.Area(), BannerPrice(p, 9));
    }
}