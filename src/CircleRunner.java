public class CircleRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.getInfo());

        circle.setRadius(9.2);
        System.out.println(circle.getInfo());

        circle.setRadius(12.3);
        System.out.println(circle.getInfo());
    }
}
