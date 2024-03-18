/* Faça um programa que leia em um vetor uma sequência finita de números digitados pelo usuário. Crie um segundo vetor que armazene o dobro de cada número doprimeiro vetor e depois apresente os valores deste vetor. */
public class Exercicio03 {
    public static void executar(){
     
        System.out.println("Informe um tamanho finito para o vetor: ");
        int tamanho = Prompt.lerInteiro();
        int[] vetor = new int[tamanho];

        int[] vetor2 = new int[tamanho];

        for(int i = 0; i < tamanho; i++)
        {
            System.out.println("valor" + (i+1)+":");
            vetor[i]= Prompt.lerInteiro();
        }       

        System.out.println("Vetor 1 ");
        System.out.println("----------------------------");

        for(int i = 0; i < tamanho; i++)
        {
            System.out.println("Posição "+(i+1)+":"+vetor[i]);
        }
        System.out.println("Vetor 2 ");
        System.out.println("----------------------------");

        
        for(int i = 0; i < tamanho; i++)
        {
            System.out.println("Posição "+(i+1)+":"+(vetor[i]*2));
            
        }       


}
  }