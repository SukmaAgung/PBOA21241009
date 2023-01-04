public class Pegawai {
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajipokok;
    private double gajibersih;


public Pegawai (String nama, String jabatan, double pajak){
    this.nama = nama;
    this.jabatan = jabatan;
    this.pajak = pajak;
}

public void setGajiPokok(double gajipokok){
    this.gajipokok = gajipokok;
}
public double getGajiBersih(){
    return gajibersih;
}
}