package graphics;
import java.util.*;

interface shape {
    double area();
}

class rectangle implements shape {
    Scanner sc = new Scanner(System.in);
    public double area() {
        System.out.println("Enter the length and breadth:");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        return (l * b);
    }
}

class square implements shape {
    Scanner sc = new Scanner(System.in);
    public double area() {
        System.out.println("Enter the side length:");
        float s = sc.nextFloat();
        return (s * s);
    }
}

class triangle implements shape {
    Scanner sc = new Scanner(System.in);
    public double area() {
        System.out.println("Enter the height:");
        float h = sc.nextFloat();
        System.out.println("Enter the  base:");
        float b = sc.nextFloat();
        return (0.5 * b * h);
    }
}

// --- Added Circle Class ---
class circle implements shape {
    Scanner sc = new Scanner(System.in);
    public double area() {
        System.out.println("Enter the radius:");
        float r = sc.nextFloat();
        return (Math.PI * r * r);
    }
}

class graphics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: 1.Rectangle 2.Square 3.Triangle 4.Circle");
        int c = sc.nextInt();
        
        switch(c) {
            case 1:
                rectangle re = new rectangle();
                System.out.println("Area of rectangle = " + re.area());
                break;
            case 2:
                square sq = new square();
                System.out.println("Area of square = " + sq.area());
                break;
            case 3:
                triangle tr = new triangle();
                System.out.println("Area of triangle = " + tr.area());
                break;
            case 4:
                circle ci = new circle();
                System.out.println("Area of circle = " + ci.area());
                break;
            default:
                System.out.println("Invalid Choice. Please try again.");
        }
    }
}
