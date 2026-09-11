void main() {
    // 준비 문장 선언문
    Scanner keyboard = new Scanner(System.in);
    String name = "";
    int age = 0;
//데이터 입력
    System.out.print("당신의 이름은 ?");
    name = keyboard.nextLine();
    System.out.printf("%s님의 나이는 ?", name);
    name = keyboard.nextLine();
    age = keyboard.nextInt();
//처리
    name = "홍길동";
//출력
    System.out.printf("이름 : %s, 나이 : %d살\n", name , age);
}
