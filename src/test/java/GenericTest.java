public class GenericTest {
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整形数组元素为：");
        printArray(intArray);

        System.out.println("\n双精度型数组元素为：");
        printArray(doubleArray);

        System.out.println("\n字符型数组元素为：");
        printArray(charArray);
    }
}
