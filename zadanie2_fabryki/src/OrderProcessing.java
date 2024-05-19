public class OrderProcessing {
    private ShippingStrategy shippingStrategy;

    public OrderProcessing(String shippingMethod){
        this.shippingStrategy = ShippingFactory.getShippingMethod(shippingMethod);
    }

    public void processOrder(String address){
        shippingStrategy.ship(address);
    }
}
