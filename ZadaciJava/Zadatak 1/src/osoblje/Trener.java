package osoblje;

public  class Trener extends Zaposleni implements Comparable<Trener>{

    private String zaduzenje;

    public Trener(String ime, String prezime, String zaduzenje) {
        super(ime, prezime);
        this.zaduzenje = zaduzenje;
    }

    public String getZaduzenje() {
        return zaduzenje;
    }

    public void setZaduzenje(String zaduzenje) {
        this.zaduzenje = zaduzenje;
    }

    @Override
    public String toString() {
        return this.getIme() + " " + this.getPrezime() + " - Trener (" + zaduzenje +")";

    }

    @Override
    public int compareTo(Trener o) {
        return zaduzenje.compareTo(o.zaduzenje);
    }
}
