package com.fernandopaniagua.pruebas.util;

/**
 * Esta clase implementa una calculadora de <a href="https://es.wikipedia.org/wiki/N%C3%BAmero_entero">números enteros</a>
 *
 * @author Fernando Paniagua
 * @since 1.0
 * @see java.util.List
 */
public class Calculadora {
    /**
     * Suma dos números enteros
     * @param s1 Primer sumando
     * @param s2 Segundo Sumando
     * @return Resultado de la suma
     */
    public static int sumar(int s1, int s2) {
        //Se utiliza el operador + para sumar los números enteros
        return s1 + s2;
    }
    public static int restar(int r1, int r2) {
        return r1 - r2;
    }
    public static int multiplicar(int m1, int m2) {
        return m1 * m2;
    }

    /**
     * Divide ....
     * @param d1 ....
     * @param d2 ...
     * @return ...
     */
    public static int dividir(int d1, int d2) {
        return d1 / d2;
    }
}
