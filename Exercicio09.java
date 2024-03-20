public class Exercicio09 {
    public static void executar(){

        int[] vetora = new int[5];
        int[] vetorb = new int[5];
        int[] vetorc = new int[5];

        System.out.println("Preencha vetor 1: ");
            for(int i= 0; i<5; i++){
               System.out.println("Posição" +(i+1)+":");
               vetora[i] = Prompt.lerInteiro();
            }
        System.out.println("Preencha vetor 2: ");
            for(int i= 0; i<5; i++){
              System.out.println("Posição" +(i+1)+":");
              vetorb[i] = Prompt.lerInteiro();
          }
        
        
        for(int i= 0; i<vetora.length; i++){
        if( i %2 == 0){   
            vetorc[i] = vetora[i];
        }else{
            vetorc[i] = vetorb[i];
        }
     }
        System.out.print("Vetor C:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Posição"+(i+1)+":"+vetorc[i]);
      }

 } 
}