package LeaguePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StadiumTest {

    @Test
    public void StadiumTest(){
        Stadium stadium = new Stadium("stadiumName",5000,"type");
        assertNotNull(stadium);
        assertEquals(stadium.stadiumName,"stadiumName");
        String result = "Stadium{" +
                "stadiumName='" + stadium.stadiumName + '\'' +
                ", capacity=" + stadium.capacity +
                ", groundType='" + stadium.groundType + '\'' +
                '}';
        assertEquals(stadium.toString(), result);
    }
}
