package operaciones;

/**Operaciones
 * 
 * @author Julen Urlezaga
 * @version 1.0
 */
public class Operaciones{
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * Operaciones sumar
     * @param valor1 (1.er numero introducido)
     * @param valor2 (2.er numero introducido)
     * @param numero
     * @return valor1+valor2=numero
     */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * Operaciones restar
     * @param valor1 (1.er numero introducido)
     * @param valor2 (2.er numero introducido)
     * @param numero
     * @return valor1-valor2=numero
     */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * Operaciones multiplicar
     * @param valor1 (1.er numero introducido)
     * @param valor2 (2.er numero introducido)
     * @param numero
     * @return valor1*valor2=numero
     * @throws ArithmeticException
     */
    
    public int dividir (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * Operaciones dividir
     * @param valor1 (1.er numero introducido)
     * @param valor2 (2.er numero introducido)
     * @param numero
     * @return valor1/valor2=numero
     */
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
    /**
     * Operaciones resto
     * @param valor1 (1.er numero introducido)
     * @param valor2 (2.er numero introducido)
     * @param numero
     * @return valor1 % valor2=numero
     */
}