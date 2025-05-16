#include <cstdlib>

typedef struct no{
    int dado;
    struct no *prox;
} Celula;

Celula *inserir(int dado, Celula* lista){
    //alocar memoria
    Celula *novo = (Celula *)malloc(sizeof(Celula));
    //depositar valores que vem do parametro
    novo->dado = dado;
    novo->prox = NULL;

    //testar se é o primeiro elemento a ser inserido
    if(!lista){//(lista==NULL){
        return novo;
    }

    //percorrer a estrutura até o final
    Celula *p;
    for (p = lista; p->prox != NULL; p = p->prox);

    //encadear e retornar
    p->prox = novo;

    return lista;
}
void exibir(Celula *lista){
    for(Celula *p =lista; p != NULL; p = p->prox){
        cout << p->dado << "\t";
    }
    cout<< endl;
}
int contarLista(Celula *lista){
    int total=0;
    for(Celula *p =lista; p != NULL; p = p->prox){
        total++;
    }
    return total;
}
bool estaNaLista(int dado, Celula *lista){
    for (Celula *p = lista; p !=NULL; p = p->prox){
        if(dado == p -> dado){
            return true;
        }
    }

            return false;

}
int contarOcorrencias(int numero, Celula *lista) {
    int contador = 0;
    for (Celula *p = lista; p != NULL; p = p->prox) {
        if (p->dado == numero) {
            contador++;
        }
    }
    return contador;
}
bool estaOrdenada(Celula *lista) {
    if (lista == NULL || lista->prox == NULL) {
        return true;
    }
    for (Celula *p = lista; p->prox != NULL; p = p->prox) {
        if (p->dado > p->prox->dado) {
            return false;
        }
    }
    return true;
}
float calcularMedia(Celula *lista) {
    if (lista == NULL) {
        return 0;
    }
    int soma = 0;
    int cont = 0;

    for (Celula *p = lista; p != NULL; p = p->prox) {
        soma += p->dado;
        cont++;
    }

    return soma / cont;
}






