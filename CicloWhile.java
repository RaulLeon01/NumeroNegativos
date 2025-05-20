import java.util.Scanner;

import javax.swing.JOptionPane;

public class CicloWhile {

    //Objeto para leer datos por teclado
    //private static final Scanner ingreso = new Scanner(System.in);

    //Metodo para obtener un numero entero, lo recibe como argumento
    public static int obtenerNumero(String mensaje){
        int numeroTemporal;

        //Entrada para datos por teclado
        String entrada = JOptionPane.showInputDialog(mensaje);
        numeroTemporal = Integer.parseInt(entrada);

        return numeroTemporal;
    }

    //Decision de numeros
    public static void verificarNumero(int numero){
        while (numero <= 0) {
            JOptionPane.showMessageDialog(null, "Numero negativo o cero: " + numero);
            numero = obtenerNumero("Ingresa un numero entero: ");
        }
        JOptionPane.showMessageDialog(null, "Numero positivo: " + numero);
    }

    //Metodo principal main
    public static void main(String[] args){
        int numero = obtenerNumero("Ingresa un numero entero: ");

        //Llamada al metodo de verificacion
        verificarNumero(numero);

    }

}