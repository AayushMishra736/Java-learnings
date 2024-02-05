package Interviewpractice;

interface Drawabale{
    abstract void draw();
}

public class LambdaExpression {
    public static void main(String[] args) {
        int width = 10;
        Drawabale drawabale =  ()-> {
            System.out.println("Drawing the circle of width " + width);
        };
        drawabale.draw();
    }
}
