package Homework16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import static Homework16.FileLoggerConfiguration.getFile;


public class FileLogger {

    private final Date DATE = new Date();

    public void debug(String message) throws IOException {

        //            3. В классе FileLogger. Создать методы debug и info, которые в качестве параметра принимают строку-сообщение.
//            Метод должны выполнять запись в указанный в конфигурации файл в установленном формате для записи из конфигурации.
//    Формат записи: [ТЕКУЩЕЕ_ВРЕМЯ][DEBUG] Сообщение: [СТРОКА-СООБЩЕНИЕ]

        getFile().write(DATE.toString() + getClass().getSimpleName() + "Сообщение: " + message);

    }

    public void info(String message) throws IOException {
        getFile().write(DATE.toString() + getClass().getSimpleName() + "Сообщение: " + message);
    }
}

