public class Yamaha extends Motor{
    private int cubicalCentimeter;

    Yamaha (int speed, double regularPrice, String color, int cubicalCentimeter){
        super(speed, regularPrice, color);
        this.cubicalCentimeter = cubicalCentimeter;
    }

    public int getCubicalCentimeter() {
        return cubicalCentimeter;
    }

    public void setCubicalCentimeter(int cubicalCentimeter) {
        this.cubicalCentimeter = cubicalCentimeter;
    }

    @Override
    double getSalePrice() {
        salePrice = 0;
        if (cubicalCentimeter > 250){
            salePrice = super.getRegularPrice() * 0.85;
        }else {
            salePrice = super.getRegularPrice() * 0.9;
        }
        return salePrice;
    }
}
