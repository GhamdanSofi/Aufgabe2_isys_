import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DatenEinlesen {
    public DatenEinlesen() {
    }

    public static List<StadtMitH> staedte = new ArrayList<>();
    public static List<Verbindung> verbindungen = new ArrayList<>();

    public static List<Stadt> leseStaedte(String dateipfad) {

        List<Stadt> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dateipfad))) {
            String zeile;
            int zeilennummer = 0;


            while ((zeile = br.readLine()) != null) {
                zeilennummer++;

                // Überspringen der ersten Zeile (Kopfzeile)
                if (zeilennummer == 1) {
                    continue;
                }

                String[] teile = zeile.split(";");
                if (teile.length != 4) {
                    continue; // Überspringen von ungültigen Zeilen
                }

                String name = teile[0].trim();
                double lat = Double.parseDouble(teile[1].trim());
                double lon = Double.parseDouble(teile[2].trim());
                boolean ladestation = Boolean.parseBoolean(teile[3].trim());

                // Zum Beispiel: Erstellen eines Stadtobjekts und Hinzufügen zu einer Karte oder Liste
                Stadt stadt = new Stadt(name, lat, lon, ladestation);
                //System.out.println(stadt);
                result.add(stadt);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return result;
    }


    public static List<Verbindung> leseVerbindungen(String dateipfad) {
        List<Verbindung> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(dateipfad))) {
            String zeile;
            int zeilennummer = 0; // Zähler für die Zeilennummer


            while ((zeile = br.readLine()) != null) {
                zeilennummer++; // Erhöhen der Zeilennummer

                // Überspringen der ersten Zeile (Kopfzeile)
                if (zeilennummer == 1) {
                    continue;
                }

                String[] teile = zeile.split(";");
                if (teile.length != 3 || teile[2].trim().isEmpty()) {
                    continue; // Überspringen von ungültigen Zeilen
                }

                try {
                    String stadt1 = teile[0].trim();
                    String stadt2 = teile[1].trim();
                    int entfernung = Integer.parseInt(teile[2].trim());

                    Verbindung verbindung = new Verbindung(stadt1, stadt2, entfernung);
/*
                    System.out.println(verbindung);
*/
                    result.add(verbindung);
                } catch (NumberFormatException e) {
                    System.err.println("Ungültige Entfernungsangabe in Zeile: " + zeile);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<Stadt> leseStaedteTest(String dateipfad) {
        List<Stadt> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dateipfad))) {
            String zeile;
            int zeilennummer = 0;

            while ((zeile = br.readLine()) != null) {
                zeilennummer++;
                if (zeilennummer == 1) {
                    continue;
                }

                String[] teile = zeile.split(";");
                if (teile.length != 3) {
                    continue;
                }

                String name = teile[0].trim();
                int hoehe = Integer.parseInt(teile[1].trim());
                boolean ladestation = Boolean.parseBoolean(teile[2].trim());

                Stadt stadt = new Stadt(name, hoehe, ladestation);
/*
                System.out.println(stadt);
*/
                result.add(stadt);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void speichereKnotenInDatei(Knoten knoten, String dateiPfad) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dateiPfad))) {
            if (knoten != null) {
                // Schreiben Sie hier die Informationen über den Lösungsknoten in die Datei
                writer.write("Lösungsknoten: " + knoten.toString());
            } else {
                writer.write("Keine Lösung gefunden.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<StartUndzielStadt> stadtPaaren(String dateipfad) {
        List<StartUndzielStadt> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(dateipfad))) {
            String zeile;
//            int zeilennummer = 0; // Zähler für die Zeilennummer


            while ((zeile = br.readLine()) != null) {
//                zeilennummer++; // Erhöhen der Zeilennummer

                // Überspringen der ersten Zeile (Kopfzeile)
//                if (zeilennummer == 1) {
//                    continue;
//                }

                String[] teile = zeile.split(";");
//                if (teile.length != 3 || teile[2].trim().isEmpty()) {
//                    continue;
//                }

                try {
                    String startStadt = teile[0].trim();
                    String zielStadt = teile[1].trim();
                    int akkureichweite = 200;
//                    System.out.println(startStadt + " " + zielStadt + " " + akkureichweite);
                    StartUndzielStadt startUndzielStadt = new StartUndzielStadt(startStadt, zielStadt, akkureichweite);
                    result.add(startUndzielStadt);

                } catch (NumberFormatException e) {
                    System.err.println("Ungültige Entfernungsangabe in Zeile:  " + zeile);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;


    }


    public static void main(String[] args) {

    }

/*    public static void main(String[] args) {

        staedte = leseStaedte("src/data/bigGraph_cities.txt");
        System.out.println("Stadtanzahl: " + staedte.size());

        verbindungen = leseVerbindungen("src/data/bigGraph_connections.txt");
        System.out.println("Verbindungen: " + verbindungen.size());

        List<StadtTest> stadtTests = leseStaedteTest("src/testData/t1_cities.txt");
        System.out.println("Stadtanzahl: " + stadtTests.size());


        List<Verbindung> verbindungenTest = leseVerbindungen("src/testData/t1_connections.txt");
        System.out.println("Verbindungen: " + verbindungenTest.size());
    }*/
}

