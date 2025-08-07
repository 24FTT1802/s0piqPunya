public class ComputeArea {
    public static void main(String[] args){
        
        double areaSquare, areaTri, areaCircle;
        double base = 4;
        double height = 6;
        double radius = 8;
        double pi = 3.14;

        areaSquare = Math.pow(base, 2);
        areaTri = 0.5 * base * height;
        areaCircle = pi * Math.pow(radius, 2);

        System.out.print("The area of square is " + areaSquare + "\nThe area of triangle is " + areaTri + "\nThe area of circle is " + areaCircle);
    }
}
