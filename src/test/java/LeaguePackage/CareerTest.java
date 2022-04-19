package LeaguePackage;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CareerTest {

    @Test
    public void CareerTest(){
        Career career = new Career("testName", new Date(), new Date());
        assertNotNull(career);
        assertEquals(career.clubName,"testName");
        String result = "Career{" +
                "clubName='" + career.clubName + '\'' +
                ", passageDateStart=" + career.passageDateStart +
                ", passageDateEnd=" + career.passageDateEnd +
                '}';
        assertEquals(career.toString(), result);
    }
}
