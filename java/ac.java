class ac
{
  int ac_no;
  String name;
  double balance;
  void getdata(int a,String s,double d)
  {
  ac_no=a;
  name=s;
  balance=d;
  
  }

void putdata()
{
System.out.println("ac="+ac_no);
System.out.println("name="+name);
System.out.println("balance="+balance);
}
public static void main(String a[])

{
ac ab=new ac();
ab.getdata(1,"shreya",123);
ab.putdata();
}
}