package LeaguePackage;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TitleWonTest {

    @Test
    public void TitleWonTest(){
        TitleWon titleWon = new TitleWon("titleWon",new Date());
        assertNotNull(titleWon);
        assertEquals(titleWon.title,"titleWon");
        String result = "TitleWon{" +
                "titre='" + titleWon.title + '\'' +
                ", obtainmentDate=" + titleWon.obtainmentDate +
                '}';
        assertEquals(titleWon.toString(), result);
    }
}
