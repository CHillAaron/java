public class ProjectTest{
    public static void main(String[] args) {
        Project elevatorPitch = new Project();
        elevatorPitch.project("This is the name of the pitch", "This is describing what is going on");
        elevatorPitch.project("This is the name of the pitch", 45, "This is describing what is going on");

    }
}