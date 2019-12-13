public class WolfTest {
    public static void main (String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setWolfGender("Male");
        wolfOne.setWolfName("Hardy");
        wolfOne.setWolfWeight(32);
        wolfOne.setWolfAge(3);
        wolfOne.setWolfColor("Gray");
    
        System.out.println("Wolf gender = " + wolfOne.getWolfGender());
        System.out.println("Wolf name = " + wolfOne.getWolfName());
        System.out.println("Wolf weight = " + wolfOne.getWolfWeight());
        System.out.println("Wolf age = " + wolfOne.getWolfAge());
        System.out.println("Wolf color = " + wolfOne.getWolfColor());
    
        System.out.println(wolfOne.walk());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}
