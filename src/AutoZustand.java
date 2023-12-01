public class AutoZustand {

    public String position; //  Ortsname
    public int akkuReichweite; // Die Reichweite des Akkus in Kilometern
    public boolean anLadestation; // True, wenn sich das Auto an einer Ladestation befindet


    public AutoZustand(String position, int akkuReichweite, boolean anLadestation) {
        this.position = position;
        this.akkuReichweite = akkuReichweite;
        this.anLadestation = anLadestation;
    }



    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAkkuReichweite() {
        return akkuReichweite;
    }

    public void setAkkuReichweite(int akkuReichweite) {
        this.akkuReichweite = akkuReichweite;
    }

    public boolean isAnLadestation() {
        return anLadestation;
    }

    public void setAnLadestation(boolean anLadestation) {
        this.anLadestation = anLadestation;
    }


    public String toString() {
        return "Position: " + position + ", Akku: " + akkuReichweite + ", Ladestation: " + anLadestation;
    }
}
