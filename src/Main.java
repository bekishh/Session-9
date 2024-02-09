import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Beknazar";
        student1.age = 16;
        student1.group = "JS";

        Student student2 = new Student();
        student2.name = "Sabina";
        student2.age = 19;
        student2.group = "JAVA";

        Student student3 = new Student();
        student3.name = "Sultan";
        student3.age = 21;
        student3.group = "JS";

        Student student4 = new Student();
        student4.name = "Nurkyz";
        student4.age = 18;
        student4.group = "JAVA";

        Student student5 = new Student();
        student5.name = "Joomart";
        student5.age = 18;
        student5.group = "JS";

        Student[] students = {student1, student2, student3, student4, student5};

        int java = 0;
        int js = 0;
        int ageSum = 0;

        for (int i = 0; i < students.length; i++) {
            ageSum += students[i].age;
            if (students[i].group.equalsIgnoreCase("Java")) {
                java++;
            } else {
                js++;
            }
        }
        System.out.println("Count java: " + java);
        System.out.println("Count js: " + js);
        System.out.println("Arithmetic mean: " + (double) (ageSum / students.length));
    }
}