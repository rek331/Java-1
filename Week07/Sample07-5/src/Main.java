import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner kyeboard = new Scanner(System.in);
        int salary;
        int tax = 0;
        float rate = 0.0f;   // 세율 변수
        String message = "";

        System.out.print("당신의 급여액 입력:");
        salary = kyeboard.nextInt();

        if (salary >= 0 && salary <= 30000000) {   // 세미콜론 제거
            if (salary < 2000000) {
                tax = 0;
                rate = 0.0f;
            }
            else if (salary <= 4000000) {
                rate = 10.0f;
                tax = (int)(salary - 2000000 * (rate / 100));
            }
            else if (salary <= 6000000) {
                rate = 8.0f;
                tax = (int)(salary - 2000000 * (rate / 100));
            }
            else if (salary <= 20000000) {
                rate = 6.0f;
                tax = (int)(salary - 2000000 * (rate / 100));
            }
            else if (salary > 20000000) {
                rate = 5.0f;
                tax = (int)(salary - 20000000 * (rate / 100));
            }
        }
        else {
            message = "ERROR : 급여액은 0 ~ 30,000,000 사이임";
        }

        System.out.printf("\n 급여액 = %,d 원", salary);
        System.out.printf("\n 세율 = %.1f %%", rate);
        System.out.printf("\n 세금액 = %,d 원\n", tax);
        System.out.println(message);
    }
}
