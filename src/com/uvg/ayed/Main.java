package com.uvg.ayed;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7){
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
                int boton = Integer.parseInt(scan.nextLine());
                if (boton > 0 && boton < 13){
                    if (radio.getActualMode() == 0){
                        radio.saveInAM(boton, radio.getActualFreqAM());
                    }
                    else if (radio.getActualMode() == 1){
                        radio.saveInFM(boton, radio.getActualFreqFM());
                    }
                }
                else{
                    System.out.println("Ingrese un numero de 1 a 12");
                }
            }
            //Esta opcion permite seleccionar una emisora guardada
            else if (opcion == 5){
                int boton = Integer.parseInt(scan.nextLine());
                if (boton > 0 && boton < 13){
                    if (radio.getActualMode() == 0){
                        int emisora = radio.getSavedFreqAM(boton);
                        System.out.println("Ha seleccionado la emisora: "+ emisora);
                    }
                    else if (radio.getActualMode() == 1){
                        double emisora = radio.getSavedFreqFM(boton);
                        System.out.println("Ha seleccionado la emisora: "+ emisora);
                    }
                }    
                else{
                    System.out.println("Ingrese un numero de 1 a 12");
                }
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
