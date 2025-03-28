package aula_28_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		Aluno tmp;
		String nome;
		int matricula = 1;
		String opcao;
		
		while(true) {
			System.out.println("Digite nome: ");
			nome = teclado.nextLine();
			tmp = Aluno(matricula, nome);
			if(alunos.contains(tmp)) {
				System.out.println("Aluno com este email já cadastrado!");
			} else {
				alunos.add(tmp);
				matricula++;
			}
			System.out.println("Continua? (1-sim; Outra tecla - Não)");
			opcao = teclado.nextLine();
			if(!opcao.equals(null)) {
				break;
			}
			
			alunos.sort(Comparator.comparing(aluno -> aluno.nome));
			
			System.out.println("Relação aluno ");
			for(Aluno aluno : alunos) {
				System.out.println(aluno);
				
			}
		}
	}

	
	
	private static Aluno Aluno(int matricula, String nome) {
		return null;
	}

}
