import java.util.Scanner;

public class Area {
    Scanner sc=new Scanner(System.in);
    void circle(){
         System.out.println("Enter radius:");
         int radius=sc.nextInt();
         System.out.println("Area of this circle is :"+2*3.14*radius);
    }
    void rectangle(){
        System.out.println("Enter Length:");
         int length=sc.nextInt();
         System.out.println("Enter breadth:");
         int breadth=sc.nextInt();
         System.out.println("Area of this rectangle is :"+length*breadth);
    }
    void square(){
        System.out.println("Enter length:");
        int length=sc.nextInt();
        System.out.println("Area of this square is :"+2*length);
    }
    void triangle(){
        System.out.println("Enter height:");
        int height=sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth=sc.nextInt();
        System.out.println("Area of this triangle is :"+1/2*breadth*height);
    }
}
