package shape;

/**
 * Created on 26.05.2016.
 */

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(5, 6);
        Circle circle1 = new Circle(p1, 7);
        Circle circle2 = circle1.clone();

        System.out.println("Let's create a circle and make a clone of it. So, we have two similar circles.");
        System.out.println("Does the condition 'circle1 == circle2' correct to our circles? - " + (circle1 == circle2));
        System.out.println("Does the condition 'circle1.equals(circle2)' correct to our circles? - " + (circle1.equals(circle2)));
        System.out.println("HashCode of 1st circle - " + circle1.hashCode());
        System.out.println("HashCode of 2nd circle - " + circle2.hashCode());
        System.out.println("Comparison of HashCodes: Do they equal? - " + (circle1.hashCode() == circle2.hashCode()));
        System.out.println();

        Point p2 = new Point(9, 9);
        circle1.setCenterCircle(p2);

        System.out.println("Let's change a central point of circle1");
        System.out.println("Does the condition 'circle1 == circle2' correct to our circles? - " + (circle1 == circle2));
        System.out.println("Does the condition 'circle1.equals(circle2)' correct to our circles? - " + (circle1.equals(circle2)));
        System.out.println("HashCode of 1st circle - " + circle1.hashCode());
        System.out.println("HashCode of 2nd circle - " + circle2.hashCode());
        System.out.println("Comparison of HashCodes: Do they equal? - " + (circle1.hashCode() == circle2.hashCode()));
        System.out.println();

        Rectangle rectangle1 = new Rectangle(p1, p2);
        Rectangle rectangle2 = rectangle1.clone();

        System.out.println("Let's create a rectangle and make a clone of it. So, we have two similar rectangles.");
        System.out.println("Does the condition 'rectangle1 == rectangle2' correct to our rectangles? - " + (rectangle1 == rectangle2));
        System.out.println("Does the condition 'rectangle1.equals(rectangle2)' correct to our rectangles? - " + (rectangle1.equals(rectangle2)));
        System.out.println("HashCode of 1st rectangle - " + rectangle1.hashCode());
        System.out.println("HashCode of 2nd rectangle - " + rectangle2.hashCode());
        System.out.println("Comparison of HashCodes: Do they equal? - " + (rectangle1.hashCode() == rectangle2.hashCode()));
        System.out.println();

        Point p3 = new Point(7, 7);
        rectangle1.setLeftHighPoint(p3);

        System.out.println("Let's change a left high point of rectangle1");
        System.out.println("Does the condition 'rectangle1 == rectangle2' correct to our rectangles? - " + (rectangle1 == rectangle2));
        System.out.println("Does the condition 'rectangle1.equals(rectangle2)' correct to our rectangles? - " + (rectangle1.equals(rectangle2)));
        System.out.println("HashCode of 1st rectangle - " + rectangle1.hashCode());
        System.out.println("HashCode of 2nd rectangle - " + rectangle2.hashCode());
        System.out.println("Comparison of HashCodes: Do they equal? - " + (rectangle1.hashCode() == rectangle2.hashCode()));
        System.out.println();

    }
}
