//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
final int radius = 6378; // Km
final float PI = 3.141592f;
final int korea = 100505; //Km제곱
double surface = 4 * PI * radius * radius;

double ratio = korea / surface;

    System.out.printf("지구의 표면적은 %,.0f Km제곱 \n", surface);
    System.out.printf("대한민국의 영토 %,d Km제곱 은 지구의 %f %% 입니다 \n", korea, ratio);













}

