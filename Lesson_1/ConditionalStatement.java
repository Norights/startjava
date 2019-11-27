    public class ConditionalStatement {
        public static void main(String[] args) {
            int yourAge = 21;
            if(yourAge > 20) {
                System.out.println("You are young");
            }
            boolean isMan = true;
            if(isMan == true) {
                System.out.println("You're a man");
            }
            boolean isNotMan = true;
            if(isNotMan== true) {
                System.out.println("You're not a man");
            }
            double yourHeight = 1.57;
            if(yourHeight < 1.80) {
                System.out.println("Your height is more than 180 centimeters");
            } else {
                System.out.println("Your height is less than 180 centimeters");
            }
            char doesYourNameBeginWithTheLetterM = 'M';
            if(doesYourNameBeginWithTheLetterM == 'M') {
                System.out.println("Your name begins with the letter M");
            } else { 
                System.out.println("Your name does not begin with the letter M");
            }
        }
    }
