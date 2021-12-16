package Homework16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger {
    private FileLoggerConfiguration config;
    private BufferedWriter bufferedWriter;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    public void initBufferWriter() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(config.outputFile, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    File fileSize;

    {
        assert false;
        fileSize = new File(config.getOutputFile());
    }

    public void debug(String message) throws IOException {
        if (fileSize.length() < config.getMaxSize()) {
            throw new FileMaxSizeReachedException("The size of the file is lower then your message");
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


        if (fileSize.length() < config.getMaxSize()) {
            throw new FileMaxSizeReachedException("The size of the file is lower then your message");
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

