package Homework16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLoggerConfiguration {
    public static FileWriter file;

    static {
        try {
            file = new FileWriter("logger.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    LoggingLevel loggingLevel;
    byte maxSize;

    public FileLoggerConfiguration() throws IOException {
    }

    public static FileWriter getFile() {
        return file;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public void setLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public byte getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(byte maxSize) {
        this.maxSize = maxSize;
    }
//
//            3. Создать класс FileLoggerConfiguration. Класс представляет конфигурацию для логирования. Состоит из свойств: файл куда будет записываться информация,
//            текущий уровень логирования, максимальный размер файла (в байтах), формат для записи в файл.

}
