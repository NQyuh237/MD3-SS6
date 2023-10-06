package BT;

import java.util.Scanner;

public class BT2 {
    private double a, b, c;

    public BT2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0; // K có nghiệm
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0; // K có nghiệm
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị cho a, b, và c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        BT2 equation = new BT2(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm 1: " + root1);
            System.out.println("Nghiệm 2: " + root2);
        } else if (discriminant == 0) {
            double root = equation.getRoot1();
            System.out.println("Phương trình có một nghiệm kép: " + root);
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
        input.close();
    }
}
