package com.pamokos.skaiciuotuvas;

/**
 * Created by user on 5/24/2017.
 */
public class Skaiciuotuvas {
    private float _sanaudos;
    private float _atstumas;
    private float _vidurkis;

    public void setSanaudos(float value){
        _sanaudos= value;
    }

    public void setAtstumas(float value){
        _atstumas = value;
    }

    public float getVidurkis(){
        _vidurkis = (_sanaudos * 100)/_atstumas;
        return _vidurkis;
    }
}
