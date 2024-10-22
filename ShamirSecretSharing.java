import java.util.*;

public class ShamirSecretSharing {
    public static void main(String[] args) {
        // Hardcoded values
        // List of points in the format (x, y)
        // Points are: (1, 4), (2, 7), (3, 12), (6, 39)
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 4));  // 4 in base 10 is 4
        points.add(new Point(2, 7));  // 111 in base 2 is 7
        points.add(new Point(3, 12)); // 12 in base 10 is 12
        points.add(new Point(6, 39)); // 213 in base 4 is 39

        // Apply Lagrange interpolation to find the constant term (f(0))
        double c = lagrangeInterpolation(points, 0);

        // Output the constant term (secret)
        System.out.println("The constant term (secret) c is: " + c);
    }

    // Method to calculate Lagrange interpolation and find f(0), the constant term
    public static double lagrangeInterpolation(List<Point> points, int x) {
        double result = 0.0;
        int n = points.size();

        for (int i = 0; i < n; i++) {
            double term = points.get(i).y;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    term = term * (x - points.get(j).x) / (double)(points.get(i).x - points.get(j().x));
                }
            }
            result += term;
        }

        return result;
    }

    // Point class to store x, y values
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
