package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void giveMessage_WhenReturnSad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result = moodAnalyser.analyzeMood("I am in sad mood");
        Assertions.assertEquals("SAD",result);
    }
    @Test
    public void giveMessage_WhenReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result = moodAnalyser.analyzeMood("I am in happy mood");
        Assertions.assertEquals("HAPPY",result);
    }
}
