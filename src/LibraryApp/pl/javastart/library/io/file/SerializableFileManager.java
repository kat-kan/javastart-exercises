package LibraryApp.pl.javastart.library.io.file;

import LibraryApp.pl.javastart.library.exception.DataExportException;
import LibraryApp.pl.javastart.library.exception.DataImportException;
import LibraryApp.pl.javastart.library.model.Library;

import java.io.*;

public class SerializableFileManager implements FileManager {
    private static final String FILE_NAME = "Library.o";

    @Override
    public Library importData() {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            return (Library) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku " + FILE_NAME);
        } catch (IOException e) {
            throw new DataImportException("Błąd odczytu pliku " + FILE_NAME);
        } catch (ClassNotFoundException e) {
            throw new DataImportException("Niezgodny typ danych w pliku " + FILE_NAME);
        }
    }

    @Override
    public void exportData(Library library) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(library);
        } catch (FileNotFoundException e){
            throw new DataExportException("Nie znaleziono pliku o nazwie " + FILE_NAME);
        } catch (IOException e){
            throw new DataExportException("Błąd zapisu pliku " + FILE_NAME);
        }
    }
}
