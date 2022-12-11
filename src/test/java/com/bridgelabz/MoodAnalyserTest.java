package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

   @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String sadMood = moodAnalyser.analyseMood();
        System.out.println(sadMood);
        Assert.assertEquals("SAD", sadMood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String happyMood = moodAnalyser.analyseMood();
        System.out.println(happyMood);
        Assert.assertEquals("HAPPY", happyMood);

    }
}