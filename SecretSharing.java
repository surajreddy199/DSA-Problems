import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SecretSharing {

    public static void main(String[] args) {
        String jsonInput = readJsonFile("input.json");
        if (jsonInput != null) {
            processJson(jsonInput);
        }
    }

    public static String readJsonFile(String filePath) {
        StringBuilder jsonBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                jsonBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return jsonBuilder.toString();
    }

    public static void processJson(String jsonInput) {
        JSONObject data = new JSONObject(jsonInput);

        // Step 1: Read n and k
        int n = data.getJSONObject("keys").getInt("n");
        int k = data.getJSONObject("keys").getInt("k");

        // Step 2: Decode the Y values
        List<Point> points = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String key = String.valueOf(i);
            if (data.has(key)) {
                int base = data.getJSONObject(key).getInt("base");
                String value = data.getJSONObject(key).getString("value");
                int y = decodeValue(base, value);
                points.add(new Point(i, y)); // Use i as x-coordinate
            }
        }

        // Step 3: Calculate the constant term c using Lagrange interpolation
        int c = lagrangeInterpolation(points);

        // Print the result
        System.out.println(c);
    }

    public static int decodeValue(int base, String value) {
        // Decode the given value from the specified base to an integer
        return Integer.parseInt(value, base);
    }

    public static int lagrangeInterpolation(List<Point> points) {
        // Compute the constant term of the polynomial using Lagrange interpolation
        int c = 0; // This will hold the value of P(0)
        int n = points.size();

        for (int i = 0; i < n; i++) {
            Point point = points.get(i);
            int xi = point.x;
            int yi = point.y;

            // Compute L_i(0)
            double LiAt0 = 1.0; // Use double for accuracy

            for (int j = 0; j < n; j++) {
                if (j != i) {
                    LiAt0 *= (0 - points.get(j).x) / (double)(xi - points.get(j).x);
                }
            }

            c += yi * LiAt0;
        }

        return (int) c; // Cast to int for final result
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
