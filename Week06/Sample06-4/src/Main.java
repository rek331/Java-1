void main() {
    Scanner keyboard = new Scanner(System.in);
    int year;
    int ciga;
    final int PRICE = 4500;
    final int LIFE = 7; // minute

    System.out.print("당신은 몇년간 담배를 피웠나요?");
    year = keyboard.nextInt();
    System.out.print("하루에 몇 개피를 피우나요?");
    ciga = keyboard.nextInt();

    int day = year * 365;
    int count = ciga * day;
    int minute = count * LIFE;
    int hour = minute / 60;
    minute -= (hour * 60);
    int day1 = hour / 24;
    hour -= (day1 * 24);
    int year1 = day1 / 365;
    day1 -= (year1 * 365);

    int money = (count / 20 + (count % 20 != 0 ? 1 : 0)) * PRICE;

    System.out.printf("담배를 1개피를 피우면 수명이 %d분 단축된다고 합니다.\n", LIFE);
    System.out.printf("%d년 동안 하루에 %d 개피의 담배를 피우면, %d 년 %d 일 %d 시간 %d분 수명이 줄어든다고 합니다 \n", year, ciga, year1, day1, hour, minute);
    System.out.printf("%d 년동안 하루에 %d 개피의 담배를 피우면, 담배 금액은 %,d 원 입니다.\n", year, ciga, money);
}
