class books
{
String bookname;
String author;
int pages;
float price;
void getdata(String a,String b,int c,float d)

{
 bookname=a;
 author=b;
 pages=c;
 price=d;
 
}
void putdata()
{
System.out.println("bname="+bookname);
System.out.println("author="+author);
System.out.println("pages="+pages);
System.out.println("price="+price);
}
public static void main(String a[])
{
books r=new books();
r.getdata("samidha","sadhana Aamate",1,1);
r.putdata();
}
}
