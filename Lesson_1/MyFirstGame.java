public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = 56;
        int playersNumber = 78;
        while (playersNumber < randomNumber) 
        playersNumber++;
            System.out.println("Random number is more than you entered"); 
        while (playersNumber > randomNumber) 
        playersNumber--;
            System.out.println("Random number is less than you entered");
        if (playersNumber == randomNumber) 
        System.out.println("You win");
    }
}
