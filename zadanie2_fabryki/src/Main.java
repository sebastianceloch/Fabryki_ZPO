public class Main {
    public static void main(String[] args) {

        OrderProcessing o1 = new OrderProcessing("standard");
        o1.processOrder("Kanafojskiego 4, Olsztyn");

        OrderProcessing o2 = new OrderProcessing("express");
        o2.processOrder("Kasztanska 1 Warszawa");

        OrderProcessing o3 = new OrderProcessing("international");
        o3.processOrder("Sklepowa 12 Warszawa");
    }
}