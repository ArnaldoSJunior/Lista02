/*Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840 */
public class Exercicio12 {
   public static void executar(){
    
   int[] vetor = new int[12];

   System.out.println("Preencha o vetor: ");
   for(int i = 0; i < 12; i++ ){
    System.out.println("Posição"+(i+1)+":");
    vetor[i]=Prompt.lerInteiro();
    }
    
    for(int i = 0; i < 12; i++ ){
    System.out.println(vetor[i]);
    }
    
    

    int produto = 1;
    for(int i= 0; i<12; i++){
        if( vetor[i] != 0 && vetor[i] % 2 == 0 && vetor[i] > 0){
         produto *= vetor[i];
        }
    }
    System.out.println("O produto dos elementos pares positivos é: " + produto);



   } 
}
