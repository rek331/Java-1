void main() {
final float DON = 3.75f; // 1돈은 3.75g

    float weight;
    float don;
    final int GOLD = 910000;
    Scanner keyboard = new Scanner(System.in);


    System.out.print("당신의 체중은?");
    weight = keyboard.nextFloat(); // 단위 :Kg 45 Kg 0.7 kg

    /*int intweight = (int) weight;
    float remainder = weight - intweight;
    int gram = (int) (intweight * 1000 + remainder * 100); */


    int gram = (int) (weight) * 1000;
don = gram /DON;
// long price = (long) (don * DON);
float price = don * GOLD;
price /= 10000;
price *= 10000;

    System.out.printf("%,2f kg -> %,d g \n",weight,gram);
    System.out.printf("%,2f Kg  -> %,.2f 돈\n",weight ,don);
    System.out.printf("%,2f Kg -> %,d 원\n",weight, price);
}
