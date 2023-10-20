/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.p2_andrenavas;

import java.util.Scanner;
// tome un script prestado para poder lear y utilizar scanner

/**
 *
 * @author eliza
 */
public class LabP2_AndreNavas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int piedra = 2, tijeras = 1, papel = 3;
        int opcion = 0, opcion1 = 0;
        int jugador1 = 0, jugador2 = 0;
        int base = 0;
        int potencia=0;
        int con = 1;
        int mir = 0;
        int contador = 1;
        // comenze asignando los valores como enteros 
        boolean bandera = true;
        // use boolean para poder hacer un ciclo

        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Bienvenido en mi primer programa de lab.");
        System.out.println("Porfavor elija una de las siguientes opciones");
        {
            // le di la bienvenida al usuario con un print 
            while (bandera) {
                // primer ciclo utilizando true or falso, identificada como boolean que es verdadero y cumple la accion
                opcion = 0;
                System.out.println("1. Ejercicio práctico 1 – Piedra, Papel o Tijera de un turno");
                System.out.println("2. Números deficientes, abundantes y perfectos");
                System.out.println("3. Potencia Iterativa");
                System.out.println("4. salir");
                // le di la opcion al usuario de poder ejecutar el programa y elejir una opcion
                opcion = entrada.nextInt();
                // leo el código y lo guardo
                if (opcion == 1) {
                    opcion = 0;
                   // utilizo el if como una condición y leasigno 0 a opción para que no se repita el programa
                System.out.println("Usted seleccionó la opción numero 1--- 1. tijeras,2. piedra o 3.papel(juego)");
                System.out.println("Ingrese su opcion (jugador 1): ");
                jugador1 = entrada.nextInt();
                System.out.println("Ingrese su opcion (jugador 2): ");
                jugador2 = entrada.nextInt();
                // le doy la opción al usuario a eligir una opción y utilizo el segundo lea para guardarlo en jugador 1 y jugador
                if (piedra > tijeras) {
                    System.out.println("El jugador que selecciono piedra gano");
                } else if (piedra == piedra) {
                    System.out.println("Han empatado");
                } else if (piedra < papel) {
                    System.out.println("EL jugador que ha elegido piedra ha perdido");
                } else if (tijeras < papel) {
                    System.out.println("El jugador que selecciono tijeras ha ganado");
                } else if (tijeras < piedra) {
                    System.out.println("El jugador que selecciono piedra ha ganado");
                } else if (tijeras == tijeras) {
                    System.out.println("Han empatado");
                } else if (papel > piedra) {
                    System.out.println("El jugador que selecciono papel ha ganado");
                } else if (papel > tijeras) {
                    System.out.println("El jugador que selecciono tijeras ha ganado");
                } else if (papel == papel) {
                    System.out.println("Han empatado");
                } else if (papel == papel) {
                    System.out.println("Valor seleccionado no valido");
                    // utilizo varios sino  en la primera el jugador que selecciono piedra gano porque hice que piedra sea 2,papel 3 y tijeras sea 1, en la primera
                    //piedra es mayor que tijera entonces se cumple la condición por lo cual hago print que dice el siguiente mensaje El jugador que seleccionó piedra a ganado
                }
                }
                if (opcion == 2) {
                    System.out.println("Usted ha seleccionado la opcion dos");
                    opcion = 0;
                    int num;
                    int sum = 0;
                    int div = 1;
                    System.out.println("Ingrese el numero:");
                    num = entrada.nextInt();
                while (div < num) {
                    if (num % div == 0) {
                        sum += div;
                    }
                    div++;
                }
                if (sum > num) {
                    System.out.println(num + " :es abundante ");

                } else if (sum < num) {
                    System.out.println(num + " :es deficiente");
                }else{
                    System.out.println(num + " :es perfecto");
                }
                    
                }
                if (opcion == 3) {
                    // esta es la opcion tres Potencia Iterativa  y si opcion es igual a 2 se ejecuta esta opcion ignorando 
                    // todo lo demas
                    System.out.println("Usted ha seleccionado la opcion tres");
                    System.out.println("Ingrese la base: ");
                    base = entrada.nextInt();
                    System.out.println("Ingrese la potencia: ");
                    potencia = entrada.nextInt();
                    // contador lo asigno como 1 para luego comparar mi contador si es mayor contador la accion se 
                    //seguira ejecutando si no termina el proceso utilizé la palabra contador aunque no cuento nada
                    // y tiene un ciclo para multiplica la base por la base
                    con = base;
                        while (potencia>contador){      
                        potencia = potencia -1;
                        while (con>mir){
                        base = base + base;
                        con -= 1;
                    opcion = 0;                    
                }}}
                    System.out.println("La respuesta es: "+base);
                    // leo la base
                    // suma la base y la base                
                if (opcion == 4) {
                    System.out.println("Usted ha seleccionado la opcion cuatro para salir");
                    break;
                }
            }
        }
    }
}

