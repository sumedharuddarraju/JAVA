class Encapsulate
{
	private String name;
	private int roll;
	private int age;

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public int getRoll()
	{
		return roll;
	}
	public void setAge(int newAge)
	{
		age = newAge;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setRoll(int newRoll)
	{
 		roll = newRoll;
	}
}

public class Encapsulation_Demo
{
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		obj.setName("Adhvik");
		obj.setAge(10);
		obj.setRoll(7);
		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge());
		System.out.println("Roll: " + obj.getRoll());
}
}
