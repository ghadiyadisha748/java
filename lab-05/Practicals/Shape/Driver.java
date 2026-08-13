abstract class shape {

    public abstract double area();

}

class circle extends shape {

    private double r;

    public circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

class rectangle extends shape {

    private double l, b;

    public rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double area() {
        return l * b;
    }
}

class triangle extends shape {

    private double b, h;

    public triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return 0.5 * b * h;
    }
}

public class Driver {

    public static void main(String[] args) {

        shape c = new circle(5);
        shape r = new rectangle(4, 6);
        shape t = new triangle(3, 8);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Triangle: " + t.area());

        double totalArea = c.area() + r.area() + t.area();
        System.out.println("Total Area: " + totalArea);

        double largestarea = 0;
        shape largestshape = null;

        for (shape s : new shape[] { c, r, t }) {
            if (s.area() > largestarea) {
                largestarea = s.area();
                largestshape = s;
            }
        }
        System.out.println("Largest Area: " + largestarea);
        System.out.println("Largest Shape: " + largestshape.getClass().getSimpleName());
    }
}