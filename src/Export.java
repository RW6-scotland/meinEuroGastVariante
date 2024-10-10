import java.util.ArrayList;

public abstract class Export {

    private ArrayList<Artikel> artikelListe;

    public Export(ArrayList<Artikel> artikel) {
        this.artikelListe = artikel;
    }

    public ArrayList<Artikel> getArtikelListe() {
        return artikelListe;
    }

    public abstract void  exporter();
}
