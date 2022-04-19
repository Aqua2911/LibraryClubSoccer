package LeaguePackage;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StaffTest {

    @Test
    public void StaffTest() {
        Staff staff = new Staff("firstName","lastName", 12, "role");
        assertNotNull(staff);
        assertEquals(staff.firstName,"firstName");
        String result = "Staff{" +
                "firstName='" + staff.firstName+ '\'' +
                ", lastName='" + staff.lastName + '\'' +
                ", age=" + staff.age +
                ", role='" + staff.role + '\'' +
                '}';
        assertEquals(staff.toString(), result);
    }
}
