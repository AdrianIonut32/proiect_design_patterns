public class ProductionHouse implements Convertor {
     private String adress;
     private int price;
     private int floors;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSpace() {
        return floors;
    }

    public void setFloors(Integer space) {
        this.floors = space;
    }

    public static ProductionHouse getProductionHouse() {
        return productionHouse;
    }

    public static void setProductionHouse(ProductionHouse productionHouse) {
        ProductionHouse.productionHouse = productionHouse;
    }

    private static ProductionHouse productionHouse = new ProductionHouse();

    private ProductionHouse() {

    }

    public static synchronized ProductionHouse getInstance(String adress,int price,int space) {
        productionHouse.floors = space;
        productionHouse.price = price;
        productionHouse.adress = adress;
        return productionHouse;
    }

    @Override
    public int final_price() {
        return price*floors;
    }
}
