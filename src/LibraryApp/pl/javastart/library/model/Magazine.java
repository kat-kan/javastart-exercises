package LibraryApp.pl.javastart.library.model;

import java.util.Objects;

public class Magazine extends Publication {
    private int month;
    private int day;
    private String languAGE;

    public Magazine(int month, int day, String languAGE, String title, String publisher, int releaseDate) {
        super(title, releaseDate, publisher);
        this.month = month;
        this.day = day;
        this.languAGE = languAGE;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguAGE() {
        return languAGE;
    }

    public void setLanguAGE(String languAGE) {
        this.languAGE = languAGE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return month == magazine.month && day == magazine.day && Objects.equals(languAGE, magazine.languAGE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), month, day, languAGE);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "month=" + month +
                ", day=" + day +
                ", languAGE='" + languAGE + '\'' +
                '}';
    }
}
