public class Project{
    
    private String name;
    private String des;
    private double initialCost;

    public void project() {
        System.out.println("this is a project with no args");
    }
    public void project(String name) {
        this.name = name;
        System.out.println("this is a project with name arg "+ name);
    }
    public void project(String name, String description) {
        this.name = name;
        this.des = description;
        System.out.println(name + " : " + description);
    }
    public void project(String name, double cost, String description) {
        this.name = name;
        this.des = description;
        System.out.println(name + " ("+cost+") "+ " : " + description);
    }
    
    
    

}