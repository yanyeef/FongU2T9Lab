public class RightTriRunner {
    public static void main(String[] args) {
        RightTriangle tri = new RightTriangle(3, 4);
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);
        double first = tri.hypotenuse();
        double second = tri2.hypotenuse();
        System.out.println(first);
        System.out.println(second);

        RightTriangle tri3 = new RightTriangle(2.5, 3.5);
        double third = tri3.hypotenuse();
        System.out.println(third);
    }
}
