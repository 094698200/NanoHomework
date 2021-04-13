public class Staff {
    private String surname;
    private String name;
    private String patronymic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "surname='" + surname + '\'' +
                ", name=" + name +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
