package moodanalyzerproblem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalyse() {
        MoodAnalyzer md = new MoodAnalyzer();
        String mood = md.analyseMood("This is a SAD message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void testHappyMood() {
        MoodAnalyzer md = new MoodAnalyzer();
        String mood = md.analyseMood("This is a HAPPY message");
        Assert.assertEquals("HAPPY", mood);
    }
}
