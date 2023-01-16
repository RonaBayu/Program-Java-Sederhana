
class Segitiga extends BangunDatar{

    private double alas;
    private double tinggi;

    Segitiga (){
        this.alas=0;
        this.tinggi=0;
    }
//    ini adalah overloading constructor untuk opsi kedua
    Segitiga (double alas , double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void luas (){
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi "+ tinggi + " adalah = " + 0.5*alas*tinggi);
    }
    public void keliling (){
        double miring = Math.sqrt ((alas*alas)+(tinggi*tinggi));
        System.out.println("Keliling segitiga dengan alas " + alas + " dan tinggi "+ tinggi + " adalah = " + alas+tinggi+miring) ;
    }
}

