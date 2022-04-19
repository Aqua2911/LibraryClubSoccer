package LeaguePackage;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PalmaresTest {

    @Test
    public  void PalmaresTest(){
        Palmares palmares = new Palmares("testName", new Date());
        assertNotNull(palmares);
        assertEquals(palmares.title,"testName");
        String result = "Palmares{" +
                "titre='" + palmares.title + '\'' +
                ", dateObtention=" + palmares.obtainmentDate +
                '}';
        assertEquals(palmares.toString(), result);
    }
}
