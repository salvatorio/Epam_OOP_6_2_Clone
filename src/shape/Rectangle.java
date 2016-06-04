package shape;

/**
 * Created on 26.05.2016.
 */

public class Rectangle extends Shape {

    private Point leftHighPoint;
    private Point rightLowerPoint;

    public Rectangle(Point leftHighPoint, Point rightLowerPoint) {
        this.leftHighPoint = leftHighPoint;
        this.rightLowerPoint = rightLowerPoint;
    }


    @Override
    public void move(double dx, double dy) {
        leftHighPoint.setX(leftHighPoint.getX() + dx);
        leftHighPoint.setY(leftHighPoint.getY() + dy);
        rightLowerPoint.setX(rightLowerPoint.getX() + dx);
        rightLowerPoint.setY(rightLowerPoint.getY() + dy);
    }

    @Override
    public double perimeter() {
        return 2. * (Math.abs(rightLowerPoint.getX() - leftHighPoint.getX()) +
                Math.abs(rightLowerPoint.getY() - leftHighPoint.getY()));
    }

    @Override
    public double square() {
        return Math.abs((rightLowerPoint.getX() - leftHighPoint.getX()) *
                (rightLowerPoint.getY() - leftHighPoint.getY()));
    }

    public Point getRightLowerPoint() {
        return rightLowerPoint;
    }

    public void setRightLowerPoint(Point rightLowerPoint) {
        this.rightLowerPoint = rightLowerPoint;
    }

    public Point getLeftHighPoint() {
        return leftHighPoint;
    }

    public void setLeftHighPoint(Point leftHighPoint) {
        this.leftHighPoint = leftHighPoint;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftHighPoint=" + leftHighPoint +
                ", rightLowerPoint=" + rightLowerPoint +
                '}';
    }


    @Override
    public Rectangle clone() {
        try {
            Rectangle temp = (Rectangle) super.clone();
            temp.leftHighPoint = (Point) this.leftHighPoint.clone();
            temp.rightLowerPoint = (Point) this.rightLowerPoint.clone();
            return temp;


        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        if (!leftHighPoint.equals(rectangle.leftHighPoint)) return false;
        return rightLowerPoint != null ? rightLowerPoint.equals(rectangle.rightLowerPoint) : rectangle.rightLowerPoint == null;
    }

    @Override
    public int hashCode() {
        int result = (leftHighPoint != null ? leftHighPoint.hashCode() : 0);
        result = 31 * result + (rightLowerPoint != null ? rightLowerPoint.hashCode() : 0);
        return result;
    }

}
