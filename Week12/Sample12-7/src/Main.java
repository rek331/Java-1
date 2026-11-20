//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
   Scanner keyboard = new Scanner(System.in);
   /*
class Customer {
    String waterNo;
    String name;
    char type;
    String typeName;
    float usage;
    int useCharge;
    int tax;

    public Customer(String waterNo, String name, char type) {
        this.waterNo = waterNo;
        this.name =name;
        this.type = type;

    }
    Customer[] customers = new  Customer[] {
        new Customer("1111", "홍길동", '1'),
                new Customer("1211", "박길동", '2'),
                new Customer("1311", "유길동", '3'),
                new Customer("1411", "최길동", '4'),
                new Customer("1511", "동길동", '5'),
                new Customer("1611", "길동", '6'),
                new Customer("1711", "홍동", '7'),
                new Customer("1811", "동", '8'),
                new Customer("1911", "홍", '9'),
                new Customer("2111", "홍동길동", '0')};
}

}
            int count = 0;
        while(count < customers.length) {
            System.out.printf("%s 고객님의 사용량 입력 (예 12.5) :", customers[count].name);
            custmoers[count].usage = keyboard.nextFloat();
            if (customers[count].usage >= 0.0f)
                count++;
        else{
            System.err.println("ERROR : 사용량은 0 ~");
            System.in.read();
        }

*/
    class Customer { // 고객마다 따로 가지는 데이터 (필드)
        String no; // 번호
        String name; // 이름
        char type; // 구분 코드 ('1' ~ '5')
        String typeName; // 구분 이름
        double usage; // 사용량
        int useCharge; // 사용금액
        int tax; // 세금
        // 생성자: 객체를 만들 때 기본 정보를 넣음
        Customer(String no, String name, char type, double usage) {
            this.no = no;
            this.name = name;
            this.type = type;
            this.usage = usage;
            this.typeName = typeName;
        }
    }
    Customer[] custom = {
            new Customer("1111", "홍길동", '1', 700.1),
            new Customer("2222", "이대한", '2', 56.7),
            new Customer("3333", "한국민", '5', 785.6),
            new Customer("1212", "이으뜸", '3', 345.7),
            new Customer("1313", "나이쁨", '4', 321.4),
            new Customer("4444", "김도령", '4', 789.6),
            new Customer("2121", "박대령", '1', 456.7),
            new Customer("4343", "허달수", '1', 678.4),
            new Customer("6789", "장마당", '4', 56.7),
            new Customer("4545", "정성길", '3', 895.6)
    };
    int count = 0;
    while (count < custom.length) {
        System.out.printf("%s번 수도 사용량 입력 : ", custom[count].no);
        custom[count].usage = keyboard.nextDouble();
        if (custom[count].usage < 0) {
            System.out.print(" ERROR");
            System.in.read();
            continue;
        }
        count++;
    }
    for (int i = 0; i < custom.length; i++) {

        switch (custom[i].type) {
            case 1:
                custom[i].typeName = "가정용";
                break;
            case 2:
                custom[i].typeName = "영업용";
                break;
            case 3:
                custom[i].typeName = "공장용";
                break;
            case 4:
                custom[i].typeName = "관공서";
                break;
            case 5:
                custom[i].typeName = "군기관";
        }
    }
    for (int i = 0; i < custom.length; i++) {
        custom[i].tax = (int) (custom[i].useCharge);
        switch (custom[i].type) {
            case '1':
                custom[i].tax = (int) (custom[i].useCharge * 5.0f / 100);
                break;
            case '2':
                custom[i].tax = (int) (custom[i].useCharge * 3.5f / 100);
                break;
            case '3':
                custom[i].tax = (int) (custom[i].useCharge * 2.5f / 100);
                break;
            case '4':
                custom[i].tax = (int) (custom[i].useCharge * 1.5f / 100);
                break;
            case '5':
                custom[i].tax = (int) (custom[i].useCharge * 0.0f / 100);
        }
        custom[i].tax = custom[i].tax / 10 * 10;
    }
    for (int i = 0; i < custom.length - 1; i++)
        for (int j = i; j < custom.length; j++) {
            if ((custom[i].useCharge + custom[i].tax) <
                    (custom[j].useCharge + custom[j].tax)) {
                Customer temp = custom[i];
                custom[i] = custom[j];
                custom[j] = temp;
            }
        }
    System.out.println("\n 수 도 요 금");
    System.out.println("---------------------------------------------------------------------");
            System.out.println(" 번호 이름 구분 사용양 사용금액 TAX납부액 비고");
                    System.out.println("-------------------------------------------------------------");
    for (int i = 0; i < custom.length; i++)
        System.out.printf("%7s %4s %-6s %5.1f %,9d %,9d %,8d %6s\n",
                custom[i].no, custom[i].name, custom[i].typeName,
                custom[i].usage,
                custom[i].useCharge, custom[i].tax,
                custom[i].useCharge + custom[i].tax,
                (custom[i].typeName.equals("군기관")) ? "일괄징수" : "");
    System.out.println("---------------------------------------------------------------------");
}

