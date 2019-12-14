public class Wolf {
   
private String Gender;
    private String Name;
    private int Weight;
    private int Age;
    private String Color;
    
    public String getGender() {
        return Gender;
    }
    
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public int getWeight() {
        return Weight;
    }
    
    public void setWeight(int Weight) {
        this.Weight = Weight;
    }
    
    public int getAge() {
        if (Age > 8) {
            System.out.println("Incorrect age");
        }
        return Age;
    }
    
    public void setAge(int Age) {
        this.Age = Age;
    }
    
    public String getColor() {
        return Color;
    }
    
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
    public boolean walk() {
        System.out.println("Wolf can walk");
        return true;
    }
    
    public boolean sit() {
        System.out.println("Wolf can sit");
        return true;
    }
    
    public String run() {
        return "Wolf can run";
    }
    
    public String howl() {
        return "Wolf can howl";
    }
    
    public String hunt() {
        return "Wolf can hunt";
    }
}
