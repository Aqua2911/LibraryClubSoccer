package LeaguePackage;

class Stadium {
    /**
     *
     */
    String stadiumName;
    int capacity;
    String groundType;

    public Stadium(String stadiumName, int capacity, String groundType) {
        this.stadiumName = stadiumName;
        this.capacity = capacity;
        this.groundType = groundType;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "stadiumName='" + stadiumName + '\'' +
                ", capacity=" + capacity +
                ", groundType='" + groundType + '\'' +
                '}';
    }
}
