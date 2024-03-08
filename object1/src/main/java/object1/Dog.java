package object1;

public class Dog {
    // instance variables
   private  String name;
   private int age;
   private String owner;
   private String breed;

   // Constructor - how to make a dog
    public Dog(String name, int age, String breed, String owner) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.owner = owner;
    }

    // Getter to access the value of the name variable
    public String getName() {
        return name;
    }

    // Setter - to change the value of the name variable
    public void setName(String name) {
        this.name = name;
    }

    // Getter to access the value of the age variable
    public int getAge() {
        return age;
    }

    // Setter - to change the value of the age variable
    public void setAge(int age) {
        this.age = age;
    }

    // Getter to access the value of the owner variable
    public String getOwner() {
        return owner;
    }

    // Setter - change the value of the owner variable
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Getter to access the value of the breed variable
    public String getBreed() {
        return breed;
    }

    // Setter - change the value of the breed variable
    public void setBreed(String breed) {
        this.breed = breed;
    }
}




