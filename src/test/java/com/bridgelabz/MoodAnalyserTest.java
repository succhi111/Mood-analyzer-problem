package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

@Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        System.out.println(mood);
       Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a happy message");
        System.out.println(mood);
        Assert.assertEquals("HAPPY", mood);
    }
}