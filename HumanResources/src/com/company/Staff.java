package com.company;

 abstract class Staff implements ICalculator  {
    private String  ID;
    private String name;
    private int age;
    private double multiSalary ;
    private String dateHiring ;
    private  Department department;
    private int dayOff;

    public Staff(String ID, String name,  int age, double multiSalary, String dateHiring,  Department department, int dayOff ){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.multiSalary = multiSalary;
        this.dateHiring = dateHiring;
        this.department = department;
        this.dayOff = dayOff;
    };


//
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
    public double getMultiSalary() {
        return multiSalary;
    }

    public void setMultiSalary(double multiSalary) {
        this.multiSalary = multiSalary;
    }
//
    public String getDateHiring() {
        return dateHiring;
    }

    public void setDateHiring(String dateHiring) {
        this.dateHiring = dateHiring;
    }
//
    public  Department getDepartment() {
        return department;
    }

    public void setDepartment( Department department) {
        this.department = department;
    }
//
    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

     abstract void displayInformation();

}
