public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcOne = new Calculator();
        Scanner scan = new Scanner(System.in);

        calcOne.setMathematicalOperation((char) scan.nextFloat());
            System.out.println("Enter number 1");

        calcOne.setNum1(scan.nextInt());
            System.out.print("Enter an operator (+, -, *, /): ");

        calcOne.setNum2(scan.nextInt());
            System.out.println("Enter number 2");

        calcOne.setAns();
            System.out.print("The result is given as follows: ");
        }
    }
