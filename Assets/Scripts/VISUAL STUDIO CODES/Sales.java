public class Sales {
    public static void main(String[] args) {
        String[][] products = {
            {"Brief", "10.00", "5"},
            {"Panty", "5.00", "20"},
            {"Bra", "25.00", "1"}
        };

        double totalAmount = 0;

        System.out.println("Underwear\tUnit Price\tQuantity\tAmount");

        for (int i = 0; i < products.length; i++) {
            String product = products[i][0];  
            double unitPrice = Double.parseDouble(products[i][1]);  
            int quantity = Integer.parseInt(products[i][2]);  
            double amount = unitPrice * quantity;  

            totalAmount += amount;

            System.out.printf("%-10s\t%-10.2f\t%-10d\t%-10.2f%n", product, unitPrice, quantity, amount);
        }

        System.out.printf("\n\t\tTOTAL AMOUNT:\t\t%.2f%n", totalAmount);
    }
}
