package Prova_ex6;

import java.util.Objects;

public class Cidade {
	public String nome;
	public String sigla_estado;
	public Cidade(String nome, String sigla_estado) {
		this.nome = nome;
		this.sigla_estado = sigla_estado;
	}
	
	@Override
	public String toString() {
		return "Cidade [Nome da cidade: " + nome + ", Sigla do estado: " + sigla_estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sigla_estado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sigla_estado, other.sigla_estado);
	}
	
}

