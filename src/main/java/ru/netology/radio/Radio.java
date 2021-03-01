package ru.netology.radio;

public class Radio {

    private int currentVolume = 4;
    int maxVolume = 10;
    int minVolume = 0;
    private int currentRadioStation = 4;
    int maxRadioStation = 9;
    int minRadioStation = 0;


    public int changeTheStationByRemoteControl(int intendedStation) {
        if (intendedStation <= 9 && intendedStation >= 0) {
            currentRadioStation = intendedStation;
        }
        return currentRadioStation;
    }


    public void changeTheStationByNextButton() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation += 1;
        }
    }

    public void changeTheStationByPrevButton() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = 9;
        } else {
            currentRadioStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }
}
