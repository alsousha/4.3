public class CreditPaymentService {
    public int culculate(int sum, int creditTerm, double procent) {
        int monthPay = (int) (sum * (procent / 1200 * Math.pow(1 + procent / 1200, creditTerm)) / (Math.pow(1 + procent / 1200, creditTerm) - 1));
        return monthPay;
    }
}
