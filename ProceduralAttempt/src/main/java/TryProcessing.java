import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int POSITION = 1;
    private int units = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        drawCircle(unitsPerFrame(1), circlePosition(1));
    }

    private void drawCircle2() {
        drawCircle(unitsPerFrame(2), circlePosition(2));
    }

    private void drawCircle3() {
        drawCircle(unitsPerFrame(3), circlePosition(3));
    }

    private void drawCircle4() {
        drawCircle(unitsPerFrame(4), circlePosition(4));
    }

    private int circlePosition(int number) {
        return POSITION*number;
    }

    private int unitsPerFrame(int number) {
        if(number==1)
            units++;
        return units*number;
    }

    private void drawCircle(int unitsPerFrame, int position) {
        ellipse(unitsPerFrame, HEIGHT*position/5, DIAMETER, DIAMETER);
    }
}