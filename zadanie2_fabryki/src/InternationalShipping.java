public class InternationalShipping implements ShippingStrategy {
    @Override
    public void ship(String address) {
        System.out.println("Wysyłka międzynarodowa do: " + address);
    }
}