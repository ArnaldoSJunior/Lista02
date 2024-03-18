/*Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero */
public class Exercicio02 {
public static void executar(){

  System.out.println("Informe um tamanho finito para o vetor: ");
  int tamanho = Prompt.lerInteiro();
  int[] vetor = new int[tamanho];

  System.out.println("Digite o valor do vetor: ");

  for(int i = 0; i < tamanho; i++){
      System.out.println("valor" + (i+1)+":");
      vetor[i]= Prompt.lerInteiro();
  }
    
  for(int i = 0; i < tamanho; i++){
    System.out.println("Posição "+(i+1)+":"+vetor[i]);
    if(vetor[i] > 0 ){
        System.out.println("Número positivo!");
    }else if(vetor[i] < 0){
        System.out.println("Número negativo!");
    }else{
        System.out.println("Igual a zero!");
    }
  }

}   
}
