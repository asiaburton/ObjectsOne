package object1;

public class Chair {
    // instance fields
    private String material;
    private String color;
    private int legs;

    //Constructor - how to make a chair
    public Chair(String material, String color, int legs) {
        this.material = material;
        this.color = color;
        this.legs = legs;

    }
    // Getter to access material variable
    public String getMaterial() {
        return material;
    }

    // Setter - change the value of the material variable
    public void setMaterial(String material) {
        this.material = material;
    }

    // Getter to access the color variable
    public String getColor() {
        return color;
    }

    // Setter - change the value of the color variable
    public void setColor(String color) {
        this.color = color;
    }

    // Getter to access the legs variable
    public int getLegs() {
        return legs;
    }

    // Setter - to change the value of the legs variable
    public void setLegs(int legs) {
        this.legs = legs;
    }
}
