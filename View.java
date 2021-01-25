public class View {

    private String productId;
    private Integer price;

    public View(String productId, Integer price) {
        this.productId = productId;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public Integer getPrice() {
        return price;
    }
}
