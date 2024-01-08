public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Пример массива
        int sum = 0;
        double average = 0.0;

        try {
            // Обработка массива
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = sum / (double) arr.length;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Вывод исключения, связанного с выходом за границы массива
            System.out.println("Ошибка: Обращение к несуществующему индексу массива.");
        } catch (Exception e) {
            // Вывод других исключений
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        // Вывод результата
        System.out.println("Среднее арифметическое: " + average);
    }
}