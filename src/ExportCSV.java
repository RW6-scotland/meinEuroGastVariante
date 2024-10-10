import java.util.ArrayList;

public class ExportCSV extends Export{

    public ExportCSV(ArrayList<Artikel> artikel) {
        super(artikel);
    }

    public void exporter(){

        System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
        for (Artikel a : getArtikelListe()){
            System.out.println(a.getNummer() + ";" + a.getBezeichnung() + ";" + a.getEinkaufspreis() + ";" + a.getAblaufdatum() + ";" + a.getKategorienummer());
        }

    }


}
