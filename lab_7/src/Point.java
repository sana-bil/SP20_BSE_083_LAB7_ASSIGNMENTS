public class Point {
    private double x1;
    private double y1;
    public Point() {}
    public Point(double x, double y) {
        x1 = x;
        y1 = y;
    }
    public void setX(double x) {
        x1 = x;
    }
    public double getX() {
        return x1;
    }
    public void setY(double y) {
        y1 = y;
    }
    public double getY() {
        return y1;
    }
    public void display() {
        System.out.println("x: "+x1);
        System.out.println("y: "+y1);
    }
}
