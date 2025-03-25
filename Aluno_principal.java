package Trabalho1;

import java.util.*;

public class Aluno_principal {
    public static void main(String[] args) {
        Set<String> emailsGerados = new HashSet<>();
        List<Map<String, String>> listaDados = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Nomes nome = new Nomes();
            String email = nome.gerarEmail(emailsGerados);
            listaDados.addAll((Collection<? extends Map<String, String>>) Map.of(nome.nomes, email));
        }

        System.out.println("Lista de nomes e e-mails gerados:");
        listaDados.forEach(par -> par.forEach((nome, email) ->
            System.out.println("Nome: " + nome + " | E-mail: " + email))
        );
    }
}