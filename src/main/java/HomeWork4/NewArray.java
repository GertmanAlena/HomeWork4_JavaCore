package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class NewArray {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
//    /**
//     *

//     * @param mass
//     * @return
//     * @throws MyArraySizeException исключение некорректного размера массива
//     */
//    public static Integer print(String[][] mass) throws MyArraySizeException{
//        if (mass.length != 4)
//            throw new MyArraySizeException();
//        for (int i = 0; i < mass.length; i++) {
//            System.out.println();
//            if (mass[i].length != 4)
//                throw new MyArraySizeException();
//            for (int j = 0; j < mass[i].length; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//        }
//        return null;
//    }

//    /**
//     *
//     * @param mass
//     * @return
//     * @throws MyArraySizeException
//     * @throws MyArrayDataException
//     */
//    public static Integer summa(String[][] mass) throws MyArraySizeException, MyArrayDataException{
//        int sum = 0;
//        if (mass.length != 4)
//            throw new MyArraySizeException();
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i].length != 4) throw new MyArraySizeException();
//            for (int j = 0; j < mass[i].length; j++) {
//                try{
//                    sum += Integer.parseInt(mass[i][j]);
//                } catch (NumberFormatException e){
//                    throw new MyArrayDataException(i, j);
//                }
//            }
//        }
//        return sum;
//    }

    /**
     * Второй вариант работы, всё в одном методе. Размер массива рандомно
     * заполнение массива с консоли
     * @param i количество строк
     * @param j количество столбцов
     * @throws MyArraySizeException исключение некорректного размера массива
     * @throws MyArrayDataException исключение некорректного символа массива для суммирования
     */
    public static void generatedMass(int i, int j) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        if(i != 4 || j != 4) throw new MyArraySizeException();
        System.out.println(i);
        System.out.println(j);
        String array[][] = new String[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.println("Введите символ");
                array[k][l] = scanner.nextLine();
                try{
                    sum += Integer.parseInt(array[k][l]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(k, l);
                }
            }System.out.println();
            System.out.println(sum);
        }
        for (int z = 0; z < array.length; z++) {
            for (int x = 0; x < array[z].length; x++) {
                System.out.print(array[z][x] + " ");
            }System.out.println();
        }
    }

}
