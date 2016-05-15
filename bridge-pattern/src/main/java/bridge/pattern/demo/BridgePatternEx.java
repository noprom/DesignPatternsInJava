package bridge.pattern.demo;

/**
 * BridgePatternEx
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/11/16 5:35 AM.
 */
interface IColor {
    void fillWithColor(int border);
}

class RedColor implements IColor {

    public void fillWithColor(int border) {
        System.out.print("Red color with " + border + " inch border");
    }
}

class GreenColor implements IColor {

    public void fillWithColor(int border) {
        System.out.print("Green color with " + border + " inch border.");
    }
}

abstract class Shape {
    // Composition
    protected IColor color;

    protected Shape(IColor c) {
        this.color = c;
    }

    abstract void drawShape(int border);

    abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

    protected Triangle(IColor c) {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.print("This Triangle is colored with:  ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}

class Rectangle extends Shape {
    public Rectangle(IColor c) {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.print(" This Rectangle is colored with: ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\n Now we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}

public class BridgePatternEx {

    public static void main(String[] args) {
        System.out.println("*****BRIDGE PATTERN*****");
        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle:");
        IColor green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);
        //Coloring Red to Rectangle
        System.out.println("\n\nColoring Rectangle :");
        IColor red = new RedColor();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        //Modifying the border length twice
        rectangleShape.modifyBorder(50, 2);
    }
}
