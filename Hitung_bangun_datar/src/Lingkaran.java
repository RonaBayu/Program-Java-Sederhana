public class Lingkaran extends BangunDatar{
    private double jariJari;
    private double diameter;

    Lingkaran (){
        this.jariJari=0;
        this.diameter=0;
    }

//    Lingkaran (double jariJari){
//        this.jariJari=jariJari;
//        this.diameter=0;
//    }


    public double getJariJari() {
        return jariJari;
    }

    public double getDiameter() {
        return jariJari*2;
    }

//    public void setDiameter(double diameter) {
//        this.diameter = diameter;
//    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void luas (){
        System.out.println("Luas lingkaran dengan jari jari "+jariJari+" adalah = " + Math.PI * jariJari * jariJari);
    }



    public void keliling() {
        System.out.println("Keliling lingkaran dengan jari jari " + jariJari + " adalah = " + Math.PI * jariJari * 2);
    }
}

