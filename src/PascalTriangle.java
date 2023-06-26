
public class PascalTriangle {
    public static String make(int row) {
        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < row; i++) {
            int number = 1;
            triangle.append(" ".repeat((row - i) * 2)); // Adjust spacing

            for (int j = 0; j <= i; j++) {
                triangle.append(String.format("%4d", number)); // Adjust spacing

                // Update the number for the next iteration
                number = number * (i - j) / (j + 1);
            }

            triangle.append(System.lineSeparator());
        }

        return String.valueOf(triangle);
    }
}
