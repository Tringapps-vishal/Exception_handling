
/*"3. Design a class for a student at a school. The class should have the following features:
         - Instance variables for the student's name, grade level, and GPA.
         - A constructor that allows the user to create a student with a given name, grade level, and GPA.
         - A method that allows the user to update the student's GPA.
         - A method that returns the student's name and GPA as a string (e.g. ""John Doe has a 3.5 GPA"")."*/
import java.util.*;

class myexception extends Exception {

}

class eh_student {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    String name, grade;
    try {
      System.out.println("-------NEW STUDENT DETAILS-----");
      System.out.print("Enter your name:");
      name = sc.nextLine();
      System.out.print("Enter your grade:");
      grade = sc.nextLine();
      if (grade.length() >= 2) {
        throw new myexception();
      }
      cal a = new cal(name);
      System.out.println(a.calgpa(grade));
      a.upgpa();
    } catch (myexception e) {
      System.out.println("Eneter a single character in CAPS letters");
    }
  }
}

class cal {
  int gpa = 0;
  String name, grade;
  Scanner sc = new Scanner(System.in);

  cal(String name) {
    this.name = name;
    System.out.println("Details added successfully!!!");
  }

  String calgpa(String grade) {
    switch (grade) {
      case "A": {
        gpa = 4;
      }
        break;
      case "B": {
        gpa = 3;
      }
        break;
      case "C": {
        gpa = 2;
      }
        break;
      case "D": {
        gpa = 1;
      }
        break;
      default:
        System.out.println("Enter the valid grade A to D");
        break;
    }
    return name + " has " + gpa + " GPA.";
  }

  public void upgpa() {

    int ch;

    Scanner sc = new Scanner(System.in);
    System.out.println("Do you need to update your grade YES=1   NO=0");
    ch = sc.nextInt();
    if (ch == 1) {
      gpa = 0;
      System.out.print("Enter your new grade: ");
      String newgrade = sc.next();
      System.out.println(calgpa(newgrade));
    }
    // else
    // System.exit(0);
  }

}
