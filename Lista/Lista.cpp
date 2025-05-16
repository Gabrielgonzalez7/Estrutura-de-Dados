#include <iostream>

using namespace std;

#include "lista.h"

int main(){
    Celula *lista = NULL;
   lista = inserir(5, lista);
    lista = inserir(7, lista);
    lista = inserir(10, lista);
    lista = inserir(12, lista);
    lista = inserir(15, lista);
    lista = inserir(20, lista);

    cout << "Lista contem " << contarLista(lista) << "Elementos\n";
    exibir(lista);

    int numero;
    cout<< "Digite numero para pesquisa: ";
    cin >>numero;

    cout << numero << " Esta na lista?\n" << estaNaLista(numero, lista) << endl;


            //contar ocorrencias de um numero
    int ocorrencias = contarOcorrencias(numero, lista);
    cout << "O numero " << numero << " ocorre " << ocorrencias << " vezes na lista." << endl;

        //verificar se a lista esta ou não ordenada
    if (estaOrdenada(lista)) {
    cout << "A lista esta ordenada em ordem crescente." << endl;
} else {
    cout << "A lista nao esta ordenada." << endl;
}
        //calcular a media dos elementros da lista
    float media = calcularMedia(lista);
cout << "Media dos elementos: " << media << endl;
        //alterar o inserir para controle de duplicados - ou seja, proiba cadastro de duplicados

    return 0;

}
