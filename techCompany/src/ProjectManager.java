public class ProjectManager extends Employee {
    private String project;

    public ProjectManager(String name, int age, String project) {
        super(name, age, "Proje Yönetimi");
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.println("Çalıştığım proje: " + project);
    }
}
