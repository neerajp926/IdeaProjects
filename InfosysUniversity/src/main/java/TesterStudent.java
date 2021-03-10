import java.util.Scanner;

public class TesterStudent {

    public static void main(String[] args) {
        Student stud = new Student();
        Scanner myStud = new Scanner(System.in);
        System.out.println("Enter Student ID");
        int ID = Integer.parseInt(myStud.nextLine());
        stud.setStudentId(ID);
        System.out.println("Enter Student Name");
        String name= myStud.nextLine();
        stud.setName(name);
        System.out.println("Enter QualifyingMarks");
        int marks = Integer.parseInt(myStud.nextLine());
        stud.setQualifyingExamMarks(marks);
        System.out.println("Enter Student Year");
        int year = Integer.parseInt(myStud.nextLine());
        stud.setYearOfEngg(year);
        System.out.println("Enter Student Residential Status");
        char status = myStud.nextLine().charAt(0);
        stud.setResidentialStatus(status);

        System.out.println(" Name of the Student is: "+stud.getName());
        System.out.println("Student ID is  :" +stud.getStudentId());
        System.out.println("Qualifying marks are :" +stud.getQualifyingExamMarks());

        if ( stud.getResidentialStatus() == 'H')
        {
            System.out.println("Hostler");
        }
        else
            {
                System.out.println("Day Scholar");
        }
        System.out.println(stud.getYearOfEngg());
    }
}
