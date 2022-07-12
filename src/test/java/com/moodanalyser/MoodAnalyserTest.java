package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void giveMessage_WhenReturnSad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String result = moodAnalyser.analyzeMood();
        Assertions.assertEquals("SAD",result);
    }
    @Test
    public void giveMessage_WhenReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String result = moodAnalyser.analyzeMood();
        Assertions.assertEquals("HAPPY",result);
    }
}
