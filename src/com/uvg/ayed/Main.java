package com.uvg.ayed;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4){
            opcion = Integer.parseInt(scan.nextLine());
            //Esta opcion prende el radio
            if (opcion == 1){

            }
            //Esta opcion Cambia de AM a FM y viceversa
            else if (opcion == 2){

            }
            //Esta opcion avanda el dial de las emisoras
            else if (opcion == 3){

            }
            //Esta opcion permite guardar una emisora en uno de los 12 botones
            else if (opcion == 4){

            }
            //Esta opcion permite seleccionar una emisora guardada
            else if (opcion == 5){

            }
            //Esta opcion apaga el radio
            else if (opcion == 6){

            }
            else{
                System.out.println("El numero ingresado no concuerda con ninguna opcion");
            }
        }
    }

}
