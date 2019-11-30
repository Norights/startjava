public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        String c = "^";
        if (c == "+") {
            System.out.println( a+ b);
        } else if (c == "-") { 
            System.out.println(a - b); 
        } else if (c == "*") { 
            System.out.println(a * b);
        } else if (c == "/") { 
            System.out.println(a / b); 
        } else if (c == "^") { 
            System.out.println(a * a * a * a); 
        } else if (c == "%") { 
            System.out.println(a % b); 
        }
    }
}
