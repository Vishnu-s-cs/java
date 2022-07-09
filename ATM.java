import java.util.Scanner;

/**
 * ATM
 */
public class ATM {
    int balance = 10000;
    Scanner sc=new Scanner(System.in);
    void checkBalance()
    {
        System.out.println("Your blance is Rs."+balance);
    }
    void Withdraw()
    {
        System.out.println("Enter Amount for withdraw:");
        int amount=sc.nextInt();
        if (amount<balance) {
            balance=balance-amount;
            System.out.println("Kindly collect your money from tray and take out yout fuckin card from the machine ;-)"); 
        }
        else{
            System.out.println("Sorry! Not Enough Blance");
        }
       
    }
    void Deposit(){
        System.out.println("Enter amount you want to deposit:");
        int amount=sc.nextInt();
        System.out.println("Put money on the tray \n did you? (y/n):");
        char res=sc.next().charAt(0);
        if (res=='y') {
            
            System.out.println("Oh shit! money got stuck in the tray and teared off, are you scared?(y/n) ");
            char res2=sc.next().charAt(0);
            if (res2=='y') {
                System.out.println("Ha ha it was just prank the amount credited succesfully to your account");
                
            } else {
                System.out.println("You got it it was just prank the amount credited succesfully to your account ");
            }
            balance=balance+amount;
        }
        else{
            System.out.println("Hello");
        }
    }
}