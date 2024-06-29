public class StudentSearch {
    /*
    Опис задачі:
У вашому списку студентів ви хочете знайти конкретного студента за його номером залікової книжки.
Напишіть програму, яка використовує цикл for each для перегляду списку студентів і знаходить номер залікової книжки,
який ви шукаєте. Якщо студент знайдений, програма повинна вивести повідомлення і завершити роботу.
Якщо студент не знайдений, програма повинна вивести відповідне повідомлення і завершити роботу.
Вхідні дані:int[] studentIDs = {12345, 67890, 54321, 98765, 24680};

int searchID = 54321;
Очікуваний результат: у разі, якщо номер залікової книжки був знайдений у списку - вивести повідомлення про це і завершити роботу -
якщо такої заліковки немає у списку - вивести відповідне повідомлення і завершити роботу
     */

    //for each

    public static void main(String[] args) {
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        int searchID = 54321;
        boolean isFound = false;

        for (int i : studentIDs) {
            if (i == searchID) {
                System.out.println("This student is found");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("This student is not found");
        }


        //for


        for (int j = 0; j < studentIDs.length; j++) {
            if (studentIDs[j] == searchID) {
                System.out.println("This student is found");
                isFound = true;
                break;
            }
            j++;
        }
        if (!isFound) {
            System.out.println("This student is not found");
        }

    }
}
