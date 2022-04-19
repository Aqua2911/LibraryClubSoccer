package LeaguePackage;

import java.util.Collection;

/**
 * Person is the class entity we'll be inherit by other classes
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName lastName, firstName
 *  @return lastName, firstName
 *  @author Alpha, Kokou and  Nicolas ,
 */

abstract class Person {
    /**
     *
     */
    // Les attributs
    String lastName;
    String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}


