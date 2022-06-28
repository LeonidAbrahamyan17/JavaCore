package classwork.lesson15;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double volume() {
        return depth * height * width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        Box box = (Box) obj;
        return width == box.width
                && height == box.height
                && depth == box.depth;
    }

    boolean equalTo(Box box) {
        return (this.width == box.width
                && this.height == box.height
                && this.depth == box.depth);
    }
}