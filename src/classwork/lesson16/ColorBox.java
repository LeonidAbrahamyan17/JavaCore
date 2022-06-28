package classwork.lesson16;

public class ColorBox extends Box {
    int color;

    public ColorBox(double width, double height, double depth, int color) {
        super(width, height, depth);
        this.color = color;


    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new ColorBox(width, height, depth, color);
    }
}
