package AplicacionJava;

/**
 *
 * @author informatica
 */
public class AplicacionJava {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
    
        int numeroMax = 500;//Esta variable muestra el número máximo de veces que se ejecutará el bucle encontrando los números pares
        int cont = 0;//Esta variable muestra la cantidad de numeros pares que va mostrando el programa
        for(int i = 0; i < numeroMax; i++){
            if(i % 2 == 0){
                System.out.println("El número par "+cont+" es: "+i);
                cont++;
            }
        }
    }
}
