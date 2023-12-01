import java.util.List;

public class Problem {
    private Stadt startStadt;
    private Stadt zielStadt;
    private List<Verbindung> verbindungen;
    private List<Stadt> staedte;

    private int akkuReichweite; // Reichweite des Elektroautos
    private int kosten;
    private int MAX_Akkureichweite ;



    public Problem(Stadt startStadt, Stadt zielStadt, List<Verbindung> verbindungen,List<Stadt> staedte, int akkuReichweite, int kosten ) {
        this.startStadt = startStadt;
        this.zielStadt = zielStadt;
        this.verbindungen = verbindungen;
        this.akkuReichweite = akkuReichweite;
        this.kosten = kosten;
        this.staedte = staedte;
        MAX_Akkureichweite = akkuReichweite+10;

    }

    public Stadt getStartStadt() {
        return startStadt;
    }

    public Stadt getZielStadt() {
        return zielStadt;
    }

    public List<Verbindung> getVerbindungen() {
        return verbindungen;
    }

    public int getAkkuReichweite() {
        return akkuReichweite;
    }

    public Stadt getStartState() {
        return startStadt;
    }

    public void setStartStadt(Stadt startStadtShit) {
        this.startStadt = startStadtShit;
    }

    public void setZielStadt(Stadt zielStadtShit) {
        this.zielStadt = zielStadtShit;
    }

    public void setVerbindungen(List<Verbindung> verbindungen) {
        this.verbindungen = verbindungen;
    }

    public void setAkkuReichweite(int akkuReichweite) {
        this.akkuReichweite = akkuReichweite;
    }

    public int getKosten() {
        return kosten;
    }

    public void setKosten(int kosten) {
        this.kosten = kosten;
    }

    public List<Stadt> getStaedte() {
        return staedte;
    }

    public void setStaedte(List<Stadt> staedte) {
        this.staedte = staedte;
    }

    public int getMAX_Akkureichweite() {
        return MAX_Akkureichweite;
    }

    public void setMAX_Akkureichweite(int MAX_Akkureichweite) {
        this.MAX_Akkureichweite = MAX_Akkureichweite;
    }


    // Hier können Sie Methoden implementieren, um die möglichen Aktionen zu bestimmen
    // Zum Beispiel: getActions(Knoten node)
}
