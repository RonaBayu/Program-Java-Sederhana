public class Honda extends Motor{
    private int year;
    private int manufacturerDiscount ;

    Honda (int speed, double regularPrice, String color, int year , int manufacturerDiscount){
        super(speed, regularPrice, color);
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    //diskon dalam bentuk persen.
    double getSalePrice(){
        return super.getRegularPrice() * (1-(manufacturerDiscount*0.01));
    }
}
