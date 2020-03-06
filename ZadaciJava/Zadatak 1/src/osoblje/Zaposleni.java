package osoblje;

import java.time.LocalDate;

public abstract class Zaposleni extends  Osoba{
    LocalDate datumPotpisivanja;
    LocalDate datumIsteka ;

    public Zaposleni(String ime, String prezime) {
        super(ime, prezime);
        this.datumPotpisivanja = LocalDate.now();
        this.datumIsteka = LocalDate.of(2020, 12, 30);
    }
    public LocalDate getDatumPotpisivanja(){
        return datumPotpisivanja;
    }
    public LocalDate getDatumIsteka(){
        return datumIsteka;
    }
    public void potpisiUgovor(LocalDate datumIstekaUgovora){
        this.datumPotpisivanja = LocalDate.now();
        this.datumIsteka = datumIstekaUgovora;
    }
}
