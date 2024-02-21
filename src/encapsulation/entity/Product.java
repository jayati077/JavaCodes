package encapsulation.entity;

public class Product {
    private long product_Id;
    private String product_Name;
    private String product_description;
    private  float avg_Rating;

//parameterised Constructor

    public Product(long product_Id, String product_Name, String product_description, float avg_Rating) {
        this.product_Id = product_Id;
        this.product_Name=product_Name;
        this.product_description=product_description;
        this.avg_Rating=avg_Rating;
        System.out.println("Thee are called parameteried Contructor:");

    }
    //getters and setters
    public long getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(long product_Id) {
        this.product_Id = product_Id;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public float getAvg_Rating() {
        return avg_Rating;
    }

    public void setAvg_Rating(float avg_Rating) {
        this.avg_Rating = avg_Rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_Id=" + product_Id +
                ", product_Name='" + product_Name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", avg_Rating=" + avg_Rating +
                '}';

    }
}
