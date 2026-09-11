package OOPs_Classes_ObjectsAssignment_4;

public class ElectricityBill2 {
int consumerNo;
String consumerName;
int units;
 
  ElectricityBill2(int consumerNo,String consumerName,int units){
	this.consumerNo =consumerNo;
	this.consumerName = consumerName;
	this.units = units;
}
   void display() {
	   System.out.println("Enter the consumer Number : ");
	   System.out.println("Enter the consumer Name : ");
	   System.out.println("Enter the units : ");
	   
	   
   }
   void calculateBill() {
	   int bill =0;
	   if(units <= 100) {
		   bill = units*2;
	   }
	   else if(units <= 200) {
		   bill = (100*2)+(units-100)*3;
	   }
	   else if(units<=300) {
		   bill = (100*2)+(100*3)+(units*5);
	   }
	   else {
		   bill = (100*2)+(100*3)+(100*5)+(units-300)*7;
	   }
	   System.out.println("total bill " +bill);
	   
   }
}
