import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car bMW = new Car("BMW", 200);
        Car tesla = new Car("Tesla" , 150);

//        System.out.println("name: " + bMW.getName() + "top speed: " + bMW.getTopSpeed());
//        System.out.println("name: " + tesla.getName() + "top speed:" + tesla.getTopSpeed());

        Student kavya = new Student("Kavya Gottipati", 413);
        Student harish = new Student("Harish  Mandava", 400);

        List<Student> studentList = new ArrayList<>();
        studentList.add(kavya);
        studentList.add(harish);

        System.out.println("list size:" + studentList.size());
        System.out.println(studentList.get(0).getRollNumber());

        for(int i = 0 ; i < studentList.size(); i++) {
            System.out.println("student name: " + studentList.get(i).getName() + "student roll number:" + studentList.get(i).getRollNumber());
        }

        for (Student student :studentList) {
            System.out.println(student.getName() + " " + student.getRollNumber());
        }

        Class hindi = new Class("Hindi", "Modi", studentList);



    }
}
