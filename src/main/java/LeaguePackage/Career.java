package LeaguePackage;

import java.util.Date;
/**
 * Career  is the class entity we'll be using to create player or coach Career
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName clubName, passageDateStart, passageDateEnd
 *  @return clubName, passageDateStart, passageDateEnd
 *  @author Alpha, Kokou and  Nicolas ,
 */

class Career {
    /**
     *
     *
     */
    String clubName;
    Date passageDateStart;
    Date passageDateEnd;

    public Career(String clubName, Date passageDateStart, Date passageDateEnd) {
        this.clubName = clubName;
        this.passageDateStart = passageDateStart;
        this.passageDateEnd = passageDateEnd;
    }

    @Override
    public String toString() {
        return "Career{" +
                "clubName='" + clubName + '\'' +
                ", passageDateStart=" + passageDateStart +
                ", passageDateEnd=" + passageDateEnd +
                '}';
    }
}
