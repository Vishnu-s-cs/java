import java.util.Scanner;

public class Grades {

  public static void main(String[] args) {
    try (Scanner hi = new Scanner(System.in)) {
      System.out.println("Enter written test score out of 70: ");
      int wt= hi.nextInt(); 
      System.out.println("Enter lab test score out of 20: ");
      int lt= hi.nextInt();
      System.out.println("Enter assignment score out of 10: ");
      int as= hi.nextInt();
     int grade = ((wt*70)/100)+((lt*20)/100)+((as*10)/100);
     System.out.println("your grade is "+grade);
      

      
    }
  }
}