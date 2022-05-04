package com.company;
// Manager class
public class Manager extends Staff  {
    String  organisationRole;
/*Quy ước trách nhiệm của manager :
    // 1. Business Leader = 8,000,000
    //2. Project Leader = 5,000,000
    //3. Technical Leader = 6,000,000 */
    private double salaryRole;
//    public static int currentManager = 0;

    public Manager(String ID, String name,  int age, double multiSalary, String dateHiring, Department department, int dayOff,  String  organisationRole ){
        super( ID, name, age, multiSalary,dateHiring, department,  dayOff);
        if (organisationRole.equalsIgnoreCase("1")) {
            this.organisationRole = "Business Leader";
        } else if (organisationRole.equalsIgnoreCase("2")) {
            this.organisationRole = "Project Leader";
        } else if (organisationRole.equalsIgnoreCase("3")) {
            this.organisationRole = "Technical Leader";
        } else {
            System.out.println("Error!");
        };
//        this.organisationRole =  organisationRole;
//        currentManager++;
    };

    public String  getOrganisationRole() {
        return organisationRole;
    }

    public void setOrganisationRole(String  organisationRole) {
        this.organisationRole = organisationRole;
    }

    public double getSalaryRole() {
        return salaryRole;
    }

    public void setSalaryRole(double salaryRole) {
        this.salaryRole = salaryRole;
    }
    // Lương trách nhiệm:
    //Business Leader = 8,000,000
    //Project Leader = 5,000,000
    //Technical Leader = 6,000,000


    @Override
    public double calculateSalary() {
        if ( getOrganisationRole().equalsIgnoreCase("Business Leader")) {
            setSalaryRole(8000000);
        } else if (getOrganisationRole().equalsIgnoreCase("Project Leader")) {
            setSalaryRole(5000000);
        } else if (getOrganisationRole().equalsIgnoreCase("Technical Leader")) {
            setSalaryRole(6000000);
        } else {
            System.out.println("Error! ");
        };
        return super.getMultiSalary() * 5000000 + getSalaryRole() ;
    }

    public  void displayInformation() {
        System.out.println("ID: " + super.getID() +  "\t Tên : " + super.getName() + "\t Tuổi " + super.getAge()  + "\t Hệ số lương: " + super.getMultiSalary() + "\t Ngày vào làm: " + super.getDateHiring() +"\t Bộ phận: " + super.getDepartment()  + "\t Số ngày nghỉ phép: " + super.getDayOff() +  "\t  Chức danh: " + getOrganisationRole() +  "\t Lương : "  + (int)calculateSalary());
    };


}
