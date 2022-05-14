package week1.day1;

public class Car {
	public void applyBreak()
	{
		System.out.println("**Break is applied successfully**");
		
	}
	public void applyGear()
	{
		System.out.println("^^ Gear is applied ^^");
		
	}
	public void switchonAc()
	{
		System.out.println("** AC is switched on **");
		
	}
	public void applyAcclerate()
	{
		System.out.println("<< Speed is increased >>");
	}
	


	public static void main(String[] args) {
		Car obj1=new Car();
		obj1.applyBreak();
		obj1.applyGear();
		obj1.switchonAc();
		obj1.applyAcclerate();
		// TODO Auto-generated method stub

	}

}

