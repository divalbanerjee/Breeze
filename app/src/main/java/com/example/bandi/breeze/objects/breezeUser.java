package com.example.bandi.breeze.objects;

import android.os.SystemClock;

import java.util.Date;
import java.util.UUID;

public class breezeUser {
    private String userID;
    private String myEmail;
    private String myFirstName;
    private String myLastName;
    private Date myDOB;
    private String myUsername;
    private String myLocation;
    private int myScore;

    public breezeUser(String email, String username){
        this.myEmail = email;
        this.myUsername = username;
    }

    public void generateID(){
        this.userID = UUID.randomUUID().toString();
    }

    public String getID(){
        return this.userID;
    }

    public void setEmail(String email){
        this.myEmail = email;
    }

    public void setFirstName(String FirstName){
        this.myFirstName = FirstName;
    }

    public void setLastName(String LastName){
        this.myLastName = LastName;
    }

    public void setDOB(Date DOB){
        this.myDOB = DOB;
    }

    public void setUsername(String myUsername) {
        this.myUsername = myUsername;
    }

    public void setLocation(String myLocation) {
        this.myLocation = myLocation;
    }

    public void setScore(int myScore) {
        this.myScore = myScore;
    }

    public boolean checkAge(Date age){
        //if(age.compareTo(Sys))      //Age verification
        return true;  //TODO:will be completed later
    }
}