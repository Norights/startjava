import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcOne = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1");
        calcOne.setNum1(scan.nextInt());

        System.out.print("Enter an operator (+, -, *, /): ");
        calcOne.setSign(scan.next().charAt(0)); 

        System.out.println("Enter number 2");
        calcOne.setNum2(scan.nextInt());

        calcOne.calculate();
        calcOne.getAns();
        System.out.println(calcOne.calculate()); 
    }
}
