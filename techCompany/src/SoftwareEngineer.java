public class SoftwareEngineer extends Employee {
    private String programmingLanguage;

    public SoftwareEngineer(String name, int age, String programmingLanguage) {
        super(name, age, "Yazılım Geliştirme");
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.println("Programlama dili: " + programmingLanguage);
    }
}
