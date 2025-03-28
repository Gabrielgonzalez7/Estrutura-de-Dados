package aula_28_03;

import java.util.Objects;

public class Aluno {
public int matricula;
public String nome;
public String email;


public Aluno(int matricula, String nome) {
	this.matricula = matricula;
	this.nome = nome;
	this.email = this.gerarEmail();
}

public String gerarEmail() {
	String vetorNome[];
	vetorNome = this.nome.toLowerCase().split(" ");
	return vetorNome[0] + "." + vetorNome[vetorNome.length - 1] +"@unf.edu.br";
}



@Override
public String toString() {
	return "Aluno [matricula=" + matricula + ", nome=" + nome + ", email=" + email + ", gerarEmail()=" + gerarEmail()
			+ ", hashCode()=" + hashCode() + "]";
}

@Override
public int hashCode() {
	return Objects.hash(email);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluno other = (Aluno) obj;
	return Objects.equals(email, other.email);
}





}
