import java.util.Scanner;

public class CicloWhile {

    //Objeto para leer datos por teclado
    private static final Scanner ingreso = new Scanner(System.in);

    //Metodo para obtener un numero entero, lo recibe como argumento
    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.print(mensaje);
        numeroTemporal = ingreso.nextInt();

        return numeroTemporal;
    }

    //Decision de numeros
    public static void verificarNumero(int numero){
        while (numero <= 0) {
            System.out.println("Numero negativo o cero: " + numero);
            numero = obtenerNumero("Ingresa un numero entero: ");
        }
        System.out.println("Numero positivo: " + numero);
    }

    //Metodo principal main
    public static void main(String[] args){
        int numero = obtenerNumero("Ingresa un numero entero: ");

        //Llamada al metodo de verificacion
        verificarNumero(numero);

    }

}