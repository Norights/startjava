public class Wolf {
   
    private String wolfGender;
    private String wolfName;
    private int wolfWeight;
    private int wolfAge;
    private String wolfColor;
    
    public String getWolfGender() {
        return wolfGender;
    }
    public void setWolfGender(String wolfGender) {
        this.wolfGender = wolfGender;
    }
   
    public String getWolfName() {
        return wolfName;
    }
    public void setWolfName(String wolfName) {
        this.wolfName = wolfName;
    }
    
    public int getWolfWeight() {
        return wolfWeight;
    }
    public void setWolfWeight(int wolfWeight) {
        this.wolfWeight = wolfWeight;
    }
    
    public int getWolfAge() {
        if(wolfAge > 8) {
            System.out.println("Incorrect age");
        }
        return wolfAge;
    }
    public void setWolfAge(int wolfAge) {
        this.wolfAge = wolfAge;
    }
    
    public String getWolfColor() {
        return wolfColor;
    }
    public void setWolfColor(String wolfColor) {
        this.wolfColor = wolfColor;
    }
    
    
    public boolean walk() {
        System.out.println("Wolf can walk");    
            return true;
        }

    public boolean sit() {
        System.out.println("Wolf can sit");
            return true;
        }

    public String run () {
        return "Wolf can run";
    }

    public String howl() {
        return "Wolf can howl";
    }
    
    public String hunt() {
        return "Wolf can hunt";
    }
}

