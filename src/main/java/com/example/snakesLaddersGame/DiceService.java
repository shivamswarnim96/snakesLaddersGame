package com.example.snakesLaddersGame;

import java.util.Random;

public class DiceService {

    public static int roll() {
        int newPosition = new Random().nextInt(6) + 1;
        if(newPosition%2==0){
            return newPosition;
        }else{
            return 0;
        }
    }
}