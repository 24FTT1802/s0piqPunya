import java.util.Scanner;

public class AreaOfTriangleGeometry {
    public static void main(String[] args) {
        /*Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a
        triangle and displays its area in ONE decimal place. The formula for computing the area of a
        triangle is
        side1 = √(𝑥2 − 𝑥1)² + (𝑦2 − 𝑦1)²
        *for side2 and side3 change x and y
        s = (side1 + side2 + side3) / 2
        area = √𝑠(𝑠 − 𝑠𝑖𝑑𝑒1)(𝑠 − 𝑠𝑖𝑑𝑒2)(𝑠 − 𝑠𝑖𝑑𝑒3)
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three coordinates for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
        double side2 = Math.sqrt((Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2)));
        double side3 = Math.sqrt((Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2)));

        double s = (side1 + side2 + side3) / 2;
        double area = (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));

        System.out.printf("The area of the triangle is %.1f", area);

        input.close();
    }
}
