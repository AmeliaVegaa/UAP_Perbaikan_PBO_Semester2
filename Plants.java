import java.util.ArrayList;
import java.util.Scanner;

abstract class Plants {
    public int masaHidup;
    public int lamaHidup;
    public double prosesBerbunga;
    public int mahkotaBunga;
    public int berbunga;

    public Plants(int masaHidup, int berbunga, double perkembangan) {
        this.masaHidup = masaHidup;
        this.berbunga = berbunga;
        this.prosesBerbunga = 0;
        this.mahkotaBunga = 0;
        this.lamaHidup = 0;
    }

    public abstract void berkembang();

    public String status() {
        if (lamaHidup >= masaHidup) {
            return "Mati";
        } else {
            return "Hidup";
        }
    }

    public String toString() {
        return "Life Span\t: " + masaHidup + " Days\n" +
               "Plant Age\t: " + lamaHidup + " Days\n" +
               "Produce\t\t: " + mahkotaBunga + " Flowers\n" +
               "Status\t\t: " + status();
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getMahkotaBunga() {
        return mahkotaBunga;
    }

    public void setMahkotaBunga(int mahkotaBunga) {
        this.mahkotaBunga = mahkotaBunga;
    }

    public void treatment() {
    }
}