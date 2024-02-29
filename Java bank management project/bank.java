import java.util.*;
interface methods{
    int deposit(int amount);
    int withdraw(int wamount);
    int balance();
}
class account implements methods
{
    int balance=0,account_number,amount,wamount,btemp;
    String name;
    public account(String name,int account_number,int amount)
    {
        this.name=name;
        this.account_number=account_number;
        this.amount=amount;  
    }
    public account(String name,int account_number,int amount,int wamount,int balance)
    {
        this.name=name;
        this.account_number=account_number;
        this.amount=amount;
        this.wamount=wamount;
        this.btemp=balance;
    }
    public int deposit(int amount)
    {
        balance+= amount;
        System.out.println("Dear "+this.name+" Your SB A/C "+this.account_number+" Credited for Rs. "+this.amount);
        return balance;
    }
    public int withdraw(int wamount)
    {
        if(btemp!=0)
        {
            btemp-=wamount;
            System.out.println("Dear "+this.name+" Your SB A/C " +this.account_number+" Debited for Rs. "+this.wamount);
        }
        else
        {
            System.out.print("Insufficient Balance, cannot withdraw the amount required.");
        }
        return btemp;
    }
    public int balance()
    {
        return balance;
    }
     
}
public class bank
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int wamount;
        System.out.println("WELCOME");
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter account number: ");
        int account_number=sc.nextInt();
        int temp=0;
        System.out.println("Enter deposit amount: ");
        int amount=sc.nextInt();
        methods obj=new account(name,account_number,amount);
        int btemp=obj.deposit(amount);
        System.out.println("Enter withdraw amount: ");
        wamount=sc.nextInt();
        obj=new account(name,account_number,temp,wamount,btemp);
        int newbal=obj.withdraw(wamount);
        System.out.println("Would you like to check your balance(Y/N): ");
        char c=sc.next().charAt(0);
        if(c=='Y'|| c=='y')
        {
            System.out.println("Dear "+name+" your balance amount is: "+newbal);
        }
        else{
            System.out.println("THANK YOU");
        }



    }
}