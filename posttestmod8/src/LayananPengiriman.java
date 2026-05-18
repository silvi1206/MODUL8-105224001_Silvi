public abstract class LayananPengiriman {
    // Atribut
    protected String noResi;
    protected Double beratBarang;
    protected Double jarakTempuh;

    // Konstruktor
    public LayananPengiriman(String noResi, Double beratBarang, Double jarakTempuh) {
        this.noResi = noResi;
        this.beratBarang = beratBarang;
        this.jarakTempuh = jarakTempuh;
    }

    //method untuk nampilin data resi
    public void tampilkanDataResi() {
        System.out.println("No Resi: " + noResi);
        System.out.println("Berat Barang: " + beratBarang + " kg");
        System.out.println("Jarak Tempuh: " + jarakTempuh + " km");
    }

    public abstract Double hitungOngkosKirim();
    
}
