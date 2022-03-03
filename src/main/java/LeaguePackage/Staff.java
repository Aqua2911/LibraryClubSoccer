package LeaguePackage;

class Staff extends Person {
    /**
     *
     *
     */
    float age;
    String role;

    Club club;

    public Staff(String lastName, String firstName, float age, String role, Club club) {
        super(lastName, firstName);
        this.age = age;
        this.role = role;
        this.club = club;
    }
}
