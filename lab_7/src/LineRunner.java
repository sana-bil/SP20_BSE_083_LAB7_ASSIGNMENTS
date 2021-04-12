public class LineRunner {
    public static void main(String[] args) {
            Point p1 = new Point(2, 3);
            Point p2 = new Point(5, 6);
            Line l1 = new Line(10, 20, p1);
            Line l2 = new Line(5, 15, p2);
            System.out.println("Line1 length: " + l1.length());
            System.out.println("Line2 length: " + l2.length());
            if (l1.length() > l2.length()) {
                System.out.println("Line1 is greater");
            } else if (l2.length() > l1.length()) {
                System.out.println("Line2 is greater");
            } else {
                System.out.println("Both are equal");
            }
        }
    }
