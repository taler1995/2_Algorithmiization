package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

public class massivTask10 {
    /*
    Дан целочисленный массив с количеством элемонтов n.Сжать массив, выбросив из него каждый второй элемент
    (освободившиеся элементы заполнить нулями. Дополнительный массив не использовать.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте длинну массива:");

        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10+1);
        }
        System.out.println("Массив: "+ Arrays.toString(array));

        for (int i = 1; i < array.length; i+=2){
            array[i] = 0;
        }
        System.out.println("Массив после замены на \"0\": " + Arrays.toString(array));

        int temp;
        for(int i = 2, j = 1; i < array.length; i+=2, j++ ){
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        System.out.println("Итоговый массив: " + Arrays.toString(array));
    }
}
