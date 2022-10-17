public class RightTriangle {
    //instance variables
    private double base;
    private double height;

    //constuctor
    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse() {
        double sumOfSides = Math.pow(base, 2) + Math.pow(height, 2);
        double hypotenuse = Math.sqrt(sumOfSides);
        return hypotenuse;
    }

}
