package tarefaWrapper;

public class Wrapper {

	public static void main(String[] args) {
		
		//Boxing
		
		int idade = 20;
		Integer novaIdade = Integer.valueOf(idade);
		System.out.println(novaIdade);
		
		long codigo = 5050117l;
		Long novoCodigo = Long.valueOf(codigo);
		System.out.println(novoCodigo);
		
		//Casting Implicitp
		
		byte b = 8;
		double d = b;
		System.out.println(b);
	}	

}