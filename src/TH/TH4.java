package TH;

import java.util.Scanner;

public class TH4 {
    private double a;
    private double b;

    public TH4() {
        this.a = 0;
        this.b = 0;
    }

    public TH4(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add() {
        return a + b;
    }
    public double subtract() {
        return a - b;
    }
    public double multiply() {
        return a * b;
    }
    public double divide() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Không thể chia cho 0.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TH4 calculator = new TH4();

        System.out.print("Nhập giá trị cho 'a': ");
        double a = scanner.nextDouble();
        calculator.setA(a);

        System.out.print("Nhập giá trị cho 'b': ");
        double b = scanner.nextDouble();
        calculator.setB(b);

        System.out.println("Tổng (a + b): " + calculator.add());
        System.out.println("Hiệu (a - b): " + calculator.subtract());
        System.out.println("Tích (a * b): " + calculator.multiply());
        System.out.println("Thương (a / b): " + calculator.divide());

        scanner.close();
    }
}
