import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5,-6,15,50,8,4};
        int cont = 0;
        
        while(cont < (vetor.length)){
            System.out.println(vetor[cont]);
            ++cont;
        }
        
        System.out.println("Ordem Inversa");

        for(int i= (vetor.length-1); i >= 0; --i){
            System.out.println(vetor[i]);
        }

    }
}