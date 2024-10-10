import java.util.ArrayList;

public class ExportJSON extends Export{

    public ExportJSON(ArrayList<Artikel> artikel) {
        super(artikel);
    }

    @Override
    public void exporter() {
        System.out.println("[");
        for(Artikel a : getArtikelListe()){
            System.out.println("{");
            System.out.println("Nummer: " + a.getNummer());
            System.out.println("Bezeichnung: " + a.getBezeichnung());
            System.out.println("Einkaufspreis: " + a.getEinkaufspreis());
            System.out.println("Ablaufdatum: " + a.getAblaufdatum());
            System.out.println("Kategorienummer: " + a.getKategorienummer());
            System.out.println("}");
        }
        System.out.println("]");
    }


}
