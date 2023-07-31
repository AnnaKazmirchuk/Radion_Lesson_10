package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    private int stationCount;

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }

    public Radio() {
        this.stationCount = 10;
    }

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < minRadioStation) {
            return;
        }
        if (newRadioStation > stationCount - 1) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < stationCount - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }

    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = stationCount - 1;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;

    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }

    }
}