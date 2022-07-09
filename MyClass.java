import java.util.Scanner;

public class MyClass extends Area{
    void circle(){
        super.circle();
    }
    void square(){
        super.square();
    }
    void rectangle(){
        super.rectangle();
    }
    void triangle(){
        super.triangle();
    }
    public static void main(String[] args) {
        MyClass mc=new MyClass();
        Scanner ch=new Scanner(System.in);
        while(true){
        System.out.println("Enter your Choice");
        System.out.println("1.Circle\n2.Square\n3.Rectangle\n4.Triangle");
        int choice = ch.nextInt();
        switch(choice)
        {
            case 1:mc.circle();
            break;
            case 2:mc.square();
            break;
            case 3:mc.rectangle();
            break;
            case 4:mc.triangle();
            break;
            default:System.exit(0);

        }
        
    }
}
}