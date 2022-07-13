package com.moodanalyser;

public class MoodAnalyser {

    String message;
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyzeMood() throws MoodAnalyserException {

        try{
            if (message.length()==0){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,"Mood is empty");
            }
            if(message.contains("sad")){
                return "SAD";
            }else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Enter valid mood ");
//            System.out.println("Invalid Mood"+e);
//            return "HAPPY";
        }

    }

}
