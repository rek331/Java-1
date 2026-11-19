//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int ID =0;
    final int NAME =1;
    final int BASE = 0;
    final int SUDANG =0;
    final int Salary = 2;
    int TAX = 0 ;
    String[][] employees = {{"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}};
    char[] grade = {'1', '3', '2', '4', '5', '1', '3', '2', '4', '5'};
//int [][] salary = new int [employees.length][5]; // 기본급 업무수당 급여액 세금 지급액
    int[][] salary = {{0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}};

    int[] MONEY = {1650000, 1680000, 1700000, 1720000, 1750000};
    for (int i =0; i < employees.length;i++) {
        if (grade[i] == '1') {
            salary[i][BASE] = MONEY[0];
        } else if (grade[i]=='2') {
            salary[i][BASE] = MONEY[1];
        } else if (grade[i]=='3') {
            salary[i][BASE] = MONEY[2];
        } else if (grade[i]=='4') {
            salary[i][BASE] = MONEY[3];
        } else if (grade[i]=='5') {
            salary[i][BASE] = MONEY[4];
        } else {
            salary[i][BASE] = 0
        }
    }

    for ( int i = 0; employees.length; i++)
        salary[i][Salary] = salary[i][BASE] + salary[i][SUDANG];

for (int i = 0 ; i < employees.length; i++) {
    System.out.printf("%3s %4s %c %,10d %,10d\n", employees[i][ID], employees[i][NAME],grade[i],
            salary[i][BASE], salary[i][SUDANG]);
}

}