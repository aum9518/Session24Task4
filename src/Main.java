import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     Action action = new Action();
        Student student1 = new Student("Abdugani uulu","Manas",27,3000,Gender.MALE);
        Student student2 = new Student("Abduvahob uulu","Matmusa",22,5000,Gender.MALE);
        Student student3 = new Student("Kubatov","Aibek",19,4000,Gender.MALE);
        Student student4 = new Student("Duisheeva","Aizat",17,100000,Gender.FEMALE);
        Student student5 = new Student("Bakyt kyzy","Aisha",24,60000,Gender.FEMALE);
        Student student6 = new Student("Niazbekov","Torogeldi",17,12000,Gender.MALE);
        Student student7 = new Student("Tilekov","Bakyt",18,8000,Gender.FEMALE);
        Student student8 = new Student("Jamgyrchiev","Bek",14,9000,Gender.MALE);
        Student student9 = new Student("Kanybekov","Bilal",29,15000,Gender.MALE);
        Student student10 = new Student("Berdiev","Akyl",26,1000,Gender.FEMALE);
        ArrayList<Student>list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        ArrayList<Student>startsWithA=new ArrayList<>();
        ArrayList<Student>startsWithB=new ArrayList<>();
        ArrayList<Student>AgeAndMoney=new ArrayList<>();
        ArrayList<Student>maxMoney=new ArrayList<>();
        ArrayList<Student>boys=new ArrayList<>();
        ArrayList<Student>girls=new ArrayList<>();

        action.firstStudent(list);
      action.sortByLetter(list,startsWithA,startsWithB);
      action.addMoney1000(list);
      action.BoysAndGirls(list,boys,girls);
      action.sortByMaxMoney(list,maxMoney);
       action.quantityOfStudent(list);
       action.showsOnlyName(list);
       action.sortByMaxMoneyAndAge(list,AgeAndMoney);
       action.sortByMaxMoneyGirl(list);
    }
}