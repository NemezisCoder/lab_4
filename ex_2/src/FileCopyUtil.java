import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUtil {

    // Главный метод, запускающий программу
    public static void main(String[] args) {
        // Пути к исходному и целевому файлам
        String sourcePath = "path/to/source/file.txt";
        String destPath = "path/to/destination/file.txt";

        // Вызов метода для копирования файла
        copyFile(sourcePath, destPath);
    }

    // Метод для копирования содержимого одного файла в другой
    public static void copyFile(String sourceFile, String destFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Открытие файловых потоков
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);

            // Чтение из исходного файла и запись в целевой файл
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
        } catch (IOException e) {
            // Обработка исключений ввода/вывода
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        } finally {
            // Закрытие файловых потоков в блоке finally
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                // Обработка исключений, возникающих при закрытии файлов
                System.out.println("Ошибка при закрытии файлов: " + e.getMessage());
            }
        }
    }
}

