import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private int namber;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dataYear;

    public Passport(int namber, String surname, String name, String patronymic, int dataYear) {
        this.namber = namber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dataYear = LocalDate.ofEpochDay(dataYear);

    }

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        this.namber = namber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDataYear() {
        return dataYear;
    }

    public void setDataYear(LocalDate dataYear) {
        this.dataYear = dataYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return namber == passport.namber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(namber);
    }

    @Override
    public String toString() {
        return namber +" "+ surname + " " + name + " " + patronymic + " " + dataYear ;
    }
}
