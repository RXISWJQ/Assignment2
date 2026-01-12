import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("Henry", "Emily", "Manager", 27045.78));
        people.add(new Employee("Edwin", "Murray", "Engineer", 50000));
        people.add(new Student("William", "Harrington", 2.5));
        people.add(new Student("Greg", "Wilson", 3.5));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf(
                    "%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
    }
}