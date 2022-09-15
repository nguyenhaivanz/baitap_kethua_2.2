package ngay_8;

public class Triangle extends Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, double side11, double side21, double side31) {
        super(side1, side2, side3);
        this.side1 = side11;
        this.side2 = side21;
        this.side3 = side31;
    }

    @Override
    public double getSide1() {
        return side1;
    }

    @Override
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    @Override
    public double getSide2() {
        return side2;
    }

    @Override
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double getSide3() {
        return side3;
    }

    @Override
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        return Math.abs((getPrimeter()/2)*((getPrimeter()/2)-side1)*((getPrimeter()/2)-side2)*((getPrimeter()/2)-side3));
    }
    public double getPrimeter(){
        return (side1+side2+side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
