/*Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento na última posição do vetor. Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor atualizado na tela.* 
 */
public class Exercicio14 {
    public static void executar(){

    int[] vetor = new int[5];
    System.out.println("Preencha o vetor!");
    for(int i = 0; i<5; i++){
        System.out.println("Posição"+(i+1)+":");
        vetor[i]= Prompt.lerInteiro();
    }
    int maior = vetor[0];
    int maiorp = 0;
    for (int i = 1; i < 5; i++) {
        if (vetor[i] > maior) {
            maior = vetor[i];
            maiorp = i;
        }
    }
    int temp = vetor[4];
    vetor[4] = maior;
    vetor[maiorp] = temp;

    System.out.println("Vetor atualizado:");
    for (int i = 0; i < 5; i++) {
        System.out.print(vetor[i] + " ");
    }

    }
}
