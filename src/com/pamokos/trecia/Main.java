package com.pamokos.trecia;

import com.pamokos.skaiciuotuvas.Skaiciuotuvas;
import com.pamokos.skaitytuvas.Skaitytuvas;
import com.pamokos.spausdintuvas.Spausdintuvas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Skaitytuvas skaitytuvas = new Skaitytuvas();
        Skaiciuotuvas skaiciuotuvas = new Skaiciuotuvas();
        Spausdintuvas spausdintuvas = new Spausdintuvas();

        skaiciuotuvas.setAtstumas(skaitytuvas.getOneFloat("Iveskite nuvaziuota atstuma"));
        skaiciuotuvas.setSanaudos(skaitytuvas.getOneFloat("Iveskite kuro sanaudas"));
        spausdintuvas.spausdinkFloat("Kuro sanaudu vidurkis yra:",skaiciuotuvas.getVidurkis());
    }
}
