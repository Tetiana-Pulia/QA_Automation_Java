public class StrongestRobot {
    public static void main(String[] args) {
        /*Уявіть, що у вас є команда роботів, які змагаються в піднятті тягарів.
         У вас є список результатів підняття кожного робота, і ви хочете визначити,
         який робот підняв найбільшу вагу. Напишіть програму, яка знаходить найсильнішого робота.
         Вхідні дані: int[] weights = {300, 450, 200, 500, 350}; // 1ий робот підняв 300кг, другий 450 і т.п.
Очікуваний результат: Переконайтесь, що вивели в консоль ім*я найсильнішого робота і вагу, яку він підняв
*під "іменем найсильнішого робота" мається на увазі порядковий номер ітерації циклу, під час якого було знайдене
максимальне значення серед елементів масиву weights
         */

        int[] weights = {300, 450, 200, 500, 350};
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < weights.length; i++){
            if (weights[i] > max) {
                max = weights[i];
                maxIndex = i;
            }
            System.out.println("So far max weight that robot can hold is " + max + "iteration =" + i );
        }
        System.out.println("====== Max weight that robot can hold is " + max + "and iteration is " + maxIndex);
    }
}
