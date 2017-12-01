package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        String userInput;

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Terry");
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(93);

        Student student2 = new Student("William");
        student2.addGrade(75);
        student2.addGrade(84);
        student2.addGrade(98);

        Student student3 = new Student("Andrea");
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(98);

        Student student4 = new Student("Tylee");
        student4.addGrade(92);
        student4.addGrade(94);
        student4.addGrade(96);


        students.put("uncleterry", student1);
        students.put("dub", student2);
        students.put("chickendinner", student3);
        students.put("lilgirl", student4);


    }
}
