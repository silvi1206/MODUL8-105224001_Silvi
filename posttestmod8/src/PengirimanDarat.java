public class PengirimanDarat extends LayananPengiriman implements LacakKargo {

    private String jenisTruk;
    private String statusSaatIni;

    // constructor
    public PengirimanDarat(String noResi,double beratBarang,double jarakTempuh,String jenisTruk) {

        // memanggil constructor parent
        super(noResi, beratBarang, jarakTempuh);

        this.jenisTruk = jenisTruk;

        // status awal
        this.statusSaatIni = "Menunggu Kurir";
    }

    // override method abstract
    @Override
    public Double hitungOngkosKirim() {

        double total =(beratBarang * 5000)+ (jarakTempuh * 2000);

        // cek apakah truk tronton
        if (jenisTruk.equalsIgnoreCase("Tronton")) {

            total += 150000;
        }

        return total;
    }

    // update status pengiriman
    @Override
    public void updateStatus(String status) {

        statusSaatIni = status;
    }

    // menampilkan status terakhir
    @Override
    public String cekLokasiTerakhir() {

        return statusSaatIni;
    }
}

