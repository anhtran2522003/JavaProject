package com.company;
// employee class
public class Employee extends Staff  {
     private int extraHour ;
//    public static int currentEmployee = 0;
    public Employee(String ID, String name,  int age, double multiSalary, String dateHiring, Department department, int dayOff,  int extraHour ){
        super( ID, name, age, multiSalary,dateHiring, department,  dayOff);
        this.extraHour =  extraHour;
//        currentEmployee++;
    };



    public int getExtraHour() {
        return extraHour;
    }

    public void setExtraHour(int extraHour) {
        this.extraHour = extraHour;
    }


    @Override
    public double calculateSalary() {
        return super.getMultiSalary() * 3000000 + extraHour * 200000;
    }

    public  void displayInformation() {
        System.out.println("ID: " + super.getID() +  "\t Tên : " + super.getName() + "\t Tuổi " + super.getAge()  + "\t Hệ số lương: " + super.getMultiSalary() + "\t Ngày vào làm: " + super.getDateHiring() +"\t Bộ phận: " + super.getDepartment()  + "\t Số ngày nghỉ phép: " + super.getDayOff() +  "\t Số giờ làm thêm : " + getExtraHour() +  "\t Lương : " + (int)calculateSalary()  );
    };
}
