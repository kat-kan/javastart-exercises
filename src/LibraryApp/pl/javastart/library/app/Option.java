package LibraryApp.pl.javastart.library.app;

import LibraryApp.pl.javastart.library.exception.NoSuchOptionException;

public enum Option {
    EXIT(0, "Wyjście z programu"),
    ADD_BOOK(1, "Dodanie książki"),
    ADD_MAGAZINE(2,"Dodanie magazynu/gazety"),
    PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
    PRINT_MAGAZINES(4, "WYświetlenie dostępnych magazynów/gazet");

    private final int value;
    private final String description;

    Option(int value, String description){
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    static Option createFromInt(int option) throws NoSuchOptionException {
        try {
            return Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e){
            throw new NoSuchOptionException("Brak opcji o id " + option);
        }
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }
}
