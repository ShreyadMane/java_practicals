class rect
{
   int length,width;
   void getdata(int a,int b)
  
   {
	  length= a;
	  width= b;
   }
   int recarea()
   {
	   int area=length*width;
	   return (area);
	   
   }
}
class rectarea1
{
	public static void main(String a[])
	{	int area1;
		rect rect1=new rect();
		rect1.length=10;
		rect1.width=10;
		area1=rect1.length*rect1.width;
	    System.out.println("Area1="+area1);
	}
}
