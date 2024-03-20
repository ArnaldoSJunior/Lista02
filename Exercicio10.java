/*. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é oúltimo elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assimpor diante */
public class Exercicio10 {
    public static void executar(){

    int[] vetora = new int[5];
    int[] vetorb = new int[5];

    System.out.println("Preencha vetor A:");
        for(int i = 0; i<5; i++){
            System.out.println("Posição"+(i+1)+":");
            vetora[i]= Prompt.lerInteiro();
        }
    for(int i = 0; i <5; i++){
        vetorb[i] = vetora[4-i];
    }
       
    for(int i = 0; i <5; i++){
    System.out.println(vetorb[i]+" ");
     }

    }
}
