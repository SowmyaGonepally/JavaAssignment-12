import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student>students=new ArrayList<Student>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println("------1.Print the name of all departments in the college?");
        Set departments =students.stream().map(s->s.engDepartment).collect(Collectors.toSet());
        departments.stream().forEach(d->System.out.println(d+" "));


        System.out.println("------2.Get the names of all students who have enrolled after 2018?");
        students.stream().filter(student -> student.year>2018).map(s->s.name).forEach(n->System.out.println(n+" "));


        System.out.println("------3.Get the details of all male student in the computer sci department?");
        students.stream().filter(s->s.getGender().equals("Male")).forEach(m->System.out.println(m));


        System.out.println("------4.How many male and female student are there ? ");
        Map<String, Long> count = students.stream().collect(Collectors.groupingBy(student -> student.gender, Collectors.counting()));
        System.out.println(count);


        System.out.println("------5.What is the average age of male and female students?");
        Map<String,Double> age=students.stream().collect(Collectors.groupingBy(student ->student.gender,Collectors.averagingInt(student -> student.age)));
        System.out.println(age);


        System.out.println("------6.Get the details of highest student having highest percentage ?");
        Student highest=students.stream().max(Comparator.comparingDouble(s -> s.perTillDate)).get();
        System.out.println(highest);


        System.out.println("------7.Count the number of students in each department? ");
        Map<String,Long>dept= students.stream().collect(Collectors.groupingBy(student->student.engDepartment,Collectors.counting()));
        System.out.println(dept);


        System.out.println("------8.What is the average percentage achieved in each department?");
        Map<String,Double>avgPer= students.stream().collect(Collectors.groupingBy(s->s.engDepartment, Collectors.averagingDouble(s-> s.perTillDate)));
        System.out.println(avgPer);


        System.out.println("------9.Get the details of youngest male student in the Electronic department");
        Student young=students.stream().filter(student -> student.engDepartment.equals("Electronic")).min(Comparator.comparingInt(student -> student.age)).get();
        System.out.println(young);


        System.out.println("------10.How many male and female students are there in the computer science department?");
        Map<String,Long>mfc=students.stream().filter(student -> student.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(student -> student.gender,Collectors.counting()));
        System.out.println(mfc);



    }
}
