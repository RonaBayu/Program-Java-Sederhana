public class Harley extends Motor{
    private int weight;

    Harley(int speed, double regularPrice, String color, int weight){
        super(speed, regularPrice, color);
        this.weight= weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    double getSalePrice(){
        salePrice = 0;
     if(weight > 2000) {
         salePrice = super.getRegularPrice() * 0.9;
     }
     else {
         salePrice = super.getRegularPrice() * 0.8;
     }
     return salePrice;
    }
}
