package LibraryApp.pl.javastart.library.io.file;

import LibraryApp.pl.javastart.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
