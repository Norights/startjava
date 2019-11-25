    public class ConditionalStatement {
        public static void main(String[] args) {
            int Yourage = 21;
            if(Yourage > 20) {
                System.out.println("You are young");
            }
            boolean Areyouaman = true;
            if(Areyouaman == true) {
                System.out.println("You're a man");
            }
            boolean Areyounotaman = true;
            if(Areyounotaman== true) {
                System.out.println("You're not a man");
            }
            double yourheight = 1.57;
            if(yourheight < 1.80) {
                System.out.println("Your height is more than 180 centimeters");
            } else {
                System.out.println("Your height is less than 180 centimeters");
            }
            char DoesyournamebeginwiththeletterM = 'M';
            char DoesyournamebeginwiththeletterI = 'I';
            if(DoesyournamebeginwiththeletterM == 'M') {
                System.out.println("Your name begins with the letter M");
            } else if(DoesyournamebeginwiththeletterI == 'I') {
                System.out.println("Your name begins with the letter I ");
            } else { 
                System.out.println("Your name does not begin with the letter M or I ");
            }
        }
    }
