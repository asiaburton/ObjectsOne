package object1;

public class Person {
// instance variables
    private int height = 0; //height is measured in centimeters



    // Constructor
    public Person(int height) {
        this.height = height;
    }

    // Getter to access the height value
    public int getHeight() {
        return height;
    }

    // Setter - change the value of the height value
    public void setHeight(int height) {
        this.height = height;
    }
}
