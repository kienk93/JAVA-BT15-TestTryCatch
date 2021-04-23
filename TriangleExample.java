package test;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter sides of the triangle: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        TriangleExample triangle= new TriangleExample();
        triangle.checkTriangle(a,b,c);
    }


    private void checkTriangle(double a, double b, double c){
        try {
            if (a < 0 || b < 0 || c < 0){
                throw new IllegalTriangleException();
            } else {
                if (a + b <= c || b + c <= a || c + a <= b){
                    throw new IllegalTriangleException();
                } else {
                    System.out.printf("Your input triangle is valid; three sides are %.1f, %.1f, and %.1f\n",a,b,c);
                }
            }
        } catch (IllegalTriangleException e){
            System.err.println("The triangle is not valid!");
        }
    }
}


class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
    }
}