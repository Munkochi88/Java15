package Mentoring;

public class thousandDays {
    public static void thousand(int num) {
        int years, months, days;
        years = num / 365; // 2
        months = (num % 365) / 30;
        days = (num % 365) % 30;


        System.out.println("Years: " + years + ", " + "Months: " + months + ", Days: " + days);
    }

    public static void main(String[] args) {
        int num = 1015;
        thousand(num);

    }
}
