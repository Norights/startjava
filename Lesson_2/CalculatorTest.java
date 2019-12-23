import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcOne = new Calculator();
        Scanner scan = new Scanner(System.in);

        calcOne.setNum1(scan.nextInt());
        System.out.println("Enter number 1");

        calcOne.setSign((char) scan.nextFloat());
        System.out.print("Enter an operator (+, -, *, /): ");

        calcOne.setNum2(scan.nextInt());
        System.out.println("Enter number 2");

        calcOne.calculate();
        calcOne.getAns();
        System.out.println(calcOne.calculate()); 
    }
}
