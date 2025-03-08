public class Student{
    private String name;
    private String RollNumber;
    private String department;
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Student(String name,String RollNumber,String department){
        setName(name);
        setDepartment(department);
        setRollNO(RollNumber);
    }
    public void setDepartment(String department){
        if(department.equals("Computer Science") || department.equals("Chemical Engineering")){

            this.department=department;
        }
        else{
            System.out.println("Error: Enter the correct department name.");
        }
    }
    public void setRollNO(String RollNumber){
        String deptCode=getDepartmentCode();
        String regex = "(20[2-9][0-9])-" + deptCode + "-\\d{3}";
        if(RollNumber.matches(regex)){

            this.RollNumber=RollNumber;
        }
        else{
            System.out.println("Wrong input.");
        }
    }
    private String getDepartmentCode(){
        switch(getDepartment().toLowerCase()){
            case "Computer Science" -> {
                return "CS";
            }
            case "Chemical Engineering" -> {
                return "CE";
            }
            case "Civil Engineering" -> {
                return "CVE";
            }
            default -> {
                System.out.println("Invalid department name");
                return "UNK";
            }
        }
    }
    public void setName(String name){
        if (name != null && !name.trim().isEmpty()) {

            this.name=name;
        }
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