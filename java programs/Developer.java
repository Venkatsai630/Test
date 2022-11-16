class Developer
{
int a=30000;
}
class Tester extends Developer
{
int b=20000;
public static void main (String[]args){
Tester t=new Tester();
System.out.println(t.a);
System.out.println(t.b);
}
}
