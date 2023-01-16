
class Persegi extends BangunDatar{
    private double panjangSisi;
    Persegi (){
        this.panjangSisi = 0;
    }

//    ini adalah overloading constructor untuk opsi kedua
    Persegi(double panjangSisi){
        this.panjangSisi=panjangSisi;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }

    public void setPanjangSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public void luas (){
        System.out.println("Luas persegi dengan panjang "+ panjangSisi +" adalah = " + panjangSisi*panjangSisi);
    }

    public void keliling (){
        System.out.println("Keliling persegi dengan panjang " + panjangSisi +" adalah = " + panjangSisi*4);
        }

}