package by.epam.decomposition;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме.
Для решения задачи использовать декомпозицию.
*/

public class Task16 {
    public static void main(String[] args) {
        int[] array = {39571175, 15, 79794, 67913, 551397, 11339};
        int sumOfArray = sumOfArray(array);
        System.out.println(sumOfArray);
        evenCounter(sumOfArray);
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            boolean takeNumber = false;
            int cheackNumber = array[i];
            while (cheackNumber > 0) {
                int cheackResult = cheackNumber % 10;
                cheackNumber /= 10;
                if (cheackResult % 2 != 0) {
                    takeNumber = true;
                } else {
                    takeNumber = false;
                    break;
                }
            }
            if (takeNumber == true) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void evenCounter(int number) {
        int evenCounter = 0;
        while (number > 0) {
            int evenNum;
            evenNum = number % 10;
            number /= 10;
            if (evenNum % 2 == 0 && evenNum !=0) {
                evenCounter++;
            }
        }
        System.out.println("Количество чётных чисел  " + evenCounter);
    }
}

