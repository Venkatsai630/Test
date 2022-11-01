class Palindrome
{
 public static void main(String[]ags)
 {
  int n=151,e,temp=n;
  int reverse=0;
  while(n>0)
  {
   e=n%10;
   reverse = reverse * 10 + e;
   n=n/10;
  }
   System.out.println(reverse);
   if(temp==reverse)
   {
    System.out.print("palindrome");
	}
	else
	{
	 System.out.print("not palindrome");
	 }
 }
} 