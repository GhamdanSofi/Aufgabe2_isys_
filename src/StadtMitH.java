public class StadtMitH {

    public String name;
    public double lat;
    public double lon;
    public boolean ladestation;

    public StadtMitH(String name, double lat, double lon, boolean ladestation) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.ladestation = ladestation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setLadestation(boolean ladestation) {
        this.ladestation = ladestation;
    }

    public String toString() {
        return "Name: " + name + ", Lat: " + lat + ", Lon: " + lon + ", Ladestation: " + ladestation;
    }

}
