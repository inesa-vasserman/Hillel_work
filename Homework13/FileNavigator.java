package Homework13;

import java.util.*;

import static java.lang.String.format;

public class FileNavigator {

    public Map<String, ArrayList<FileData>> fileStorage = new HashMap<>();

    //            2. Реализовать метод add в классе FileNavigator. Данный метод добавляет файл по указанному пути. Если путь уже существует,
    //            то новый файл необходимо добавить к списку,
    //            уже связанному с соответствующим путем. ВАЖНО: Путь - уникальное значение и не должно повторяться.

    public void add(String path, FileData file) {
        checkPath(path, file);

        if (fileStorage.containsKey(path)) {
            fileStorage.get(path).add(file);

        } else {
            ArrayList<FileData> newFile = new ArrayList<>();
            newFile.add(file);
            fileStorage.put(path, newFile);
        }
    }

//
//            3. Реализовать метод find в классе FileNavigator. Метод возвращает список файлов связанных с путем переданным в качестве параметра.

    public ArrayList<FileData> find(String path) {
        return new ArrayList<>(fileStorage.get(path));
    }
//
//4. Реализовать метод filterBySize в классе FileNavigator. Метод возвращает список файлов, размер (в байтах) которых не превышает значение переданное в качестве параметра.

    public ArrayList<FileData> filterBySize(int maxSize) {
        ArrayList<FileData> allowedSize = new ArrayList<>();
        for (ArrayList<FileData> value : fileStorage.values()) {
            for (FileData o : value) {
                if ((o.getSize() <= maxSize)) {
                    allowedSize.add(o);

                }
            }
        }
        return allowedSize;
    }
//
//            5. Реализовать метод remove в классе FileNavigator. Метод удаляет путь и связанные с ним файлы, на основании значения пути, переданного в качестве параметра.

    public void remove(String path) {
        fileStorage.remove(path, fileStorage.get(path));

    }
//
//            6. * Реализовать метод sortBySize в классе FileNavigator. Метод сортирует все имеющиеся файлы по их размеру (по возрастанию),
//            затем возвращает список отсортированных файлов.

    public List<FileData> sortBySize() {
        List<FileData> fileWithAllowableSize = new ArrayList<>();
        for (ArrayList<FileData> value : fileStorage.values()) {
            fileWithAllowableSize.addAll(value);
        }
        for (int i = fileWithAllowableSize.size() - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (fileWithAllowableSize.get(j).getSize() > fileWithAllowableSize.get(j + 1).getSize()) {
                    FileData targetValue = fileWithAllowableSize.get(j);
                    fileWithAllowableSize.set(j, fileWithAllowableSize.get(j + 1));
                    fileWithAllowableSize.set(j + 1, targetValue);
                }
            }

        }
        return fileWithAllowableSize;
    }

    //
//            7. ** Реализовать проверку консистентности в методе add в классе FileNavigator. Не позволять добавлять значения
//            и сообщить об этом в консоль, при попытке добавить значение FileData значение пути которого не соответствует пути-ключу ведущему к списку файлов.
//            Например:
//    Должна быть ошибка, поскольку путь-ключ и путь к файлу не совпадают
//    Путь: /path/to/file
//    FileData: {name: ..., size: ..., path: /another/path/}
    public void checkPath(String path, FileData file) throws PathException {
        if (!file.getPath().equals(path)) {
            throw new PathException(format("Path %s \n FileDate: {name: %s, size: %s, path:%s}", path, file.getName(), file.getSize(), file.getPath()));
        }
    }
}
