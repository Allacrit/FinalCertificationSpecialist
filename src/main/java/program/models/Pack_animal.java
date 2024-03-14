package program.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pack_animal {

    protected int petId;
    protected String nickname;
    protected LocalDate birthday;

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return nickname;
    }

    public void setName(String name) {
        this.nickname = name;
    }

    public LocalDate getBirthdayDate() {
        return birthday;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, дата рождения: %s ", getPetId(), getClass().getSimpleName(), nickname, getBirthday());
    }
}