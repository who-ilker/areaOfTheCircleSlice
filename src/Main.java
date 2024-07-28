import java.util.Scanner;
//(𝜋 * (r*r) * 𝛼) / 360   | r = 3  -> area = 28.259999999999998
public class Main {
    public static void main (String[] args){

        double pi = 3.14, r, area, perimeter, angle, areaOfTheCircleSlice;
        Scanner inp = new Scanner(System.in);

        System.out.print("Radius of the circle (r): ");
        r = inp.nextDouble();
        System.out.print("Measure of the central angle: ");
        angle = inp.nextDouble();
        //area = pi * r * r;
        //perimeter = 2 * pi * r;
        //System.out.println("Area of the circle: "+area+ "\nPerimeter of the circle: "+perimeter);

        areaOfTheCircleSlice = (pi * r * r * angle) / 360;
        System.out.println(areaOfTheCircleSlice);

    }
}