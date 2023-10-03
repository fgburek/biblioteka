import java.util.Date;

public class Bibliotekarz extends Osoba{
    private String DataZatrudnienia;

    public Bibliotekarz(String imie, String nazwisko, String dataUr, String dataZatrudnienia) {
        super(imie, nazwisko, dataUr);
        DataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "Bibliotekarz{" +
                "DataZatrudnienia='" + DataZatrudnienia + '\'' +
                "} " + super.toString();
    }
}
