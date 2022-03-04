package LeaguePackage;

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
