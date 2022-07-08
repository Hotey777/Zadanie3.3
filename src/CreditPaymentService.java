public class CreditPaymentService {

    public String calculate(int credit, int time, double procent) {
        double k;
        double mps;
        double l;
        double s;
        double result;

        mps = (procent / 12) / 100; //Месячная процентная ставка
        l = (1 + mps);
        s = Math.pow(l, time); //Возведение в степень
        k = (mps * s) / (s - 1); //коэффициент аннуитета
        result = credit * k; //Результат
        String m = String.format("%.0f", result); //Округление

        return m;
    }
}
