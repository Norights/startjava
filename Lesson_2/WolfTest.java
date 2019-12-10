public class WolfTest {
    public static void main (String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.wolfGender = "Male";
        wolfOne.wolfName = "Hardy";
        wolfOne.wolfWeight = 32;
        wolfOne.wolfAge = 3;
        wolfOne.wolfColor = "Gray";

        System.out.println("Wolf gender = " + wolfOne.wolfGender);
        System.out.println("Wolf name = " + wolfOne.wolfName);
        System.out.println("Wolf weight = " + wolfOne.wolfWeight);
        System.out.println("Wolf age = " + wolfOne.wolfAge);
        System.out.println("Wolf color = " + wolfOne.wolfColor);
        
        System.out.println(wolfOne.walk());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}

