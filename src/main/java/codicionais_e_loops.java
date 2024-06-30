
public class codicionais_e_loops {

    public static void main(String[] args) {

        // if else
        //Controla o fluxo do programa  exemplo:

        if(true){   // true o programa printa Valor 1 e se false ele printa Valor 2
            System.out.println("1");
        } else {
            System.out.println("2");
        }


        System.out.println("======== Operadores Lógicos ========");

        // Utilizamos operadores Lógicos
        //> Maior
        //< Menor
        //>= Maior ou igual
        //<= Menor ou Igual
        //== Estritamente Igual
        //!= Estritamente Diferente

        if(1 >= 2){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // quando comparamos if(1 <= 2) o resultado será Verdadeiro pois o valor uma das comprações é verdadeira
        // entao se uma for verdadeira o resultado será verdadeiro
        // portanto se fizermos if(1 >= 2)  o resultado será Falso por que as duas comparações sao Falsas

        // for ==================================
        // Neste codigo i recebe o valor 0 e enquanto i for menor que 10 incrementa +1
        // desta forma o sistema incrementa até o numero 9
        // se mudar o codigo para  i>=10 aí sim irá incrementar ate o numero 10
        for (int i =0; i<=10; i++){
            System.out.println(i);
        }

        //while

        // do while

        // Switch case

    }

}
