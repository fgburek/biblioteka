public class Main {
    public  static void main(String[] args){

        Biblioteka bibl1 = new Biblioteka();
        bibl1.dodajNowegoCzytelnika("Antek", "Gburek", "26-04-2006", 123);

        Czytelnik czyt2 = new Czytelnik("Franek", "Kowalski", "13-12-2007", 765, 0);
        System.out.println(czyt2.getimie());
    }



}
