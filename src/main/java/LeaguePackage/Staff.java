package LeaguePackage;

/**
 *  Staff is the class entity we'll be using to create Staff inherit from class person
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName  firstName,lastName,age and role
 *  @return firstName,lastName,age and role
 *  @author Alpha, Kokou and  Nicolas ,
 */

class Staff extends Person {
    /**
     *
     *
     */
    float age;
    String role;

    public Staff(String firstName, String lastName, float age, String role) {
        super(lastName, firstName);
        this.age = age;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
