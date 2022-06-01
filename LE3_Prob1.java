class arjun extends qualities{
    void obey()
    {
        System.out.println("obedient");
    }
    
    void kind()
    {
        System.out.println("kind");
    }
} 
class duryodhan extends qualities{
    void obey()
    {
        System.out.println("Not obedient");
    }
    
    void kind()
    {
        System.out.println("Not kind");
    }
} 
abstract class qualities{
    void fight()
    {
        System.out.println("All bharatvanshis are fighters");
    }
    
    abstract void obey();
    abstract void kind();
}

public class Main
{
	public static void main(String[] args) {
		arjun a = new arjun();
	    duryodhan d = new duryodhan();
		
		a.fight();
		a.obey();
		a.kind();
		
		d.fight();
		d.obey();
		d.kind();
	}
}