package savez;

import osoblje.Igrac;
import osoblje.Menadzer;
import osoblje.Trener;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tim {
    private String naziv;
    private LocalDate datumOsnivanja;
    private List<Igrac> igraci;
    private List<Trener> treneri;
    private Menadzer menadzer;


    public Tim(String naziv, LocalDate datumOsnivanja) {
        this.naziv = naziv;
        this.datumOsnivanja = datumOsnivanja;

        igraci = new ArrayList<Igrac>();
        treneri = new ArrayList<Trener>();
    }

    public List<Igrac> getIgraci() {
        return igraci;
    }

    public List<Trener> getTreneri() {
        return treneri;
    }

    public Menadzer getMenadzer() {
        return menadzer;
    }

    public void potpisiUgovor(Menadzer menadzer, LocalDate datumIsteka) {
        menadzer.potpisiUgovor(datumIsteka);
        this.menadzer = menadzer;
    }

    public void potpisiUgovor(Igrac zaposleni, LocalDate datumIsteka) {
        zaposleni.potpisiUgovor(datumIsteka);
        igraci.add(zaposleni);
    }

    public void potpisiUgovor(Trener zaposleni, LocalDate datumIsteka) {
        zaposleni.potpisiUgovor(datumIsteka);
        treneri.add(zaposleni);
    }

    @Override
    public String toString() {
        String str = String.format("Tim %s (%d.%d.%d.)", naziv, datumOsnivanja.getDayOfMonth(),
                datumOsnivanja.getMonthValue(),
                datumOsnivanja.getYear());

        str += "\n" + menadzer;

        Collections.sort(igraci);
        for (Igrac igrac : igraci) {
            str += "\n" + igrac;
        }

        Collections.sort(treneri);
        for (Trener trener : treneri) {
            str += "\n" + trener;
        }

        return str;

    }
}
