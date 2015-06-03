package com.example.android.makeful.tree;

/**
 * Created by ashley on 5/30/15.
 */
public class Instruction extends Node {
    public String text;
    public long seconds;
    public long minutes;
    public long hours;
    public static final long SECONDS_IN_HOUR = 3600;
    public static final long SECONDS_IN_MINUTE = 60;

    public Instruction(){
        seconds = 0;
        minutes = 0;
        hours = 0;
    }
    public Instruction(long duration){
        seconds = duration;
        setMinutes();
        setHours();
    }

    public void setMinutes(){
        minutes = seconds / SECONDS_IN_MINUTE;
    }

    public void setHours(){
        hours = seconds / SECONDS_IN_HOUR;
    }
}

