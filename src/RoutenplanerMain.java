import java.util.ArrayList;
import java.util.List;

public class RoutenplanerMain {



    public static void main(String[] args) {

        DatenEinlesen datenEinlesen = new DatenEinlesen();



        System.out.println("------------------------------------------------------");
        System.out.println("Test 1 :");
        System.out.println("------------------------------------------------------");

        List<Stadt> stadtList = datenEinlesen.leseStaedteTest("src/testData/t1_cities.txt");

        List<Verbindung> verbindungTests = datenEinlesen.leseVerbindungen("src/testData/t1_connections.txt");

        Stadt startStadt = Stadt.findeStadtByName(stadtList, "A");

        Stadt zielStadt = Stadt.findeStadtByName(stadtList, "B");

        Problem problem = new Problem(startStadt, zielStadt, verbindungTests, stadtList, 410, 150);
//        PriorityQueue<Knoten> knotens =  ASuche.aSternSuche(problem);
        Knoten knoten = ASuche.aSternSuche(problem);
        System.out.println("Knoten: " + knoten);
        System.out.println("Gesamte Kosten : " + knoten.getgKosten());
        if(knoten != null){
            DatenEinlesen.speichereKnotenInDatei(knoten, "src/route/knoten.txt");
        }


        System.out.println("------------------------------------------------------");
        System.out.println("Test 2 :");
        System.out.println("------------------------------------------------------");
        List<Stadt> stadtList1 = datenEinlesen.leseStaedteTest("src/testData/t2_cities.txt");

        List<Verbindung> verbindungTests1 = datenEinlesen.leseVerbindungen("src/testData/t2_connections.txt");

        Stadt startStadt1 = Stadt.findeStadtByName(stadtList1, "A");

        Stadt zielStadt1 = Stadt.findeStadtByName(stadtList1, "B");
        listenBeerbeiten(stadtList1, verbindungTests1);

        Problem problem1 = new Problem(startStadt1, zielStadt1, verbindungTests1, stadtList1, 500, 250);
//        PriorityQueue<Knoten> knotens =  ASuche.aSternSuche(problem);
        Knoten knoten1 = ASuche.aSternSuche(problem1);
        System.out.println("Knoten2: " + knoten1);
        System.out.println("Gesamte Kosten : " + knoten1.getgKosten());
        if(knoten1 != null){
            DatenEinlesen.speichereKnotenInDatei(knoten1, "src/route/knoten.txt");
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Test 3 :");
        System.out.println("------------------------------------------------------");

        List<Stadt> stadtList2 = datenEinlesen.leseStaedteTest("src/testData/t3_cities.txt");

        List<Verbindung> verbindungTests2 = datenEinlesen.leseVerbindungen("src/testData/t3_connections.txt");

        Stadt startStadt2 = Stadt.findeStadtByName(stadtList2, "A");

        Stadt zielStadt2 = Stadt.findeStadtByName(stadtList2, "B");

        System.out.println("StadtList2 : " + stadtList2);
        System.out.println("VerbindungTests2 : " + verbindungTests2);


        listenBeerbeiten(stadtList2, verbindungTests2);

        Problem problem2 = new Problem(startStadt2, zielStadt2, verbindungTests2, stadtList2, 30, 70);
        Knoten knoten2 = ASuche.aSternSuche(problem2);
        System.out.println("Knoten3: " + knoten2);
        System.out.println("Gesamte Kosten : " + knoten2.getgKosten());






        System.out.println("------------------------------------------------------");
        System.out.println("Test 4 :");
        System.out.println("------------------------------------------------------");

        List<Stadt> stadtList4 = datenEinlesen.leseStaedteTest("src/testData/t4_cities.txt");

        List<Verbindung> verbindungTests4 = datenEinlesen.leseVerbindungen("src/testData/t4_connections.txt");

        Stadt startStadt4 = Stadt.findeStadtByName(stadtList4, "A");

        Stadt zielStadt4 = Stadt.findeStadtByName(stadtList4, "B");

        listenBeerbeiten(stadtList4, verbindungTests4);

        Problem problem4 = new Problem(startStadt4, zielStadt4, verbindungTests4, stadtList4, 40, 70);
        Knoten knoten4 = ASuche.aSternSuche(problem4);
        System.out.println("Knoten4: " + knoten4);
        System.out.println("Gesamte Kosten : " + knoten4.getgKosten());







        System.out.println("------------------------------------------------------");
        System.out.println("Test 5 :");
        System.out.println("------------------------------------------------------");

        List<Stadt> stadtList5 = datenEinlesen.leseStaedteTest("src/testData/t5_cities.txt");

        List<Verbindung> verbindungTests5 = datenEinlesen.leseVerbindungen("src/testData/t5_connections.txt");

        Stadt startStadt5 = Stadt.findeStadtByName(stadtList5, "A");

        Stadt zielStadt5 = Stadt.findeStadtByName(stadtList5, "B");

        listenBeerbeiten(stadtList5, verbindungTests5);

        Problem problem5 = new Problem(startStadt5, zielStadt5, verbindungTests5, stadtList5, 30, 90);
        Knoten knoten5 = ASuche.aSternSuche(problem5);
        System.out.println("Knoten5: " + knoten5);
        System.out.println("Gesamte Kosten : " + knoten5.getgKosten());


        System.out.println("------------------------------------------------------");
        System.out.println("Test 6 :");
        System.out.println("------------------------------------------------------");

        List<Stadt> stadtList6 = datenEinlesen.leseStaedteTest("src/testData/t6_cities.txt");

        List<Verbindung> verbindungTests6 = datenEinlesen.leseVerbindungen("src/testData/t6_connections.txt");

        Stadt startStadt6 = Stadt.findeStadtByName(stadtList5, "A");

        Stadt zielStadt6 = Stadt.findeStadtByName(stadtList5, "B");

        listenBeerbeiten(stadtList5, verbindungTests5);

        Problem problem6 = new Problem(startStadt6, zielStadt6, verbindungTests6, stadtList6, 410, 0);
        Knoten knoten6 = ASuche.aSternSuche(problem6);
        System.out.println("Knoten6: " + knoten6);
        //System.out.println("Gesamte Kosten : " + knoten6.getgKosten());


        System.out.println("------------------------------------------------------");
        System.out.println("Test 7 :");
        System.out.println("------------------------------------------------------");

        List<Stadt> stadtList7 = datenEinlesen.leseStaedteTest("src/testData/t7_cities.txt");

        List<Verbindung> verbindungTests7 = datenEinlesen.leseVerbindungen("src/testData/t7_connections.txt");

        Stadt startStadt7 = Stadt.findeStadtByName(stadtList7, "A");

        Stadt zielStadt7 = Stadt.findeStadtByName(stadtList7, "B");

        listenBeerbeiten(stadtList7, verbindungTests7);

        Problem problem7 = new Problem(startStadt7, zielStadt7, verbindungTests7, stadtList7, 410, 460);
        Knoten knoten7 = ASuche.aSternSuche(problem7);
        System.out.println("Knoten 7: " + knoten7);
        System.out.println("Gesamte Kosten : " + knoten7.getgKosten());



/*       // 1. Daten einlesen
        System.out.println("------------------------bigGraph_lesen------------------------------");
        List<Stadt> stadtMitHS = DatenEinlesen.leseStaedte("src/data/bigGraph_cities.txt");

        List<StartUndzielStadt> startUndzielStadts = DatenEinlesen.stadtPaaren("src/data/testcases_bigGraph.txt");

        List<Verbindung> bigGraph_connections = DatenEinlesen.leseVerbindungen("src/data/bigGraph_connections.txt");

        //2. Start und Zielstadt finden
        //2.1.Schleife für alle Start und Zielstädte
        //2.2. Ladestationen duplizieren mit der Methode listenBeerbeiten
        //2.3. Problem erstellen
        //2.4.Startstadt erstellen
        //2.5. Zielstadt erstellen
        // 3. Problemerstellen und auf den A Sterne Algorithmus anwenden


        // Test vor dem for schleife
        // Hünfeld;Elmshorn
        listenBeerbeiten(stadtMitHS, bigGraph_connections);
        Stadt startStadt = Stadt.findeStadtByName(stadtMitHS, "Hünfeld");

        Stadt zielStadt = Stadt.findeStadtByName(stadtMitHS, "Elmshorn");
        startStadt.setH((int)Heuristik.haversine_distance(startStadt.getLat(), startStadt.getLon(), zielStadt.getLat(), zielStadt.getLon()));
        System.out.println("StartStadt : " + startStadt);
        System.out.println("ZielStadt : " + zielStadt);
        Problem problem = new Problem(startStadt, zielStadt, bigGraph_connections, stadtMitHS, 200, 0);
        Knoten knoten = ASucheBigData.aSternSuche(problem);
        System.out.println("Knoten BigData first test: " + knoten);*/


    }

    public static void listenBeerbeiten(List<Stadt> stadtList2, List<Verbindung> verbindungTests2) {
        List<Stadt> staedteMitLadestation = Stadt.staeteMitLadestationList(stadtList2);
        List<Verbindung> verbindungenMitLadestation = new ArrayList<>();

        System.out.println("Staedte mit Ladestation : " + staedteMitLadestation);



        for (Stadt stadtMitLadestation : staedteMitLadestation) {

            verbindungenMitLadestation.addAll( Verbindung.findeVerbindungByStadt(verbindungTests2, stadtMitLadestation.getName()));

        }

        Stadt.setAllStaedteAufFalse(stadtList2);
        System.out.println(stadtList2);
        for(Verbindung verbindungMitLadestation : verbindungenMitLadestation){


            for(Stadt stadtMitLadestation : staedteMitLadestation){

                if(stadtMitLadestation.getName().equals(verbindungMitLadestation.getStadt1())){
                    Verbindung verbindung = new Verbindung(verbindungMitLadestation.getStadt1() + "l", verbindungMitLadestation.getStadt2() , verbindungMitLadestation.getEntfernung()+10);

                    // old implementation had the value of the connection +10, I removred + 10 and just put the vaule of the connection
                    Verbindung verbindung2 = new Verbindung(verbindungMitLadestation.getStadt2() , verbindungMitLadestation.getStadt1() + "l", verbindungMitLadestation.getEntfernung());

                    verbindungTests2.add(verbindung);
                    verbindungTests2.add(verbindung2);
                    Stadt ladestation = new Stadt(verbindung.getStadt1(), Stadt.findeHByName(stadtList2, verbindungMitLadestation.getStadt1()), true);
                    stadtList2.add(ladestation);

                } else if (stadtMitLadestation.getName().equals(verbindungMitLadestation.getStadt2())) {
                    Verbindung verbindung = new Verbindung(verbindungMitLadestation.getStadt1(), verbindungMitLadestation.getStadt2() + "l", verbindungMitLadestation.getEntfernung());

                    // old implementation had the value of the connection +10, I removred + 10 and just put the vaule of the connection
                    Verbindung verbindung2 = new Verbindung(verbindungMitLadestation.getStadt2() + "l", verbindungMitLadestation.getStadt1(), verbindungMitLadestation.getEntfernung()+10);

                    verbindungTests2.add(verbindung);
                    verbindungTests2.add(verbindung2);
                    Stadt ladestation = new Stadt(verbindung2.getStadt1(), Stadt.findeHByName(stadtList2, verbindungMitLadestation.getStadt2()), true);
                    stadtList2.add(ladestation);
                }

            }



        }


    }


}
