public class StartUndzielStadt {

    private String startStadt;
    private String zielStadt;
    private int akkuReichweite;

    public StartUndzielStadt(String startStadt, String zielStadt, int akkuReichweite) {
        this.startStadt = startStadt;
        this.zielStadt = zielStadt;
        this.akkuReichweite = akkuReichweite;
    }

    public String getStartStadt() {
        return startStadt;
    }

    public void setStartStadt(String startStadt) {
        this.startStadt = startStadt;
    }

    public String getZielStadt() {
        return zielStadt;
    }

    public void setZielStadt(String zielStadt) {
        this.zielStadt = zielStadt;
    }

    public int getAkkuReichweite() {
        return akkuReichweite;
    }

    public void setAkkuReichweite(int akkuReichweite) {
        this.akkuReichweite = akkuReichweite;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}