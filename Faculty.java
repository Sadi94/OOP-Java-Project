package Classes;//this package includes all the packages

public class Faculty {
    protected String name;
    protected String fid;
    protected double salary;
    
    public void setName(String name){
        this.name = name;
    }
    public void setfId(int fId){
        this.fid = Integer.toString(fId);
    }
    public void setSalary(double Salary){
        this.salary = Salary;
    }
    
    public String getName(){
        return name;
    }
    public int getFId(){
        int id = Integer.parseInt(fid);
        return id;
    }
    public double getSalary(){
        return salary;
    }
    
}

