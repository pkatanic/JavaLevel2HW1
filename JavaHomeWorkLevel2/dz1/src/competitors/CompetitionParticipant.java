package competitors;

public class CompetitionParticipant {
    private String name;
    private Competitor[] competitors = new Competitor[3];

    public CompetitionParticipant(String name, Competitor[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public Competitor getComp(int i ){
        return competitors[i];
    }
    public void showResult(){
        for(Competitor c : competitors){
            c.showResult();
        }
    }
}
