package com.uvg.ayed;
import java.util.HashMap;

public class Radio implements IRadio{

    private String Estacion;
    private boolean EstadoRadio = false;
    private int FrecuenciaAM;
    private double FrecuenciaFM;
    private HashMap<Integer, Integer> RadiosAM = new HashMap<Integer, Integer>();
    private HashMap<Integer, Double> RadiosFM = new HashMap<Integer, Double>();

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
