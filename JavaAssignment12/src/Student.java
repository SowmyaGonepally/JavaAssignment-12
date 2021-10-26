public class Student {

    //id,name,age,gender,engDepartment,year of enrollment ,perTillDate
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int year;
    double perTillDate;
    Student(int id,String name,int age,String gender,String engDepartment,int year,double perTillDate)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.year=year;
        this.perTillDate=perTillDate;
    }
    public String getName()
    {
        return name;
    }
    public String getEngDepartment()
    {
        return engDepartment;
    }
    public String getGender()
    {
        return gender;
    }
    public double getPerTillDate() {
        return perTillDate;
    }
    @Override
    public String toString()
    {
        return "ID: "+id+",Name: "+name+",Age: "+age+",Gender: "+gender+",Department: "+engDepartment+",Year: "+year+",Percentage: "+perTillDate;
    }
}
