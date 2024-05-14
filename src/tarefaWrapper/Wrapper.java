package tarefaWrapper;

public class Wrapper {

	public static void main(String[] args) {
		
		//Boxing
		
		Integer i = 20;
		System.out.println(i);
		
		Long l = Long.valueOf(30);
		System.out.println(l);
		
		//Casting Implicitp
		
		byte b = 8;
		double d = b;
		System.out.println(b);
	}	
}