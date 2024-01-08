import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionLogger {

    // Путь к файлу лога
    private static final String LOG_FILE = "exceptions.log";

    public static void logException(Exception e) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE, true)) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = formatter.format(new Date());

            // Формируем строку лога
            String logMessage = timestamp + " - Exception: " + e.getClass().getName() + " - " + e.getMessage() + "\n";

            // Записываем строку в файл
            fileWriter.write(logMessage);
        } catch (IOException ioException) {
            // В случае ошибки записи в файл лога
            System.err.println("Error writing to log file: " + ioException.getMessage());
        }
    }
}
