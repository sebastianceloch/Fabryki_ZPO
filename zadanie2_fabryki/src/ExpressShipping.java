public class ExpressShipping implements ShippingStrategy {
    @Override
    public void ship(String address) {
        System.out.println("Wysyłka ekspresowa do: " + address);
    }
}