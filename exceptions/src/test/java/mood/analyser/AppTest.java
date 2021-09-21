package mood.analyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
    @Test
    void testSad(){
        MoodAnalyserApp md=new MoodAnalyserApp();
        try{
        assertEquals("Sad", md.analyseMood("I am in Sad Mood"));
        }
        catch(MoodAnalyserException mae){
            System.out.println(mae.getMessage());
        }
    }

}
