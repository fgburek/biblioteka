public class Biblioteka {

    public Biblioteka() {
    }

    public void dodajNowegoCzytelnika (String imie, String nazwisko, String dataur, int nrczyt){
        Czytelnik czyt1 = new Czytelnik(imie, nazwisko, dataur, nrczyt, 0);
    }

}
