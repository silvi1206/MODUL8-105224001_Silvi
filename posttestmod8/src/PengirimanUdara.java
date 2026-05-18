public class PengirimanUdara extends LayananPengiriman implements Asuransi, LacakKargo {

    private String nomorPenerbangan;
    private String statusSaatIni;
    private Double nilaiBarang;

    // constructor
    public PengirimanUdara(String noResi,Double beratBarang,Double jarakTempuh,String nomorPenerbangan, Double nilaiBarang) {

        super(noResi, beratBarang, jarakTempuh);
        this.nomorPenerbangan = nomorPenerbangan;
        this.nilaiBarang = nilaiBarang;

        // status awal
        statusSaatIni = "Menunggu Jadwal Penerbangan";
    }

    public String getNomorPenerbangan() {

        return nomorPenerbangan;
    }

    public Double getNilaiBarang() {

        return nilaiBarang;
    }

    // override hitung ongkir
    @Override
    public Double hitungOngkosKirim() {

        return (beratBarang * 25000) + (jarakTempuh * 5000);
    }

    // update status
    @Override
    public void updateStatus(String status) {

        statusSaatIni = status;
    }

    // cek lokasi terakhir
    @Override
    public String cekLokasiTerakhir() {

        return statusSaatIni;
    }

    // hitung premi asuransi
    @Override
    public Double hitungPremi(Double nilaiBarang) {

        return nilaiBarang * 0.03;
    }

    
}
