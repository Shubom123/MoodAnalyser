package com.moodanalyser;

public class MoodAnalyserException extends Exception{
    ExceptionType type;

    enum ExceptionType{
        NULL, EMPTY
    }
    public String message;
    public MoodAnalyserException(ExceptionType type,String message){
        super(message);
        this.type=type;
    }
}
