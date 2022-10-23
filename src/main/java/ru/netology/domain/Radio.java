package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void nextRadioStation() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }


    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void setToMaxVolume() {
        currentVolume = 10;
    }


    public void setToMinVolume() {
        currentVolume = 0;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }
}
