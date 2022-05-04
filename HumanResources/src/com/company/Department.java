package com.company;

public class Department {
    private  String idDepart;
    private  String Depart;
    private  int currentStaff ;

     public Department(String idDepart, String Depart) {
         this.idDepart = idDepart ;
         this.Depart = Depart ;
      }


    //
    public String getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(String idDepart) { this.idDepart = idDepart; }

    //
    public String getDepart() {
        return Depart;
    }

    public void setDepart(String Depart) {
        this.Depart = Depart;
    }

    //
    public int getCurrentStaff() {
        return currentStaff;
    }

    public void setCurrentStaff(int currentStaff) {
        this.currentStaff = currentStaff;
    }

    @Override
    public String toString() {
        return "Mã bộ phận: " + idDepart + "\t Tên bộ phận: " + Depart  ;
    }
    public  void displayInformation() {
        System.out.println("Mã bộ phận: " + idDepart + "\t Tên bộ phận: " + Depart + "\t Số nhân viên hiện tại: " + currentStaff);
    }
}
