/*Faça um programa que leia dois vetores de 5 elementos cada e verifique se elessão iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem coincidir. */
public class Exercicio07 {
    public static void executar(){

    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];
        
    System.out.println("Preencha vetor 1: ");
        for(int i= 0; i<5; i++){
           System.out.println("Posição" +(i+1)+":");
           vetor1[i] = Prompt.lerInteiro();
        }
    System.out.println("Preencha vetor 2: ");
        for(int i= 0; i<5; i++){
          System.out.println("Posição" +(i+1)+":");
          vetor2[i] = Prompt.lerInteiro();
      }
    
    boolean iguais = true;
    for(int i=0; i<5; i++){  
    if(vetor1[i] != vetor2[i]){
        iguais = false;
        break;}
}
    if(iguais){
    System.out.println("Iguais!");
  } else{
    System.out.println("Difrentes!");
  }


    }
}
