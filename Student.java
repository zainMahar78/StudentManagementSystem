public class Student{
    private String name;
    private String RollNumber;
    private String department;
    public void SetName(String name){
        if(name.equals("Computer Science") || name.equals("Chemical Engineering")){

            this.name=name;
        }
        else{
            System.out.println("Error: Enter the correct department name.");
        }
    }
    public void SetRollNO(String RollNumber){
        this.RollNumber=RollNumber;
    }
    public void SetDepartment(String department){
        this.department=department;
    }
    public String getName(){
        return name;
    }
    public String getRollno(){
        return RollNumber;
    }
    public String getDepartment(){
        return department;
    }
}