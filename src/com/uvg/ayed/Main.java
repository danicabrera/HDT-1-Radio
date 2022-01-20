package com.uvg.ayed;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Radio radio = new Radio();
        Main mein = new Main();
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7){
            if (radio.getStatus() == true){
                System.out.println("Estacion: " + radio.getActualMode());
                if (radio.getActualMode() == 0){
                    System.out.println("Frecuencia: " + radio.getActualFreqAM());
                }
                else {
                    System.out.println("Frecuencia: " + radio.getActualFreqFM());
                }
            }    
            
            mein.opciones();
            opcion = Integer.parseInt(scan.nextLine());
            //Esta opcion prende el radio
            if (opcion == 1){
                boolean estado = radio.getStatus();
                if (estado == true){
                    System.out.println("La radio ya esta encendida");
                }
                else {
                    radio.switchButton();
                }
            }
            //Esta opcion Cambia de AM a FM y viceversa
            else if (opcion  == 2){
                radio.changeMode();
            }
            //Esta opcion avanda el dial de las emisoras
            else if (opcion  == 3){
            }
            //Esta opcion permite guardar una emisora en uno de los 12 botones
            else if (opcion  == 4){
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
            else if (opcion  == 6){
                boolean estado = radio.getStatus();
                if (estado == false){
                    System.out.println("La radio ya esta apagada");
                }
                else {
                    radio.switchButton();
                }
            }
            else if (opcion == 7){

            }
            else{
                System.out.println("El valor ingresado no concuerda con ninguna opcion");
            }
        }
    }

    public void opciones() {
        System.out.println("1. Prender el radio");
        System.out.println("2. Cambia de AM a FM a AM");
        System.out.println("3. Avanzar en el dial de las emisoras. Al llegar al final del dial inicia nuevamente.");
        System.out.println("4. Permite guardar una emisora en uno de los 12 botones");
        System.out.println("5. Permite seleccionar la emisora puesta en un botón");
        System.out.println("6. Apagar el radio");
    }
}
