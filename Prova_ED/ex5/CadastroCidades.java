package Prova_ex6;
import java.util.*;
public class CadastroCidades {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Cidade> cidades = new HashSet<>();

while (true) {
            System.out.println("Escolha uma opcção: ");
            System.out.println("1: Cadastrar uma cidade: ");
            System.out.println("2: Listar as cidades: ");
            System.out.println("3: Pesquisar as cidades: ");
            System.out.println("4: Remover as cidades: ");
            System.out.println("5: Finalizar o programa: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
 switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da cidade:   ");
                    String nome = scanner.nextLine().toUpperCase();
                    System.out.println("Digite a sigla do Estado:  ");
                    String estado = scanner.nextLine().toUpperCase();
                    cidades.add(new Cidade(nome, estado));
                    break;

                case 2:
                    System.out.println("Cidades cadastradas: ");
                    List<Cidade> listaCidades = new ArrayList<>(cidades);
                    listaCidades.sort(Comparator.comparing(c -> c.nome));
                    for (Cidade cidade : listaCidades) {
                        System.out.println(cidade);
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome da cidade que procura : ");
                    String nomePesquisa = scanner.nextLine().toUpperCase();
                    Cidade cidadeEncontrada = null;
                    for (Cidade cidade : cidades) {
                        if (cidade.nome.equals(nomePesquisa)) {
                            cidadeEncontrada = cidade;
                            break;
                        }
                    }
                    if (cidadeEncontrada != null) {
                        System.out.println("Cidade: " + cidadeEncontrada.nome + " - Estado: " + cidadeEncontrada.sigla_estado);
                    } else {
                        System.out.println(" Cidade não encontrada!!");
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome da cidade que deseja remover: ");
                    String nomeRemover = scanner.nextLine().toUpperCase();
                    cidades.removeIf(c -> c.nome.equals(nomeRemover));
                    System.out.println("Cidade removida!!!");
                    break;

                case 5:
                    System.out.println("Até logo, Neni!!");
                    return;
            }
        }
    
}


}
