package LibraryApp.pl.javastart.library.io.file;


import LibraryApp.pl.javastart.library.exception.NoSuchFileTypeException;
import LibraryApp.pl.javastart.library.io.ConsolePrinter;
import LibraryApp.pl.javastart.library.io.DataReader;

import java.util.Locale;

public class FileManagerBuilder {
    private ConsolePrinter printer;
    private DataReader reader;

    public FileManagerBuilder(ConsolePrinter printer, DataReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public FileManager build(){
        printer.printLine("Wybierz format danych: ");
        FileType fileType = getFileType();
        FileManager fileManager = switch (fileType){
            case CSV -> new CsvFileManager();
            case SERIAL -> new SerializableFileManager();
            default -> throw new NoSuchFileTypeException("Nieobsługiwany typ danych");
        };
        return fileManager;
    }

    private FileType getFileType(){
        boolean typeOk = false;
        FileType result = null;
        do {
            printTypes();
            String type = reader.getString().toUpperCase(Locale.ROOT);
            try {
                result = FileType.valueOf(type);
                typeOk = true;
            } catch (IllegalArgumentException e) {
                printer.printLine("Nieobsługiwany typ danych, wybierz ponownie");
            }
        } while (!typeOk);

        return result;
    }

    private void printTypes(){
        for (FileType type:
             FileType.values()) {
            printer.printLine(type.name());
        }
    }
}
