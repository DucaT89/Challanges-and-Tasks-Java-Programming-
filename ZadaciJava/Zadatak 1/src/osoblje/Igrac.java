package osoblje;

public class Igrac extends Zaposleni implements Comparable<Igrac> {

    private String pozicija;

    public Igrac(String ime, String prezime, String pozicija) {
        super(ime, prezime);
        this.pozicija = pozicija;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    @Override
    public String toString() {
        return this.getIme() + " " + this.getPrezime() + " - Igrac (" + pozicija + ")";
    }

    @Override
    public int compareTo (Igrac o) {
            return pozicija.compareTo(o.pozicija);
        }
    }
