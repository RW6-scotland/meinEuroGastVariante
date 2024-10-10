import java.util.ArrayList;

public class ExportCSV extends Export{



    public void exporter(ArrayList<Artikel> artikel){

        System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
        for (Artikel a : artikel){
            System.out.println(a.getNummer() + ";" + a.getBezeichnung() + ";" + a.getEinkaufspreis() + ";" + a.getAblaufdatum() + ";" + a.getKategorienummer());
        }

    }


}
