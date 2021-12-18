package Homework16;

import java.util.HashMap;

public class FileLoggerConfiguration {
    public String outputFile;
    public LoggingLevel loggingLevel;
    public int maxSize; // number of bytes
    public String stringFormat = "[%s] [%s] MESSAGE : [%s]";

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    private void setStringFormat(String stringFormat) {
        this.stringFormat = stringFormat;
    }

    private void setLoggingLevel(String loggingLevel) {
        switch (loggingLevel) {
            case "INFO":
                this.loggingLevel = LoggingLevel.INFO;
                break;
            case "DEBUG":
                this.loggingLevel = LoggingLevel.DEBUG;
                break;
        }
    }

    private void setMaxSize(String maxSize) {
        this.maxSize = Integer.parseInt(maxSize);}

    public void initFileLoggerConfiguration(HashMap<String, String> configData) {
        setOutputFile(configData.get("FILE"));
        setStringFormat(configData.get("FORMAT"));
        setLoggingLevel(configData.get("LEVEL"));
        setMaxSize(configData.get("MAX-SIZE"));
    }

    public String getStringFormat() {
        return stringFormat;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
