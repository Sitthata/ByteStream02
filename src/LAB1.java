import Shape.*;

public class LAB1 {
    public static void main(String[] args) {
        testDecorator();
    }

    public static void testDecorator() {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}