package LeaguePackage;

class Stadium {
    /**
     *
     */
    String stadiumName;
    int capacity;
    String groundType;

    Club club;

    public Stadium(String stadiumName, int capacity, String groundType, Club club) {
        this.stadiumName = stadiumName;
        this.capacity = capacity;
        this.groundType = groundType;
        this.club = club;
    }
}
