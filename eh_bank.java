/*"1. Design a class for a simple bank account. The class should have the following features:
  - Instance variables for the account holder's name, account number, and balance.
  - A constructor that allows the user to create an account with a given name, account number, and balance.
  - A method that allows the user to make a deposit to the account.
  - A method that allows the user to make a withdrawal from the account.
  - A method that returns the current balance of the account.
*/


import java.util.*;
class myexception extends Exception
{

}
class eh_bank
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  String acc_name;
  int acc_no;
  int ch=0;
  
  System.out.println("Enter account holders name:");
  acc_name=sc.nextLine();
  System.out.println("Enter the account number:");
  acc_no=sc.nextInt();
  details d=new details(acc_no,acc_name);
  while(ch!=4)
{
  System.out.println("1.Deposite          2.Withdrawal          3.Check balance           4.exit ");
  ch=sc.nextInt();
  switch (ch) 
  {
    case 1:
      d.deposit();
      break;
      case 2:
      d.withdrawal();
      break;
      case 3:
      d.balance();
      break;
      case 4:
      System.exit(0);
      break;
    default:
    System.out.println("Enter the invalid choice!!!");
      break;
  }
}
}
}
class details
{
  Scanner sc=new Scanner(System.in);
  int balance,current_balance=0,dep_amt,with_amt;
  int acc_no;
  String acc_name;
details(int no,String nme)
{
  acc_no=no;
  acc_name=nme;
}
void deposit()
{
  /*System.out.println("enter the acc.no:");
  Acc_no sc=new nextInt();*/
  System.out.println("Enter the ammount to deposit:");
  dep_amt=sc.nextInt();
  current_balance=current_balance+dep_amt;
}
void withdrawal()
{
  try{
  System.out.println("Enter the withdrawal ammount:");
  with_amt=sc.nextInt();
  if(with_amt>current_balance)
  {
    throw new myexception();
  }
  else{
  current_balance=current_balance-with_amt;
  }
  }
  catch(myexception e)
  {
    System.out.println(" SORRY !!!withdrawal amount is greater than current balance.");
  }
}
void balance()
{
  System.out.println("current balance is :"+current_balance);
}
}
