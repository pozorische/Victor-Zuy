//public class ArrayMain {
//
//    public void processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
//        if (array.length != 4 || array[0].length != 4) {
//            throw new MyArraySizeException("Размер массива должен быть 4x4");
//        }
//
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                try {
//                    sum += Integer.parseInt(array[i][j]);
//                } catch (NumberFormatException e) {
//                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
//                }
//            }
//        }
//
//        System.out.println("Сумма элементов массива: " + sum);
//    }
//}
