//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
int[] step11 = new int[] {3,3,3,0};
    int[] step12 = new int[] {3,3,3};
    int[] step13= new int[] {3,3,3};
    int[] step14 = new int[] {3,3,3};
    int[] step15 = new int[] {3,3,3};

    int[] step21 = new int[] {3,3,3,0};
    int[] step22 = new int[] {3,3,3,0};
    int[] step23= new int[] {3,3,3,0};
    int[] step24 = new int[] {3,3,3,0};
    int[] step25 = new int[] {3,3,3,0};

    int[] step31 = new int[] {3,3,3,0};
    int[] step32 = new int[] {3,3,3,0};
    int[] step33= new int[] {3,3,3,0};
    int[] step34 = new int[] {3,3,3,0};
    int[] step35 = new int[] {3,3,3,0};

    int[][] villaA = {step11, step12, step13,step14,step15};
    int[][] villaB = {step21, step12, step23,step24,step25};
    int[][] villaC = {step31, step32, step33,step34,step35};

    int [][][] somangVilla = new int[][][] {
            {       {3,3,3,0},
                    {3,3,3,0},
                    {3,3,3,0},
                    {3,3,3,0},
                    {3,3,3,0}},
            {step21, step12, step23,step24,step25},
            {step31, step32, step33,step34,step35}

    };
    int[][] steptotal = new int[somangVilla.length][];
    steptotal[0] = new int[villaA.length];
    steptotal[1] = new int[villaA.length];
    steptotal[2] = new int[villaA.length];
    int [] dongTotal = new int[somangVilla.length];
    int total = 0 ;

for (int i =0; i < somangVilla.length; i++) {
    for (int j = 0; j < somangVilla[i].length; j++) {
        for (int k = 0; k< somangVilla[i][j].length-1; k++) {
            somangVilla[i][j][3] += somangVilla[i][j][k];
            steptotal[i][j] += somangVilla[i][j][k];
        }
    }
    }
for (int i = 0; i < steptotal.length; i++)
    for (int j = 0; j <steptotal[i].length; j++)
    dongTotal[i] += steptotal[i][j];

for (int i = 0; i <dongTotal.length; i++)
    total += dongTotal[i];

for ( int i=0; i < somangVilla.length; i ++) {
    System.out.printf(">>>>> %d 동 주민수 <<<<<\n", i+ 1);

    for (int j =0; j < somangVilla[i].length; j ++) {
        System.out.printf("%d층 \n",j+1);

        for (int k =0; k < somangVilla[i][j].length-1; k++) {
            System.out.printf("%d호(%d명)", k + 1, somangVilla[i][j][k]);
        }
        System.out.println("층별 합계 :"+v);

    }
    System.out.printf("%d 동 주민 합계 : \n\n", i + 1);
}
    System.out.println("Villa 주민수 : ");
}
