public class Pay {
    private static double hoursWorked = 8.00;
    private static double rateOfPayPerHour = 100.00;

    public static void main(String[] args) {
        computeNetPay(8.00, 100.00, 20);
        computeNetPay(8.00, 100.00);
        computeNetPay(8.00);
    }

    public static void computeNetPay(double hours, double rate, double withholdingRate) {
        double grossPay = hours * rate;
        double withholdingAmount = grossPay * withholdingRate / 100;
        double netPay = grossPay - withholdingAmount;

        System.out.println("Per hour: " + hours);
        System.out.println("Pay rate: " + rate);
        System.out.println("Withholding rate: " + withholdingRate);
        System.out.println("Net pay: " + netPay);
        System.out.println();
    }

    public static void computeNetPay(double hours, double rate) {
        computeNetPay(hours, rate, 10);
    }

    public static void computeNetPay(double hours) {
        computeNetPay(hours, 100.0, 5.65); 
    }
}
