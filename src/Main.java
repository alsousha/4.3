public class Main {
    public static void main(String[] args) {
        CreditPaymentService obj = new CreditPaymentService();
        System.out.println(obj.culculate(1000000, 12, 9.99));
        System.out.println(obj.culculate(1000000, 24, 9.99));
        System.out.println(obj.culculate(1000000, 36, 9.99));
    }
}
