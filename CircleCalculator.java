public class CircleCalculator {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the radius as a command line argument.");
            return;
        }

        double radius = Double.parseDouble(args[0]);

        // Calculating area and perimeter
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        // Output: Area and perimeter
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Perimeter (Circumference) of the circle: %.2f\n", perimeter);
    }
}
