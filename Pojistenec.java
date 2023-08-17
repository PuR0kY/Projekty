public class Pojistenec {


    private int vek;
    private String name;
    private String prijmeni;
    private int telefonniCislo;
    public int getVek() {
        return vek;
    }

    public String getName() {
        return name;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getTelefonniCislo() {
        return telefonniCislo;
    }


    public Pojistenec(String name, String prijmeni, int telefonniCislo, int vek){
        this.name = name;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }
}