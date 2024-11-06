package java_intermediate.task1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("직사각형 넓이 : " + rectangle.calculateArea());
        System.out.println("직사각형 둘레 : " + rectangle.calculatePerimeter());
    }
}
