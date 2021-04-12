public class Line {
    private Point p;
    private double x2;
    private double y2;
    double x1;
    double y1;
    public Line() {}
    public Line(double x2, double y2, Point p) {
        this.x2 = x2;
        this.y2 = y2;
        this.p = p;
        x1 = p.getX();
        y1 = p.getY();
    }
    public void setP(Point p) {
        this.p = p;
    }
    public Point getP() {
        return p;
    }
    public void setX(double x2) {
        this.x2 = x2;
    }
    public double getX() {
        return x2;
    }
    public void setY(double x2) {
        this.x2 = x2;
    }
    public double getY() {
        return y2;
    }
    public double length() {
        double length = Math.sqrt((x2-x1)*2 + (y2-y1)*2);
        return length;
    }
}
