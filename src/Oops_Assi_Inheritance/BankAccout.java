package Oops_Assi_Inheritance;

 class BankAccount{
	 long accountNo;
	 String CustomerName;
	 long balance;
	 static String bankName ="SBI";
	 
	 BankAccount(long accountNo,String CustomerName,long balance){
		 this.accountNo =accountNo;
		 this.CustomerName =CustomerName;
		 this.balance =balance;
		 
	 }
	 void display3() {
		 System.out.println("BankAccount Number " +accountNo );
		 System.out.println("Customer Name  " +CustomerName );
		 System.out.println("Bank balance  " +balance );
		 System.out.println("bankName  " +bankName );
		  } 
 }
 
 
    class SavingAccount extends BankAccount{
    	double intrestrate;
    	SavingAccount(long accountNo,String CustomerName,long balance,double intrestrate){
    		super( accountNo, CustomerName, balance);
    		this.intrestrate=intrestrate;
    	}
    	
    	 void calculateIntrest() {
    		 intrestrate  = (balance *122 *7)/100;
    		 System.out.println("Intrest rate is " + intrestrate);
    	 }
    	 void display4() {
    		 super.display3();
    		 System.out.println("Intrest rate is " + intrestrate);
    		 System.out.println("bankName  " +bankName );
    		 
    		 }
    }
    
     class CurrentAccount extends BankAccount{
    	 long minimumBalance =20000;
    	 CurrentAccount(long accountNo,String CustomerName,long balance,long minimumBalance){
    		 super( accountNo, CustomerName, balance);
    		 this.minimumBalance =minimumBalance;
    	 }
    	 void checkMinimumBalance() {
    		 if(balance >= minimumBalance) {
    			 System.out.println("Account is maintaining minimum balance");
    	        } else {
    	        System.out.println("Account is not maintaining minimum balance");	
    		 }
    	 }
    	 
     }

public class BankAccout {

	public static void main(String[] args) {
		System.out.println("Enter details ");
		SavingAccount s1 =new SavingAccount(93026704,"Abhay",800000,7.0);
		s1.display4();
		CurrentAccount c1 =new CurrentAccount(93029704,"Abhaay",80000,20000);
		c1.display3();
	}
	
	
	
}
