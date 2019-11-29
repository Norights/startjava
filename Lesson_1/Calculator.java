public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 2;
        if (c == 1) { 
            System.out.println(a+b);
        }
        else if (c == 2) { 
            System.out.println(a-b); 
        }
        else if (c == 3) { 
            System.out.println(a*b);
        }
        else if (c == 4) { 
            System.out.println(a/b); 
        }
        else if (c == 5) { 
            System.out.println(a^b); 
        }
        else if (c == 6) { 
            System.out.println(a%b); 
        }
    }
}
