package HomeWork4;

public class NewArray {

    /**
     *
     * @param mass
     * @return
     * @throws MyArraySizeException исключение некорректного размера массива
     */
    public static Integer add(String[][] mass) throws MyArraySizeException{
        if (mass.length != 4)
            throw new MyArraySizeException();
        for (int i = 0; i < mass.length; i++) {
            System.out.println();
            if (mass[i].length != 4)
                throw new MyArraySizeException();
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
        }
        return null;
    }

    /**
     *
     * @param mass
     * @return
     * @throws MyArraySizeException
     * @throws MyArrayDataException
     */
    public static Integer summa(String[][] mass) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        if (mass.length != 4)
            throw new MyArraySizeException();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].length != 4) throw new RuntimeException();
            for (int j = 0; j < mass[i].length; j++) {
                try{
                    sum += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

}
