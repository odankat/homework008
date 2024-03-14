public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int[] expenses1 = {1200, 4567, 1568, 9876, 2305};
        int expensesAll = 0;
        for (int element : expenses1) {
            expensesAll += element;
        }
        System.out.println("Сумма трат за месяц составила " + expensesAll + " рублей");
        // Задание 2
        System.out.println("Задание 2");
        int[] expenses2 = {1200, 4567, 1568, 9876, 2305};
        int expensesMax = -1;
        int expensesMin = 99999999;
        for (int max : expenses2) {
            if (max > expensesMax) {
                expensesMax = max;
            }
        }
        for (int min : expenses2) {
            if (expensesMin > min) {
                expensesMin = min;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + expensesMin +
                " рублей. Максимальная сумма трат за неделю составила " + expensesMax + " рублей");
        // Задание 3
        System.out.println("Задание 3");
        int[] expenses3 = {1354, 1998, 3564, 965, 11230};
        double expensesAll3 = 0;
        double expensesAverage = 0;
        for (double element3 : expenses3) {
            expensesAll3 += element3;
            expensesAverage = expensesAll3 / expenses3.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + expensesAverage + " рублей");
        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }



    }
}