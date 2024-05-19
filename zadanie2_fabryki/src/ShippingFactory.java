public class ShippingFactory {
    public static ShippingStrategy getShippingMethod(String method) {
        switch (method.toLowerCase()) {
            case "standard":
                return new StandardShipping();
            case "express":
                return new ExpressShipping();
            case "international":
                return new InternationalShipping();
            default:
                throw new IllegalArgumentException("Nieznana metoda wysyłki: " + method);
        }
    }
}