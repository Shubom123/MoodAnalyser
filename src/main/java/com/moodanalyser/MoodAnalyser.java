package com.moodanalyser;

public class MoodAnalyser {

    String message;
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyzeMood() throws MoodAnalyserException {

        try{
            if(message.contains("sad")){
                return "SAD";
            }else {
                return "HAPPY";
            }
        }
        catch (Exception e){
            throw new MoodAnalyserException("Enter valid mood "+ e);
//            System.out.println("Invalid Mood"+e);
//            return "HAPPY";
        }

    }

}
