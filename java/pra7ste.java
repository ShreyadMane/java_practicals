import java.util.*;
class pra7ste
{
public static void main(String a[])
{
int length;
int count;
Scanner sc=new Scanner(System.in);
System.out.println("Enter count");
count=sc.nextInt();
System.out.println("Enter length");
length=sc.nextInt();
while(count<=6)
{
if(length>=100)

{
length=length-2;
}
else
{
length=count*length;

}
count=count+1;

}
System.out.println("length"+length);

}
}