package classwork.lesson16;

public class Box {

    public double width;
    public double height;
    public double depth;

    Box(double width, double height, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double volume() {
        return depth * height * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (Double.compare(box.width, width) != 0) return false;
        if (Double.compare(box.height, height) != 0) return false;
        return (Double.compare(box.depth, depth) == 0);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}