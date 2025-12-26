import java.util.Scanner;

class Calculator {

    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div": return b != 0 ? a / b : 0;
            default: 
                System.out.println("Invalid Operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div): ");
        String op = sc.next();

        Calculator c = new Calculator(a, b, op);
        System.out.println("Result = " + c.calculate());
    }
}
