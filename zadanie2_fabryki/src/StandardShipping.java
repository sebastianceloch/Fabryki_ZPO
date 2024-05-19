public class StandardShipping implements ShippingStrategy {
    @Override
    public void ship(String address) {
        System.out.println("Wysyłka standardowa do: " + address);
    }
}