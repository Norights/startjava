public class Calculator {
    private int num1;
    private int num2;
    private int ans;
    private char sign;

    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getAns() {
        return ans;
    }
    
    public void setAns(int ans) {
        this.ans = ans;
    }
    
    public char getSign() {
        return sign;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }

    int calculate() {
    switch(sign) {
        case '+': ans = num1 + num2;
            break;
        case '-': ans = num1 - num2;
            break;
        case '*': ans = num1 * num2;
            break;
        case '/': ans = num1 / num2;
            break;
        }
        return ans;
    }
}


