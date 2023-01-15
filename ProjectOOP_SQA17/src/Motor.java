public class Motor{
    private int speed;
    private double regularPrice;
    private String color;
    double salePrice;
    private String nama = "" ;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    Motor(int speed, double regularPrice, String color){
        this.regularPrice = regularPrice;
        this.speed = speed;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getRegularPrice() {
        return regularPrice;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    double getSalePrice(){
        return regularPrice;
    }
    void display(){
        System.out.println("harga awal dari motor "+ this.nama + " adalah Rp." + String.format("%,.2f", this.getRegularPrice()));
        System.out.println("Harga jual motor " + this.nama + " setelah mendapat diskon adalah Rp." + String.format("%,.2f", this.getSalePrice()));
        System.out.println("Motor " + this.nama + " mempunyai warna " + this.color+".");
        System.out.println("Motor " + this.nama + " memiliki speed sampai dengan " + this.speed + " km/jam.");
    }
}
