#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.util.Calculadora;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int resultado = Calculadora.sumar(5,8);
        System.out.print("Resultado:" + resultado);
    }
}
