//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
 Scanner keyboard = new Scanner(System.in);
   //준비
    final double PI = 3.141592;
    double area;
    int base;
    int rectagular_area;
    double radius;
    double circle_area;
    System.out.print("정사각형의 한변의 길이 입력(예 5) : ");
//계산

    //입력
    base = keyboard.nextInt();
radius = base / 2.0;
rectagular_area = base * base;
circle_area = PI * radius * radius;
area = rectagular_area - circle_area;

//출력
    System.out.printf("한변의 길이가 %,d cm인 정사각형의 면적은 %,d \u33A0\n", base , rectagular_area);
    System.out.printf("이 정사각형의 내부 원의 반지름 : %.2f cm :   면적은 %,.2f \u33A0\n", radius,  circle_area);
    System.out.printf("구하려는 면적 : %,.2f\u33a0\n", area);
}
