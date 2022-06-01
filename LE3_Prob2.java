abstract class AbsTest implements TestTable{

}
public class Main
{
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
	}
}
class Test implements TestTable{
    public void display(){
        System.out.println("In class Test");
    }
}
interface TestTable{
    void display();
}