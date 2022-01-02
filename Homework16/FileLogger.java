package Homework16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class FileLogger {
    private FileLoggerConfiguration config;
    private BufferedWriter bufferedWriter;
    private File fileSize;


    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
        fileSize = new File(config.getOutputFile());
    }

    public void initBufferWriter() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(config.outputFile, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void debug(String message) throws IOException {
        if (fileSize.length() > config.getMaxSize()) {
            config.setOutputFile(String.format("%s%s.txt", config.getOutputFile().substring(0, config.getOutputFile().length() - 4), new Date()));
            initBufferWriter();
//            throw new FileMaxSizeReachedException("The size of the file is lower then your message");
        }
        bufferedWriter.write(String.format(
                config.getStringFormat(),
                LocalDateTime.now(),
                config.getLoggingLevel(),
                message)
        );

        bufferedWriter.newLine();
        bufferedWriter.flush();
    }

    public void info(String message) throws IOException {
        if (config.getLoggingLevel() == LoggingLevel.DEBUG) {
            return;
        }


        if (fileSize.length() > config.getMaxSize()) {
            config.setOutputFile(String.format("%s%s.txt", config.getOutputFile().substring(0, config.getOutputFile().length() - 4), new Date()));
            initBufferWriter();
            //            throw new FileMaxSizeReachedException("The size of the file is lower then your message");
        }
        bufferedWriter.write(String.format(
                config.getStringFormat(),
                LocalDateTime.now(),
                config.getLoggingLevel(),
                message)
        );

        bufferedWriter.newLine();
        bufferedWriter.flush();
    }
}

