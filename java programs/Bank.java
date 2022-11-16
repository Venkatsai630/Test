class Bank {
int getinterest (){
return 0;}
}
class SBI extends Bank {
int getinterest(){
return 8;}
}
class HDFC extends Bank{
int getinterest(){
return 11;}
}
class ICICI extends Bank{
int getinterest(){
return 7;}
}
class AXIS extends Bank {
int getinterest(){
return 9;}
}
class Test_Bank{
public static void main (String[]args)
{
SBI s=new SBI();
System.out.println("SBI rate of interest:"+s.getinterest());
AXIS a=new AXIS();
System.out.println("AXIS rate of int:"+a.getinterest());
ICICI i=new ICICI();
System.out.println("ICICI rate of interest:"+i.getinterest());
HDFC h=new HDFC();
System.out.println("HDFC rate of interest:"+h.getinterest());
}
}