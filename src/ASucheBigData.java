import java.util.*;

public class ASucheBigData {


    public ASucheBigData() {
    }

    public static /*PriorityQueue<Knoten>*/ Knoten aSternSuche(Problem problem) {
        //int counterOfLadevorgangs = 0;
        Knoten startKnoten = new Knoten(problem.getStartStadt(), null, 0, 0, problem.getAkkuReichweite());
        PriorityQueue<Knoten> grenze = new PriorityQueue(Comparator.comparingDouble(Knoten::getfKosten));
        Map<Stadt, Knoten> erreicht = new HashMap();

        grenze.add(startKnoten);
        erreicht.put(problem.getStartStadt(), startKnoten);

        while (!grenze.isEmpty()) {
            Knoten aktuellerKnoten = grenze.poll();

            System.out.println("Hallo I am the fucking Node  " + aktuellerKnoten.getAktuelleStadt().getName());

            if (istZiel(aktuellerKnoten, problem.getZielStadt())) {
                System.out.println("Ziel erreicht");
                //int test1 = aktuellerKnoten.gKosten + counterOfLadevorgangs * 10;
                // aktuellerKnoten.setgKosten(test1);
                return aktuellerKnoten;
            }

            if (aktuellerKnoten.getVorgaenger() != null ){
                aktuellerKnoten.setAktuelleAkku((int)((aktuellerKnoten.getAktuelleAkku()) - (aktuellerKnoten.getgKosten() - aktuellerKnoten.getVorgaenger().getgKosten())));
            }

            for (Knoten nachfolger : nachfolgerGenerieren(aktuellerKnoten, problem)) {
                //problem.setAkkuReichweite();

/*                for (Stadt stadt1: erreicht.keySet()){
                    if (nachfolger.getAktuelleStadt().getLadestation()&& erreicht.get(stadt1).getgKosten()<aktuellerKnoten.gKosten) continue;
                }*/
//                if ((nachfolger.getAktuelleStadt().getLadestation())&&(erreicht.get(aktuellerKnoten.aktuelleStadt.getName()).getgKosten()<aktuellerKnoten.gKosten)){
//                    continue;
//                }
                // if (((! && !aktuellerKnoten.getAktuelleStadt().getLadestation()) || ((Knoten) erreicht.get(nachfolger.getAktuelleStadt())).getfKosten() > nachfolger.getfKosten()) ) {

                if(erreicht.containsKey(nachfolger.getAktuelleStadt()) ){
                    if (erreicht.get(nachfolger.getAktuelleStadt()).getfKosten() < nachfolger.getfKosten()){
                        if (aktuellerKnoten.getAktuelleStadt().getLadestation()){
                            if (aktuellerKnoten.getAktuelleStadt().getLadestation() && !aktuellerKnoten.equals(startKnoten) ) {
                                if (aktuellerKnoten.getAktuelleAkku()<= aktuellerKnoten.gethKosten()){
                                    aktuellerKnoten.setAktuelleAkku(problem.getMAX_Akkureichweite());
                                    aktuellerKnoten.setgKosten(aktuellerKnoten.getgKosten());
                                    //counterOfLadevorgangs++;
                                    nachfolger.setAktuelleAkku(problem.getMAX_Akkureichweite());
                                    nachfolger.setgKosten(nachfolger.gKosten);
                                    // entfernung = nachfolger.getgKosten() - aktuellerKnoten.getgKosten();
                                }
                                // das Logik wurde innerhalb das If-Statement eingefügt
                                //if(nachfolger.gKosten- aktuellerKnoten.gKosten>= aktuellerKnoten.aktuelleAkku){

                                //}
//                        else {
//                            nachfolger.aktuelleAkku=(problem.getMAX_Akkureichweite());
//                            entfernung = nachfolger.getgKosten() - aktuellerKnoten.getgKosten();
//
//                        }


                            }
                        }
                    }

                /*

                    System.out.println("Nachfolger: " + nachfolger);
*/


//                    if (!aktuellerKnoten.getAktuelleStadt().getName().equals(startKnoten.getAktuelleStadt().getName())) {

                    //problem.setAkkuReichweite(problem.getAkkuReichweite() - entfernung);
                    //(aktuellerKnoten.aktuelleAkku>= nachfolger.gKosten- aktuellerKnoten.gKosten)&& (nachfolger.aktuelleAkku<0&& nachfolger.aktuelleStadt.ladestation)

//                        if (problem.getAkkuReichweite() <= aktuellerKnoten.getgKosten()) {
//
// /*                       System.out.println("Akku Reichweite reicht nicht bis zum Ziel");
//                        System.out.println("Akku Reichweite : " + problem.getAkkuReichweite());
//                        System.out.println("Entfernung : " + entfernung);
//                        System.out.println("Auto muss an eine Ladestation");*/
//



                }

                if ((!istZiel(nachfolger, problem.getZielStadt())) && (nachfolger.gKosten - aktuellerKnoten.gKosten >= aktuellerKnoten.aktuelleAkku) && (!nachfolger.aktuelleStadt.ladestation)) {
                    continue;
                }

                if ((istZiel(nachfolger, problem.getZielStadt()))&&(nachfolger.gKosten - aktuellerKnoten.gKosten >aktuellerKnoten.aktuelleAkku)){
                    continue;
                }
                /*
                if ((nachfolger.gKosten - aktuellerKnoten.gKosten == aktuellerKnoten.aktuelleAkku)&&(!nachfolger.aktuelleStadt.ladestation)){
                    continue;
                }*/



                grenze.add(nachfolger);
                erreicht.put(nachfolger.getAktuelleStadt(), nachfolger);
            }
        }

//        }

        return null;
    }

    public static boolean istZiel(Knoten aktuellerKnoten, Stadt zielStadt) {
        return aktuellerKnoten.getAktuelleStadt().getName().equals(zielStadt.getName());
    }


    public static List<Knoten> nachfolgerGenerieren(Knoten aktuellerKnoten, Problem problem) {
        List<Knoten> nachfolger = new ArrayList<>();
        for (Verbindung verbindung : problem.getVerbindungen()) {
            if (verbindung.getStadt1().equals(aktuellerKnoten.getAktuelleStadt().getName())) {
                Stadt stadt1 = Stadt.findeStadtByName(problem.getStaedte(), verbindung.getStadt2());
                nachfolger.add(new Knoten(stadt1, aktuellerKnoten, aktuellerKnoten.getgKosten() + verbindung.getEntfernung(), (int) Heuristik.haversine_distance(stadt1.getLat(), stadt1.getLon(), problem.getZielStadt().getLat(), problem.getZielStadt().getLon()), /*aktuellerKnoten.aktuelleAkku- verbindung.entfernung*/aktuellerKnoten.aktuelleAkku));

/*            if (verbindung.getStadt2().equals(aktuellerKnoten.getAktuelleStadt())) {
                nachfolger.add(new Knoten(verbindung.getStadt1(), aktuellerKnoten, aktuellerKnoten.getgKosten() + verbindung.getKosten(), aktuellerKnoten.getgKosten() + verbindung.getKosten() + Heuristik.berechneHaversineDistanz(verbindung.getStadt1(), verbindung.getStadt2())));
            }*/
            }
        }
/*
        System.out.println("Nachfolger in der Methode : " + nachfolger);
*/

        return nachfolger;
    }


}
