import java.util.Date;

public class Osoba {
    private String Imie;
    private String Nazwisko;
    private String DataUr;

    public Osoba(String imie, String nazwisko, String dataUr) {
        Imie = imie;
        Nazwisko = nazwisko;
        DataUr = dataUr;
    }

    public void setimie(String imie1){
        Imie = imie1;
    }
    public String getimie(){
        return Imie;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", DataUr='" + DataUr + '\'' +
                '}';
    }




}
