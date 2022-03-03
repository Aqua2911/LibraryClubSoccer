package LeaguePackage;

import java.util.Date;

class TitleWon extends Palmares {

    Coach coach;

    public TitleWon(String titre, Date dateObtention, Club club, Coach coach) {
        super(titre, dateObtention, club);
        this.coach = coach;
    }
}
