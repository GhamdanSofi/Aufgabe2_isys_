import java.util.ArrayList;
import java.util.List;

public class Verbindung {

    public String stadt1;
    public String stadt2;
    public int entfernung;

    public Verbindung(String stadt1, String stadt2, int entfernung) {
        this.stadt1 = stadt1;
        this.stadt2 = stadt2;
        this.entfernung = entfernung;
    }

    public String getStadt1() {
        return stadt1;
    }

    public void setStadt1(String stadt1) {
        this.stadt1 = stadt1;
    }

    public String getStadt2() {
        return stadt2;
    }

    public void setStadt2(String stadt2) {
        this.stadt2 = stadt2;
    }

    public int getEntfernung() {
        return entfernung;
    }

    public void setEntfernung(int entfernung) {
        this.entfernung = entfernung;
    }

    public String toString() {
        return "Stadt1: " + stadt1 + ", Stadt2: " + stadt2 + ", Entfernung: " + entfernung;
    }

    public static List<Verbindung> findeVerbindungByStadt(List<Verbindung> verbindungen, String stadt1) {

        List<Verbindung> output = new ArrayList<>();
        for (Verbindung verbindung: verbindungen) {
            if(verbindung.getStadt1().equals(stadt1)|| verbindung.getStadt2().equals(stadt1)){
                output.add(verbindung);
            }
        }
        return output;
    }

    public static List<Verbindung> findeVerbindungByStadt2(List<Verbindung> verbindungen, String stadt1) {
        return verbindungen.stream()
                .filter(verbindung -> verbindung.getStadt2().equals(stadt1))
                .toList();
    }


}
