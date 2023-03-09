import java.util.ArrayList;

public class Student implements Methods {
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
    public void sortByLetter(ArrayList<Student> list, ArrayList<Student> startsWithA, ArrayList<Student> startsWithB) {
        for (Student a:list) {
            if (a.getFirstName().startsWith("A")){
                startsWithA.add(a);
            }
            if (a.getFirstName().startsWith("B")){
                startsWithB.add(a);
            }
        }
        System.out.println("Students name starts with 'A': "+startsWithA);
        System.out.println("Students name starts with 'B': "+startsWithB);
    }

    @Override
    public void sortByMaxMoneyAndAge(ArrayList<Student> list, ArrayList<Student> AgeAndMoney) {
        for (Student a:list) {

        }
    }

    @Override
    public void sortByMaxMoney(ArrayList<Student> list, ArrayList<Student> maxMoney) {
        for (Student a:list) {

        }
    }

    @Override
    public void sortByMaxMoneyGirl(ArrayList<Student> list, ArrayList<Student> maxMoneyGirl) {
        for (Student a:list) {

        }
    }

    @Override
    public void showsOnlyName(ArrayList<Student> list, ArrayList<Student> onlyName) {
        for (Student a:list) {

        }
    }

    @Override
    public void addMoney1000(ArrayList<Student> list, ArrayList<Student> addMoney1000) {
        for (Student a:list) {

        }
    }

    @Override
    public void firstStudent(ArrayList<Student> list, ArrayList<Student> firstStudent) {
        for (Student a:list) {

        }
    }

    @Override
    public void quantityOfStudent(ArrayList<Student> list, ArrayList<Student> quantityOfStudent) {
        for (Student a:list) {

        }
    }

    @Override
    public void BoysAndGirls(ArrayList<Student> list, ArrayList<Student> boys, ArrayList<Student> girls) {
        for (Student a:list) {

        }
    }
}
