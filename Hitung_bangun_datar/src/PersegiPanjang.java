class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    PersegiPanjang (){
        this.panjang=0;
        this.lebar=0;
    }
    PersegiPanjang(double panjang , double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void luas (){
        System.out.println("Luas persegi panjang dengan panjang "+ panjang + " dan lebar "+ lebar + " adalah = " + panjang*lebar);
    }
    public void keliling (){
        System.out.println("Keliling persegi panjang dengan panjang " + panjang +" dan lebar " + lebar + " adalah = " + ((panjang*2)+(lebar*2)));
    }
}



