public class Main{
    public static void main(String[]args){
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Ahmet", 30,"JAVA ve JavaScript");
        softwareEngineer.introduceYourself();

        ProjectManager projectManager = new ProjectManager("Eren", 35,"TechCompany Automation Tester Projesi");
        projectManager.introduceYourself();

        TestEngineer testengineer = new TestEngineer("Veysel", 28,"Selenium");
        testengineer.introduceYourself();

    }
}

