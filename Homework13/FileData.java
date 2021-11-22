package Homework13;

public class FileData {

    //            1. Создать класс FileData. Класс представляет конкретный файл и состоит из: имя файла, размер в байтах, путь к файлу.

    private String name;
    private int size;
    private String path;

    public FileData(String name, int size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
