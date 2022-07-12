public class CreditPaymentService {

    public String calculate(int credit, int time, double procent) {
        double coefficient;
        double rate;
        double sum;
        double degree;
        double result;

        rate = (procent / 12) / 100; //Месячная процентная ставка
        sum = (1 + rate);
        degree = Math.pow(sum, time); //Возведение в степень
        coefficient = (rate * degree) / (degree - 1); //коэффициент аннуитета
        result = credit * coefficient; //Результат
        String rounding = String.format("%.0f", result); //Округление

        return rounding;
    }
}
