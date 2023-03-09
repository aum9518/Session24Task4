import java.util.ArrayList;

public class Student  {
    private String lastName;
    private String firstName;
    private int age;
    private int money;
    private Gender gender;

    public Student(String lastName, String firstName, int age, int money, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.money = money;
        this.gender = gender;
    }

    public Student() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", gender=" + gender +
                '}';
    }

}
