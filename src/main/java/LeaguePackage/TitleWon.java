package LeaguePackage;

import java.util.Date;

/**
 *  TitleWon is the class entity we'll be using to create  TitleWon by Coach  inherit from class Palmares
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName  obtainmentDate,title
 *  @return obtainmentDate,title
 *  @author Alpha, Kokou and  Nicolas ,
 */

class TitleWon extends Palmares {

    public TitleWon(String title, Date obtainmentDate) {
        super(title, obtainmentDate);
    }

    @Override
    public String toString() {
        return "TitleWon{" +
                "titre='" + title + '\'' +
                ", obtainmentDate=" + obtainmentDate +
                '}';
    }
}
