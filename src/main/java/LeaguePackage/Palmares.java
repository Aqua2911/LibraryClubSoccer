package LeaguePackage;

import java.util.Date;

class Palmares {

    String titre;
    Date dateObtention;

    Club club;

    public Palmares(String titre, Date dateObtention, Club club) {
        this.titre = titre;
        this.dateObtention = dateObtention;
        this.club = club;
    }
}
