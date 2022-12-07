public class ListaVetor {
    private final Integer[] dados = new Integer[10];
    int tamanhoLista = 10; //TAMANHO PRE-DEFINIDADO DA LISTA
    int quantidade = 0; //QUANTIDADE DE ELEMENTOS NA LISTA





    public boolean listaCheia(){ //CHECA SE A LISTA ESTA CHEIA
        if( quantidade>=tamanhoLista){
            System.out.println("lista cheia");
        }
        return false;
    }


    public boolean listaVazia() {//CHECA SE A LISTA ESTA VAZIA
        if (quantidade == 0){
            System.out.println("lista vazia");
        }
        return false;
    }
    public void InserirNaPosicao(int posicao, int valor){//INSERI O OBJETO NA POSIÇÃO ESCOLHIDA
        if(listaCheia()){
            System.out.println("lista ja ta cheia");
        }else{
            if(dados[posicao] != null){
                System.out.println("essa posição ja esta ocupada");
                System.out.println("se deseja inserir nesta posição mesmo \n Insirir na posição usar o metodo obterEModificar");
            }else{
                dados[posicao] = valor;
            }
        }

        quantidade ++;
    }
    public void removerElementoNaPosicao(int posicao){ //REMOVE O ELEMENTO DE UMA POSIÇÃO ESCOLHIDA
        if(listaVazia()){
            System.out.println("lista esta vazia");
        }else{
            dados[posicao] = null;
            quantidade --;
        }


    }
    public void obterEModificar(int posicao, int valor){ //OBTEM UM ELEMENTO DE UMA DETERMINADO POSIÇÃO E ALTERA O VALOR
        if(listaVazia()){
            System.out.println("lista vazia");
        }else{
            System.out.println(dados[posicao]);
            removerElementoNaPosicao(posicao);
            dados[posicao] = valor;
            System.out.println(dados[posicao]);
            System.out.println("elemento foi modificado");
            quantidade ++;
        }

    }


    public static void main(String[] args) {
        ListaVetor lista = new ListaVetor();
        lista.listaVazia();
        System.out.println(lista.quantidade); //CHECANDO O TAMANHO
        lista.InserirNaPosicao(1,11);
        lista.InserirNaPosicao(2,10);
        lista.InserirNaPosicao(3,9);
        lista.InserirNaPosicao(4,8);
        System.out.println(lista.quantidade); //CHECANDO O TAMANHO POS ADICIONAR 4 ELEMENTOS
        System.out.println(lista.dados[1]); //MOSTRANDO O ELEMENTO NA POSIÇÃO
        System.out.println(lista.dados[2]);//MOSTRANDO O ELEMENTO NA POSIÇÃO
        System.out.println(lista.dados[3]);//MOSTRANDO O ELEMENTO NA POSIÇÃO
        System.out.println(lista.dados[4]);//MOSTRANDO O ELEMENTO NA POSIÇÃO
        lista.removerElementoNaPosicao(3);//REMOVENDO O ELEMENTO DA POSIÇÃO
        System.out.println(lista.dados[3]);// CONFERINDO SE ELE FOI REMOVIDO
        System.out.println(lista.quantidade);//CONFERINDO SE O TAMANHO ATUALIZOU
        lista.obterEModificar(2,5);//OBTENDO E MODIFICANDO O ELEMENTO
        System.out.println(lista.quantidade); //CHECANDO SE NÃO MUDOU O TAMANHO JA QUE REMOVEU MAIS ADICIONOU DE NOVO

    }

}
