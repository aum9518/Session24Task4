import java.util.ArrayList;

public class Action implements Methods {
    @Override
    public void sortByLetter(ArrayList<Student> list, ArrayList<Student> startsWithA, ArrayList<Student> startsWithB) {
        for (Student a : list) {
            if (a.getFirstName().startsWith("A")) {
                startsWithA.add(a);
            }
            if (a.getFirstName().startsWith("B")) {
                startsWithB.add(a);
            }
        }
        System.out.println("Students name starts with 'A': " + startsWithA);
        System.out.println("Students name starts with 'B': " + startsWithB);
    }

    @Override
    public void sortByMaxMoneyAndAge(ArrayList<Student> list, ArrayList<Student> AgeAndMoney) {
        for (Student a : list) {
            if (a.getAge() > 15 && a.getMoney() > 2000) {
                AgeAndMoney.add(a);
            }
        }
        System.out.println("Age more then 15 and money 2000:" + AgeAndMoney);
    }

    @Override
    public void sortByMaxMoney(ArrayList<Student> list, ArrayList<Student> maxMoney) {
        int maxMoney1 = Math.max(list.get(0).getMoney(), 1);
        for (Student a : list) {
            if (a.getMoney() >= maxMoney1) {
                maxMoney1 = a.getMoney();
            }
        }
        for (Student b : list) {
            if (b.getMoney() == maxMoney1) {
                maxMoney.add(b);
            }
        }
        System.out.println("Max money: " + maxMoney);
    }

    @Override
    public void sortByMaxMoneyGirl(ArrayList<Student> list) {
        ArrayList<Student> girls1 = new ArrayList<>();
        for (Student b : list) {
            if (b.getGender().equals(Gender.FEMALE)) {
                girls1.add(b);
            }
        }

        int maxmoney2 = girls1.get(0).getMoney();
        for (Student a : girls1) {
            if (maxmoney2 < a.getMoney()) {
                maxmoney2 = a.getMoney();
            }
        }

        for (Student s : girls1) {
            if (s.getMoney() == maxmoney2) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void showsOnlyName(ArrayList<Student> list) {
        for (Student a : list) {
            System.out.println("Only students name: " + a.getFirstName());
        }

    }

    @Override
    public void addMoney1000(ArrayList<Student> list) {
        for (Student a : list) {
            a.setMoney(a.getMoney() + 1000);
        }
        System.out.println("Add 1000 money: " + list);
    }

    @Override
    public void firstStudent(ArrayList<Student> list) {
        for (Student a : list) {
        }
        System.out.println(list.get(0));

    }

    @Override
    public void quantityOfStudent(ArrayList<Student> list) {
        for (Student a : list) {

        }
        System.out.println("Jalpy studentin sany: " + list.size());
    }

    @Override
    public void BoysAndGirls(ArrayList<Student> list, ArrayList<Student> boys, ArrayList<Student> girls) {
        for (Student a : list) {
            if (a.getGender().equals(Gender.MALE)) {
                boys.add(a);
            }
            if (a.getGender().equals(Gender.FEMALE)) {
                girls.add(a);
            }
        }
        System.out.println("Boys: " + boys);
        System.out.println("Girls: " + girls);
    }
}
