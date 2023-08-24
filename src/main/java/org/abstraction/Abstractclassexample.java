package org.abstraction;

interface Drawable {
    void drawCircle();

    void drawTriangle();

    void drawRectangle();

    void drawPentagon();

    void drawHexagon();
}

abstract class Erase implements Drawable{
    abstract void Erase();
}

class Draw extends Erase{

    @Override
    public void drawCircle() {
        System.out.println("Drawing Circle..");
    }

    @Override
    public void drawTriangle() {
        System.out.println("Drawing Triangle..");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Drawing Rectangle..");
    }

    @Override
    public void drawPentagon() {
        System.out.println("Drawing Pentagon..");
    }

    @Override
    public void drawHexagon() {
        System.out.println("Drawing Hexagon..");
    }

    @Override
    void Erase() {
        System.out.println("Erasing objects..");
    }
}

public class Abstractclassexample {
    public static void main(String[] args) {
        Drawable draw = new Draw();
        draw.drawCircle();
        draw.drawRectangle();
        draw.drawTriangle();
        draw.drawHexagon();
        draw.drawPentagon();
        ((Draw) draw).Erase();
    }
}
