package savez;

import java.util.ArrayList;
import java.util.List;

public class SportskoDrustvo {

    private String naziv, adresa;
    private List<Tim> timovi;

    public SportskoDrustvo(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.timovi = new ArrayList<>();
    }

    public void dodajTim(Tim tim) {
        if (tim == null) {
            return;
        }

        timovi.add(tim);
    }
    public int getBrojIgraca() {
        int sum = 0;
        for (Tim t : timovi) {
            sum += t.getIgraci().size();
        }
        return sum;
    }

    public int getBrojTrenera() {
        int sum = 0;
        for (Tim t : timovi) {
            sum += t.getTreneri().size();
        }
        return sum;
    }

    public int getBrojMenadzera() {
        int sum = 0;
        for (Tim t : timovi) {
            if (t.getMenadzer() != null) {
                sum += 1;
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        String str =  "Sportsko drustvo: "+ this.naziv+ ","+this.adresa+"\n" +
        "-----------------------------------" + "\n"+
                "Broj igraca: "+ this.getBrojIgraca()+"\n"+
                "Broj trenera: "+ this.getBrojTrenera() + "\n"+
                "Broj menadzera: "+ this.getBrojMenadzera()+"\n"+
                "-----------------------------------" + "\n";
                for(Tim t : timovi){
                    str += (t + "\n-----------------------------------\n");
                }
        return str;
    }
}
