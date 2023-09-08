package HomeWork4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        int sum = 0;
//        // region Задача1
//
//
//        String[][] mass = {
//            {"22", "4", "6", "0"},
//            {"1", "31", "5", "5"},
//            {"8", "3", "42", "10"},
//            {"85", "3", "5", "69"},
//        };
//        String[][] mass2 = {
//                {"22", "4", "6"},
//                {"1", "31", "5"},
//                {"8", "3", "42"},
//                {"85"},
//        };
//
//        try{
//            NewArray.add(mass);
//            NewArray.add(mass2);
//        }
//        catch (ExceptionAll e){
//            System.out.println("Массив не обработан ->" + e.getMessage());
//        }
//
//        String[][] mass3 = {
//                {"22", "-", "6", "0"},
//                {"1", "31", "5", "5"},
//                {"8", "*", "42", "10"},
//                {"85", "3", "5", "69"},
//        };
//        try{
//            sum = NewArray.summa(mass3);
//            System.out.println(sum);
//        } catch (ExceptionAll e){
//            System.out.println(e.getMessage());
//        }
//        //endregion

        //region Второй вариант решения задания
        try{
            NewArray.generatedMass(random.nextInt(3,5), random.nextInt(3,5));
        } catch (ExceptionAll e){
            System.out.println(e.getMessage());
        }
        //endregion

    }
}