public class Czytelnik extends Osoba{
    private int nrCzytenika;
    private int WypozyczoneKsiazki;

    public Czytelnik(String imie, String nazwisko, String dataUr, int nrCzytenika, int wypozyczoneKsiazki) {
        super(imie, nazwisko, dataUr);
        this.nrCzytenika = nrCzytenika;
        WypozyczoneKsiazki = wypozyczoneKsiazki;
    }

    @Override
    public String toString() {
        return "Czytelnik{" +
                "nrCzytenika=" + nrCzytenika +
                ", WypozyczoneKsiazki=" + WypozyczoneKsiazki +
                "} " + super.toString();
    }
}
