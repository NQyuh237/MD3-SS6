package BT;

import java.util.Scanner;

public class BT1 {
    public class Circle {
        private double radius;
        private String color;

        // Constructors
        public Circle() {
            this.radius = 0;
            this.color = "";
        }

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double chuVi() {
            return 2 * Math.PI * radius;
        }

        public double dienTich() {
            return Math.PI * radius * radius;
        }

        public void inputData() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập bán kính: ");
            radius = scanner.nextDouble();

            scanner.nextLine(); // Đọc dòng trống
            System.out.print("Nhập màu sắc: ");
            color = scanner.nextLine();
        }

        public void displayData() {
            System.out.println("Bán kính: " + radius);
            System.out.println("Màu sắc: " + color);
            System.out.println("Chu vi: " + chuVi());
            System.out.println("Diện tích: " + dienTich());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng hình tròn: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Circle[] circles = new Circle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho hình tròn thứ " + (i + 1) + ":");
            circles[i] = new BT1().new Circle();
            circles[i].inputData();
        }

        System.out.println("Thông tin các hình tròn:");
        for (int i = 0; i < n; i++) {
            System.out.println("Hình tròn thứ " + (i + 1) + ":");
            circles[i].displayData();
            System.out.println();
        }

        scanner.close();
    }
}
