public class Heuristik {

    private static final int ERDRADIUS = 6371; // Radius der Erde in Kilometern

   /* public static double berechneHaversineDistanz(StadtMitH stadtMitH1, StadtMitH stadtMitH2) {
        double lat1 = Math.toRadians(stadtMitH1.lat);
        double lon1 = Math.toRadians(stadtMitH1.lon);
        double lat2 = Math.toRadians(stadtMitH2.lat);
        double lon2 = Math.toRadians(stadtMitH2.lon);

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1) * Math.cos(lat2) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return ERDRADIUS * c; // Distanz in Kilometern
    }
*/
    /**
     *
     * @param lat1 Latitude of location 1
     * @param lon1 Longitude of location 1
     * @param lat2 Latitude of location 2
     * @param lon2 Longitude of location 2
     * @return Haversine distance between the two locations
     */
    public static double haversine_distance(double lat1, double lon1, double lat2, double lon2) {
        final int d = 12742;
        double sinHalfDeltaLat = Math.sin(Math.toRadians(lat2 - lat1) / 2);
        double sinHalfDeltaLon = Math.sin(Math.toRadians(lon2 - lon1) / 2);
        double latARadians = Math.toRadians(lat1);
        double latBRadians = Math.toRadians(lat2);
        double a = sinHalfDeltaLat * sinHalfDeltaLat
                + Math.cos(latARadians) * Math.cos(latBRadians) * sinHalfDeltaLon * sinHalfDeltaLon;
        return d * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    }

}

