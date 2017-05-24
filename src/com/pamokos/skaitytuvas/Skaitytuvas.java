package com.pamokos.skaitytuvas;

import java.util.Scanner;

/**
 * Created by user on 5/24/2017.
 */
public class Skaitytuvas {
    private Scanner _sc;
    public Skaitytuvas(){
        _sc = new Scanner(System.in);

    }
    public float getOneFloat(String prompt) {
        System.out.println(prompt);
        return _sc.nextFloat();
    }
}
