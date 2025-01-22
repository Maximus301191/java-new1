public class Main {
    public static void main(String[] args) {
        int amount = 20_000; //стоимость билета
        int bonus = 20; //стоимость 1 бонуса

        int mile = amount / bonus; //итоговая сумма бонусов

        System.out.println(mile + "бонусных миль");
    }


}
