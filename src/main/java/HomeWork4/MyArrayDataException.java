package HomeWork4;

public class MyArrayDataException extends ExceptionAll{


    MyArrayDataException(int i, int j) {
        super(String.format("В ячейке строка: %d столбец: %d \n" +
                "элемент массива преобразовать не удалось!!\n ", i, j));
    }
}
