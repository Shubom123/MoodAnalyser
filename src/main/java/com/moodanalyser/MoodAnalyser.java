package com.moodanalyser;

public class MoodAnalyser {


    public String analyzeMood(String message) {

        if (message.contains("sad")) {
            return "SAD";
        }
        return "";
    }

}
