/*Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais ou superiores à média. */
public class Exercicio01 {
    public static void executar() {

        int[] vetor = new int[5];

        System.out.println("Preencha com valores: ");
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite valor " + (i + 1) + ":");
            vetor[i] = Prompt.lerInteiro();
            soma += vetor[i];
            }
        
            int media = soma/5;

        System.out.println("Média: " + media);

        for(int i = 0; i < 5; i++){
            if(vetor[i] < media){
            System.out.println("valor menor que a média: " + vetor[i]);
        }else if(vetor[i] > media){
            System.out.println("valor maior que a média: " + vetor[i]);
        }else{
            System.out.println("valor igual a média: " + vetor[i]);
        }
    }
        

    }
}
