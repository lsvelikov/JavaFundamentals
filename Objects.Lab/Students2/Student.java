package ObjectsAndClasses.Lab.Students2;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String town;

    public Student() {
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
        this.town = null;
    }

    public Student(String firstName, String lastName, int age, String town) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTown(String town) {
        this.town = town;
    }
    @Override
    public String toString(){
        return String.format("%s %s is %d years old%n", this.getFirstName(), this.getLastName(), this.getAge());
    }
}
