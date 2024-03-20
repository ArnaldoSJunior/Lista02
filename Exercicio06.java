public class Exercicio06 {
    public static void executar(){
     
     double[] vetor = new double[5];
     int[] peso = new int[5];
     
     System.out.println("Informe suas notas!");
     for(int i = 0; i < 5; i++){
        System.out.println("Nota"+(i+1)+":");
        vetor[i] = Prompt.lerDecimal();
        System.out.println("Peso:");
        peso[i] = Prompt.lerInteiro();
     }

    double multi = 0;
    int pesos = 0;

    for(int i = 0; i < 5; i++){
        multi += vetor[i] * peso[i];
        pesos += peso[i];
      }
    
     double mediap = multi/pesos;
      System.out.println("A média ponderada é:" + mediap);
}
   }