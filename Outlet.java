import java.util.Scanner;

public class Outlet {
    public static void main(String[] args) {
        ATM a=new ATM();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("What can i do for you:");
            System.out.println("1.Check balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("Press any other shit to exit");
            System.out.print("Enter your wish number:");
            int ch= sc.nextInt();
            switch(ch)
            {
                case 1:a.checkBalance();
                break;
                case 2:a.Withdraw();
                break;
                case 3:a.Deposit();
                break;
                default:System.exit(0);
            }
        }
       
    }
}
