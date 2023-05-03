package java_Assignment_2;

import java.util.Scanner;

class Person {
    String name, bDate, gender;
}

class StudentDetails extends Person {
    String course, college, university;
}

class Marks extends StudentDetails {
    char grade;
    int[] marks = new int[4];
    float avg;
    Scanner scan = new Scanner(System.in);

    public void setDetails() {
        System.out.print("             Enter Name :: ");
        name = scan.nextLine();
        System.out.print("       Enter Birth Date :: ");
        bDate = scan.nextLine();
        System.out.print("           Enter Gender :: ");
        gender = scan.nextLine();
        System.out.print("      Enter Course Name :: ");
        course = scan.nextLine();
        System.out.print("     Enter College Name :: ");
        college = scan.nextLine();
        System.out.print("  Enter University Name :: ");
        university = scan.nextLine();
        int count = 1;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter " + count + " Subject's Marks :: ");
            marks[i] = scan.nextInt();
            count++;
        }
        // scan.close();
    }

    public void getDetails() {
        int total = 0;
        System.out.println("             Name :: " + name);
        System.out.println("       Birth Date :: " + bDate);
        System.out.println("           Gender :: " + gender);
        System.out.println("      Course Name :: " + course);
        System.out.println("     College Name :: " + college);
        System.out.println("  University Name :: " + university);
        int count = 1;
        int fail = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(count + " Subject's Marks :: " + marks[i]);
            if (marks[i] < 28) {
                fail = 1;
            }
            total = total + marks[i];
            count++;
        }
        System.out.println("Total Of The All Subjects Is :: " + total);
        System.out.println("Percentage Is :: " + (float) (total / 4) + " %");
        if (fail != 0) {
            System.out.println("STATUS :: FAIL!!");
        } else {
            System.out.println("STATUS :: PASS!!");
            if (((float) (total / 4)) < 50) {
                System.out.println("GRADE :: D");
            } else if (((float) (total / 4)) < 60) {
                System.out.println("GRADE :: C");
            } else if (((float) (total / 4)) < 70) {
                System.out.println("GRADE :: B");
            } else {
                System.out.println("GRADE :: A");
            }
        }
    }
}

public class P8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count = 1;
        Marks M[] = new Marks[5];
        for (int i = 0; i < M.length; i++) {
            System.out.println("Student :: " + count);
            M[i] = new Marks();
            M[i].setDetails();
            count++;
        }
        System.out.println("======================================");
        count = 1;
        for (int i = 0; i < M.length; i++) {
            System.out.println("Student :: " + count);
            M[i].getDetails();
            count++;
            System.out.println("======================================");
        }
    }
}
