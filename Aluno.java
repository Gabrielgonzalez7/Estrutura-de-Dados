package Trabalho1;
import java.util.Set;
import java.util.Scanner;

public class Aluno {
	public String nome;
		Scanner sc = new Scanner(System.in);
		String vetorNome[];
		String email;
	
	public String geradorEmail(Set<String> emailExiste) {
		System.out.println("Nome Completo: ");
		nome = sc.nextLine();
		nome = nome.toUpperCase();
		vetorNome = nome.split(" ");
		
		
		//gerador de email:
		
		String BaseEmail = vetorNome[0] + "." +vetorNome[vetorNome.length -1] + "@ufn.edu.br";
		BaseEmail = BaseEmail.toLowerCase();
		
		//Em caso de repetir:
		
		
		email = BaseEmail;
		int contador = 1;
		while(emailExiste.contains(email)) {
			email = BaseEmail.replace("@ufn.edu.br", "") + contador +"@ufn.edu.br";
			contador++;
			
		}
		emailExiste.add(email);
	System.out.println("Email gerado: "+ email );
	return email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
