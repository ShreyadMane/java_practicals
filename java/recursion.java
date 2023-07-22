class factorial
{
   int a( int n)
   {
	   int result;
	   if(n==1)
		   return(1);
	   result=a(n-1)*n;
	   return(result);
   }
 
  
}

class recursion
{
   public static void main(String args[])
{
   factorial f=new factorial();
   System.out.println("Factorial of 3 is::" +a(3));
  
}
}
