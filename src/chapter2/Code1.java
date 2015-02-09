package chapter2;

public class Code1 {
	
	public static void main(String[] args)
	{
		String[] greeting = new String[3];
		greeting[0] = "Welcome To Core Java";
		greeting[1] = "My name is Wangshengzhong!";
		greeting[2] = "This is My Restudy!";
		
		for(String s : greeting)
		{
			System.out.println(s);
		}
	}

}
