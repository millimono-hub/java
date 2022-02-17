//package com.company;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        Point3D point1 = new Point3D();
        Point3D point2 = new Point3D();
        Point3D point3 = new Point3D(1, 1, 1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point");
        point1.setX(Double.parseDouble(scanner.nextLine()));
        point1.setY(Double.parseDouble(scanner.nextLine()));
        point1.setZ(Double.parseDouble(scanner.nextLine()));

        System.out.println("Enter the coordinates of the second point");
        point2.setX(Double.parseDouble(scanner.nextLine()));
        point2.setY(Double.parseDouble(scanner.nextLine()));
        point2.setZ(Double.parseDouble(scanner.nextLine()));

        System.out.println("Enter the coordinates of the third point");
        point3.setX(Double.parseDouble(scanner.nextLine()));
        point3.setY(Double.parseDouble(scanner.nextLine()));
        point3.setZ(Double.parseDouble(scanner.nextLine()));


        System.out.println("The first and second points are the same -> " + point1.equalsTo(point2));
        System.out.println("The first and third points are the same -> " + point1.equalsTo(point3));
        System.out.println("The second and third points are the same -> " + point2.equalsTo(point3));

        System.out.println("Distance between third and second points = " + point3.distanceTo(point2));

        if (point1.equalsTo(point2) && point1.equalsTo(point3) && point2.equalsTo(point3))
            System.out.println("One of the points is equal to the other! The area cannot be calculated , the triangle does not exist.");
        else
            System.out.println("Triangle area = " + computeArea(point1, point2, point3));
            scanner.close();
    }

    public static double computeArea (Point3D firstPoint, Point3D secondPoint, Point3D thirdPoint){
        double a = firstPoint.distanceTo(secondPoint);
        double b = secondPoint.distanceTo(thirdPoint);
        double c = secondPoint.distanceTo(thirdPoint);

        double halfp = (a + b + c) / 2;

        return Math.sqrt(halfp * (halfp -a) * (halfp -b) * (halfp -c));
    }

}

public public static void Retour() {
    
}
