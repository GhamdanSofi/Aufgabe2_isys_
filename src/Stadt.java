import java.util.List;

public class Stadt {

    String name;
    int h;
    public double lat;
    public double lon;
    boolean ladestation;

    Stadt(String name, int h, boolean ladestation) {
        this.name = name;
        this.h = h;
        this.ladestation = ladestation;
    }

    public Stadt(String name, double lat, double lon, boolean ladestation) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.ladestation = ladestation;
    }

    public Stadt() {
    }

    @Override
    public String toString() {
        return "Stadt{" +
                "name='" + name + '\'' +
                ", h=" + h +
                ", ladestation=" + ladestation +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public boolean getLadestation() {
        return ladestation;
    }

    public void setLadestation(boolean ladestation) {
        this.ladestation = ladestation;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public boolean isLadestation() {
        return ladestation;
    }

    /*    public static <T extends Stadt> T findeStadtByName(List<T> staedte, String name) {

        return staedte.stream()
                .filter(stadt -> stadt.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Stadt mit dem Namen " + name + " nicht gefunden"));
    }*/

    public static Stadt findeStadtByName(List<Stadt> staedte, String name) {

        return staedte.stream()
                .filter(stadt -> stadt.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Stadt mit dem Namen " + name + " nicht gefunden"));
    }


    public static List<Stadt> staeteMitLadestationList(List<Stadt> staedte) {
        return staedte.stream()
                .filter(Stadt::getLadestation)
                .toList();
    }

    public static void setAllStaedteAufFalse(List<Stadt> staedte) {

        for(Stadt stadt : staedte ){
            stadt.setLadestation(false);
        }

    }
    public static int findeHByName(List<Stadt> staedte, String name) {

        for (Stadt stadt : staedte) {
            if (stadt.getName().equals(name)) {
                return stadt.getH();
            }
        }

        return 0;
    }

}
