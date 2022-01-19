package com.uvg.ayed;

import java.util.Scanner;

public class Radio implements IRadio{
    public static void main(String[] args) {
        Radio obj = new Radio();
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

    @Override
    public boolean getStatus() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void switchButton() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void changeMode() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getActualMode() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void saveInAM(int slot, int freq) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getSavedFreqAM(int slot) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void saveInFM(int slot, double freq) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double getSavedFreqFM(int slot) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getActualFreqAM() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getActualFreqFM() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void moveForward() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void moveBackward() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void seek() {
        // TODO Auto-generated method stub
        
    }

}
