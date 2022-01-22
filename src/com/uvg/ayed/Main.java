package com.uvg.ayed;
import java.util.Scanner;

/**
 * @author Esteban Donis
 * En este metodo es donde se realizan toda la interaccion con el usuario
 */

public class Main{
    public static void main(String[] args) {
        Radio radio = new Radio();
        Main mein = new Main();
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 7){//Evaluamos que el usuario no quiera salir del menu
            if (radio.getStatus() == true){//Verifica que la radio este prendida para imprimir el estado del radio y la emisora
                if (radio.getActualMode() == 0){
                    System.out.println("Estacion: AM");
                }
                else {
                    System.out.println("Estacion: FM");
                }
                if (radio.getActualMode() == 0){
                    System.out.println("Frecuencia: " + radio.getActualFreqAM());
                }
                else {
                    System.out.println("Frecuencia: " + radio.getActualFreqFM());
                }
            }    
            
            mein.opciones();//Desplegamos las opciones
            boolean paso = false;
            while (paso == false){//Verificamos que el usuario ingrese un valor disponible
                try {
                    String stringOpcion = scan.nextLine();
                    opcion = Integer.parseInt(stringOpcion);
                    paso = true;
                } catch (Exception e) {
                    System.out.println("Ingrese un valor numérico");
                }
            }
            //Esta opcion prende el radio
            if (opcion == 1){
                boolean estado = radio.getStatus();
                if (estado == true){//Verificamos que el radio este encendido
                    System.out.println("La radio ya esta encendida");
                }
                else {
                    radio.switchButton();
                }
            }
            //Esta opcion Cambia de AM a FM y viceversa
            else if (opcion  == 2){
                if (radio.getStatus() == true){
                    radio.changeMode();
                }
                else {
                    System.out.println("Encienda la radio primero");
                }
            }
            //Esta opcion avanda el dial de las emisoras
            else if (opcion  == 3){
                if (radio.getStatus() == true){
                    radio.moveForward();
                }
                else {
                    System.out.println("Encienda la radio primero");
                }
            }
            //Esta opcion permite guardar una emisora en uno de los 12 botones
            else if (opcion  == 4){
                if (radio.getStatus() == true){
                    paso = false;
                    int boton = 0;
                    while (paso == false){
                        System.out.println("Ingrese el boton donde desea guardar la emisora");
                        try {
                            String stringBoton = scan.nextLine();
                            boton = Integer.parseInt(stringBoton);
                            paso = true;
                        } catch (Exception e) {
                            System.out.println("Ingrese un valor numérico");
                        }
                    }

                    if (boton > 0 && boton < 13){//Verificamos que el valor ingresado se encuentra entre los 12 botones
                        if (radio.getActualMode() == 0){
                            radio.saveInAM(boton, radio.getActualFreqAM());//Guardamos la emisora con el boton
                        }
                        else if (radio.getActualMode() == 1){
                            radio.saveInFM(boton, radio.getActualFreqFM());
                        }
                    }
                    else{
                        System.out.println("Ingrese un numero de 1 a 12");
                    }
                }
                else {
                    System.out.println("Encienda la radio primero");
                }
            }
            //Esta opcion permite seleccionar una emisora guardada
            else if (opcion == 5){
                if (radio.getStatus() == true){
                    paso = false;
                    int boton = 0;
                    while (paso == false){
                        System.out.println("Ingrese el boton con la emisora que quiere reproducir");
                        try {
                            String stringBoton = scan.nextLine();
                            boton = Integer.parseInt(stringBoton);
                            paso = true;
                        } catch (Exception e) {
                            System.out.println("Ingrese un valor numérico");
                        }
                    }
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
                else {
                    System.out.println("Encienda la radio primero");
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
                System.exit(0);
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
        System.out.println("7. Cerrar del programa");
    }
}
