package diagramClass;

import java.util.ArrayList;
import java.util.List;

public class Duty extends ObjectPlusPlus{
    private int id;
    private String dataDyzuru;
    private int czasTrwania;
    private int liczbaPrzyjetychKlientow;
    //Zwykla asocjacja binarna
    public int[] wizytaIds;
    public int[] stomatologIds;

    private static List<Duty> extent = new ArrayList<>();

    public Duty(int id, String dataDyzuru, int czasTrwania, int liczbaPrzyjetychKlientow, int[] wizytaIds, int[] stomatologIds) {
        extent.add(this);
        this.id = id;
        this.dataDyzuru = dataDyzuru;
        this.czasTrwania = czasTrwania;
        this.liczbaPrzyjetychKlientow = liczbaPrzyjetychKlientow;
        this.wizytaIds = wizytaIds;
        this.stomatologIds = stomatologIds;
    }

    private double obliczPremie(double czaspracy){
        //TO DO
        return Double.parseDouble(null);
    }
}
