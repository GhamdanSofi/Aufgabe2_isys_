public class Knoten {
    /*
    aktuelleStadt repräsentiert den Standort des Knotens.
    vorgaenger ist ein Verweis auf den vorherigen Knoten im Pfad. Dies ist nützlich, um den Pfad zurückzuverfolgen, sobald das Ziel erreicht ist.
    gKosten sind die Kosten, um von dem Startpunkt zu diesem Knoten zu gelangen. Dies beinhaltet die Distanz und ggf. die Ladekosten.
    hKosten ist die Heuristik, also die geschätzte Distanz vom aktuellen Knoten zum Ziel.
    fKosten ist die Summe aus gKosten und hKosten. Dies wird in der Regel verwendet, um Knoten im A*-Algorithmus zu priorisieren.
    */

    public Stadt aktuelleStadt; // Der aktuelle Standort
    public Knoten vorgaenger; // Der Vorgängerknoten im Pfad
    public int gKosten; // Die bisher zurückgelegte Distanz (tatsächliche Kosten)
    public double hKosten; // Geschätzte Kosten vom aktuellen Knoten bis zum Ziel (Heuristik)
    public double fKosten; // Gesamtkosten (gKosten + hKosten)
    public double aktuelleAkku;



    public Knoten(Stadt aktuelleStadt, Knoten vorgaenger, int gKosten, double hKosten, double reichweite) {
        this.aktuelleStadt = aktuelleStadt;
        this.vorgaenger = vorgaenger;
        this.gKosten = gKosten;
        this.hKosten = hKosten;
        this.fKosten = gKosten + hKosten; // Die Gesamtkosten werden hier berechnet
        aktuelleAkku = reichweite;
    }

    public Stadt getAktuelleStadt() {
        return aktuelleStadt;
    }

    public void setAktuelleStadt(Stadt aktuelleStadtShit) {
        this.aktuelleStadt = aktuelleStadtShit;
    }

    public Knoten getVorgaenger() {
        return vorgaenger;
    }

    public void setVorgaenger(Knoten vorgaenger) {
        this.vorgaenger = vorgaenger;
    }

    public int getgKosten() {
        return gKosten;
    }

    public void setgKosten(int gKosten) {
        this.gKosten = gKosten;
    }

    public double gethKosten() {
        return hKosten;
    }

    public void sethKosten(int hKosten) {
        this.hKosten = hKosten;
    }

    public double getfKosten() {
        return fKosten;
    }

    public void setfKosten(int fKosten) {
        this.fKosten = fKosten;
    }
    public void setAktuelleAkku(int aktuelleAkku) {
        this.aktuelleAkku = aktuelleAkku;
    }

    public double getAktuelleAkku() {
        return aktuelleAkku;
    }
//    public Knoten(int aktuelleAkku) {
//        this.aktuelleAkku = aktuelleAkku;
//    }

    @Override
    public String toString() {
        return "Knoten{" +
                "aktuelleStadt=" + aktuelleStadt +
                ", vorgaenger=" + vorgaenger +
                ", gKosten=" + gKosten +
                ", hKosten=" + hKosten +
                ", fKosten=" + fKosten +
                '}';
    }
}

