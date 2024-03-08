public class TestEngineer extends Employee {
    private String testingFramework;

    public TestEngineer(String name, int age, String testingFramework) {
        super(name, age, "Test Mühendisliği");
        this.testingFramework = testingFramework;
    }

    public String getTestingFramework() {
        return testingFramework;
    }

    public void setTestingFramework(String testingFramework) {
        this.testingFramework = testingFramework;
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.println("Kullandığım test çerçevesi: " + testingFramework);
    }
}
