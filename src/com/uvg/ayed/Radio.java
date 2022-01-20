package com.uvg.ayed;
import java.util.HashMap;

import javax.print.event.PrintEvent;
import javax.sound.sampled.SourceDataLine;

public class Radio implements IRadio{

    private int Estacion = 0;
    private boolean EstadoRadio = false;
    private int FrecuenciaAM;
    private double FrecuenciaFM;
    private HashMap<Integer, Integer> RadiosAM = new HashMap<Integer, Integer>();
    private HashMap<Integer, Double> RadiosFM = new HashMap<Integer, Double>();

    @Override
    public boolean getStatus() {
        return EstadoRadio;
    }

    @Override
    public void switchButton() {
       
        if(EstadoRadio == false){

            EstadoRadio = true;
            System.out.println("radio encendida");

        }
        
    }

    @Override
    public void changeMode() {
        
        if(Estacion == 0){

            Estacion = 1; 

        }else{

            Estacion = 0;

        }
        System.out.println("se ha cambiado de estación");
        
    }

    @Override
    public int getActualMode() {
        return Estacion;
    }

    @Override
    public void saveInAM(int slot, int freq) {
        RadiosAM.put(slot, freq);
        System.out.println("Se ha guardado la frecuencia: "+freq+ " en el espacio: "+slot);
    }

    @Override
    public int getSavedFreqAM(int slot) {
        int frecuencia = RadiosAM.get(slot);
        return frecuencia;
    }

    @Override
    public void saveInFM(int slot, double freq) {
        RadiosFM.put(slot, freq);
        System.out.println("Se ha guardado la frecuencia: "+freq+ " en el espacio: " + slot);        
    }

    @Override
    public double getSavedFreqFM(int slot) {
        double frecuencia = RadiosFM.get(slot);
        return frecuencia;
    }

    @Override
    public int getActualFreqAM() {
        return FrecuenciaAM;
    }

    @Override
    public double getActualFreqFM() {
        return FrecuenciaFM;
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
