import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<StadtMitH> findeRoute(StadtMitH start, StadtMitH ziel, List<Verbindung> verbindungen) {
        // Initialisierung der offenen und geschlossenen Liste
        List<Knoten> openSet = new ArrayList<>();
        List<Knoten> closedSet = new ArrayList<>();

/*
        Knoten startKnoten = knotenErstellen(Stadt aktuellStadt , Knoten knoten , 0, Stadt start , Stadt ziel);


        openSet.add(startKnoten);
*/

        while (!openSet.isEmpty()) {
            Knoten aktuelleKnoten = findeNiedrigsteKostenKnoten(openSet);

            if (aktuelleKnoten.aktuelleStadt.equals(ziel)) {
                return rekonstruierePfad(aktuelleKnoten);
            }

            openSet.remove(aktuelleKnoten);
            closedSet.add(aktuelleKnoten);

            for (Knoten nachfolger : generiereNachfolger(aktuelleKnoten, verbindungen)) {
                // Implementieren Sie hier die Logik zur Aktualisierung der Knoten
                // und fügen Sie sie zur offenen Liste hinzu, falls notwendig.
            }
        }

        return new ArrayList<>(); // Kein Pfad gefunden
    }
 /*   public static Knoten knotenErstellen(StadtShit aktuellStadtShit, Knoten vorgaenger , int gKosten , StadtShit start , StadtShit ziel){

        Knoten startKnoten = new Knoten(start, null, 0, (int)Heuristik.berechneHaversineDistanz(start, ziel));

        return startKnoten;
    }*/


    public static Knoten findeNiedrigsteKostenKnoten(List<Knoten> openSet) {
        // Implementierung der Methode
        return null;
    }

    private static List<Knoten> generiereNachfolger(Knoten knoten, List<Verbindung> verbindungen) {
        // Implementierung der Methode
        return null;
    }

    private static List<StadtMitH> rekonstruierePfad(Knoten ziel) {
        // Implementierung der Methode
        return null;

    }

    private static double berechneHeuristik(StadtMitH stadtMitH1, StadtMitH stadtMitH2) {
        // Implementierung der Haversine-Formel
        return 0;
    }

    // Weitere Hilfsmethoden wie berechneEntfernung usw.
}
