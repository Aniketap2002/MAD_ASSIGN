public class Mother
{
  static void show()
  {
      System.out.println("Mother is Called");
  }
}

public class Child extends Mother
{
   static void show()
    {
        System.out.println("Child is called");
    }     
}

public class Main
{
	public static void main(String[] args)
	{
	   Mother m=new Mother();
	   m.show();
	   Child c=new Child();
	   c.show();
	   Mother m1=new Child();
	   m1.show();
	}
}
