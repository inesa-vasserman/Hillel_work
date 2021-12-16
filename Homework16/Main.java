package Homework16;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileLoggerConfigurationLoader fileLoggerConfigurationLoader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration fileLoggerConfiguration = fileLoggerConfigurationLoader.load("logger.txt");
        FileLogger fileLogger = new FileLogger(fileLoggerConfiguration);
        fileLogger.initBufferWriter();
        fileLogger.info("");
        fileLogger.debug("");
    }

//
//6. ** При достижении максимального размера файла или его превышении, создавать новый (дополнительный)
// файл для хранения логов. Имя каждого нового файла должно содержать дату его создания.
//    Примерная ситуация:
//    Log_11.11.2021-11:11.txt
//    Log_11.11.2021-12:11.txt
//    Log_11.11.2021-13:11.txt
//    ВАЖНО! Формат именования можно выбрать самостоятельно, главное не отходить от требований задания.
//
//            7. **** Спроектировать систему таким образом, чтобы проявить идею полиморфизма и абстракции.
//            При таком варианте, может быть несколько семейств логирования, их конфигурирования. То есть, не имеет
//            значения какая реализация в последствии будет выбрана к использованию, не будет необходимости изменения кода
//            в местах применения логирования. Будет происходит только подмена реализации. Вызов logger.info("test log")
//            будет одинакового работать при файловом или консольном логировании.
//
//    Например может быть:
//    FileLogger, FileLoggerConfiguration, FileLoggerConfigurationLoader
//            StdoutLogger, StdoutLoggerConfiguration, StdoutLoggerConfigurationLoader
//
//    ВАЖНО! StdoutXXX реализовать необязательно, но система должна быть к реализации нового семейства с возможностью
//    управления "всеми как одним". Это задание выполнить отдельной веткой в git.
//
}
