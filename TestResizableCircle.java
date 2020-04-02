package Lesson20.Lesson20Son;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle r1 = new ResizableCircle(2);
        r1.resize(2);
        System.out.println("Area is " + r1.getArea());
    }
}
