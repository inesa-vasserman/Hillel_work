package Homework16;

import java.io.IOException;

public class FileMaxSizeReachedException extends IOException {
    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}
