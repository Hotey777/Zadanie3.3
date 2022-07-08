public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платёж на 1 год: ");
        System.out.println(service.calculate(1_000_000,12,9.99));

        System.out.println();
        System.out.println("Ежемесячный платёж на 2 года: ");
        System.out.println(service.calculate(1_000_000,24,9.99));

        System.out.println();
        System.out.println("Ежемесячный платёж на 3 года: ");
        System.out.println(service.calculate(1_000_000,36,9.99));
    }
}
