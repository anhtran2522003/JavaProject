package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class  HumanResoucres {


    public static void main(String[] args) {
        boolean continueFunction;
        ArrayList<Department> arrdepart = createDepart();
        ArrayList<Staff> arrStaff = createSomeStaff(arrdepart);
        do {
            continueFunction = selectFunction(arrStaff, arrdepart);
        } while (continueFunction);
    }

    // tạo các bộ phận trong công ty
    private static ArrayList<Department> createDepart() {
        // Tạo các bộ phận công ty
        Department departService = new Department("DEP_001_SER", "Service");
        Department departSupply = new Department("DEP_002_SCM", "Supply");
        Department departAssurance = new Department("DEP_003_PQA", "Assurance");
        Department departFinance = new Department("DEP_004_FIN", "Finance ");
        Department departIT = new Department("DEP_005_IT", "IT");

        ArrayList<Department> arrdepart = new ArrayList<>(5);
        arrdepart.add(departService);
        arrdepart.add(departSupply);
        arrdepart.add(departAssurance);
        arrdepart.add(departFinance);
        arrdepart.add(departIT);

        return arrdepart;
    }


    // tạo sẵn 1 số nhân viên
    private static ArrayList createSomeStaff(ArrayList<Department> arrdepart) {

        Staff employee1 = new Employee("01040001", "A", 30, 2.1, "25.02.2003", arrdepart.get(0), 4, 1);
        Staff employee2 = new Employee("01040002", "B", 30, 3.5, "25.02.2003", arrdepart.get(0), 4, 2);
        Staff manager1 = new Manager("01040003", "C", 30, 5.0, "25.02.2003", arrdepart.get(0), 4, "1");


        Staff employee3 = new Employee("01040004", "D", 30, 3.2, "25.02.2003", arrdepart.get(1), 4, 2);
        Staff employee4 = new Employee("01040005", "E", 30, 3.3, "25.02.2003", arrdepart.get(1), 4, 4);
        Staff manager2 = new Manager("01040006", "F", 30, 4.0, "25.02.2003", arrdepart.get(1), 4, "2");

        Staff employee5 = new Employee("01040007", "G", 30, 2.5, "25.02.2003", arrdepart.get(2), 4, 5);
        Staff employee6 = new Employee("01040008", "H", 30, 3.4, "25.02.2003", arrdepart.get(2), 4, 1);
        Staff manager3 = new Manager("01040009", "I", 30, 4.5, "25.02.2003", arrdepart.get(2), 4, "3");

        Staff employee7 = new Employee("01040010", "J", 30, 3.7, "25.02.2003", arrdepart.get(3), 4, 7);
        Staff employee8 = new Employee("01040011", "K", 30, 3.9, "25.02.2003", arrdepart.get(3), 4, 2);
        Staff manager4 = new Manager("01040012", "L", 30, 5, "25.02.2003", arrdepart.get(3), 4, "1");

        Staff employee9 = new Employee("01040013", "M", 30, 2.4, "25.02.2003", arrdepart.get(4), 4, 4);
        Staff employee10 = new Employee("01040014", "N", 30, 3.4, "25.02.2003", arrdepart.get(4), 4, 1);
        Staff manager5 = new Manager("01040015", "O", 30, 4.5, "25.02.2003", arrdepart.get(4), 4, "2");

        ArrayList<Staff> arrStaff = new ArrayList<Staff>(15);
        arrStaff.add(employee1);
        arrStaff.add(employee2);
        arrStaff.add(employee3);
        arrStaff.add(employee4);
        arrStaff.add(employee5);
        arrStaff.add(employee6);
        arrStaff.add(employee7);
        arrStaff.add(employee8);
        arrStaff.add(employee9);
        arrStaff.add(employee10);
        arrStaff.add(manager1);
        arrStaff.add(manager2);
        arrStaff.add(manager3);
        arrStaff.add(manager4);
        arrStaff.add(manager5);
        return arrStaff;
    }

    // chọn chức năng
    private static boolean selectFunction(ArrayList<Staff> arrStaff, ArrayList<Department> arrdepart) {
        // In bảng chọn  chức năng
        System.out.println("\t CHỌN CHỨC NĂNG (chọn theo số thứ tự)\n "
                + "1. Hiển thị danh sách nhân viên hiện có trong công ty\n"
                + "2. Hiển thị các bộ phận trong công ty\n"
                + "3. Hiển thị các nhân viên theo từng bộ phận\n"
                + "4. Thêm nhân viên mới vào công ty\n"
                + "5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên\n"
                + "6. Hiển thị bảng lương của nhân viên toàn công ty\n"
                + "7. Hiển thị bảng lương của nhân viên theo thứ tự \n"
                + "8. Thoát ");
        //Chọn chức năng
        Scanner sc = new Scanner(System.in);
        int indexFunction = sc.nextInt();
        switch (indexFunction) {
            case 1:
                // Hiển thị danh sách nhân viên hiện có trong công ty
                showListStaff(arrStaff);
                return true;
            case 2:
                // Hiển thị các bộ phận trong công ty
                showDepartment(arrStaff, arrdepart);
                return true;
            case 3:
                // Hiển thị các nhân viên theo từng bộ phận
                showEmloyee_department(arrStaff, arrdepart);
                return true;
            case 4:
//                 Thêm nhân viên mới vào công ty
                System.out.println("1. Thêm nhân viên thông thường \n"
                        + "2. Thêm nhân viên là cấp quản lý");
                int indexFunctionSpecific = sc.nextInt();
                switch (indexFunctionSpecific) {
                    case 1:
                        addEmployee(arrStaff, arrdepart);
                        break;
                    case 2:
                        addManager(arrStaff, arrdepart);
                        break;
                }
                ;
                return true;
            case 5:
                // Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
//                findInfor();
                System.out.println("1. Tìm kiếm thông tin theo tên  \n"
                        + "2. Tìm kiếm thông tin theo mã nhân viên ");
                indexFunctionSpecific = sc.nextInt();
                switch (indexFunctionSpecific) {
                    case 1:
                        findInfor_name(arrStaff);
                        break;
                    case 2:
                        findInfor_index(arrStaff);
                        break;
                    default:
                        System.out.println("Chọn chức năng 1 hoặc 2. Hãy thử lại!");
                }
                ;
                return true;
            case 6:
                // Hiển thị bảng lương của nhân viên toàn công ty
                showSalary(arrStaff);
                return true;
            case 7:
                // Hiển thị bảng lương của nhân viên theo thứ tự
                System.out.println("1. Tăng dần  \n"
                        + "2. Giảm dần ");
                indexFunctionSpecific = sc.nextInt();
                switch (indexFunctionSpecific) {
                    case 1:
                        sortSalaryIncrease(arrStaff);
                        break;
                    case 2:
                        sortSalaryDecrease(arrStaff);
                        break;
                    default:
                        System.out.println("Chọn chức năng 1 hoặc 2. Hãy thử lại!");
                }
                ;

                return true;
            case 8:
                // Thoát
                return false;
            default:
                System.out.println("Hãy nhập số thứ tự chức năng mà bạn muốn chọn!\n");
        }
        return true;
    }


    //1. Hiển thị danh sách nhân viên hiện có trong công ty
    private static void showListStaff(ArrayList<Staff> arrStaff) {
        for (Staff s : arrStaff) {
            s.displayInformation();
        }
    }

    //2. Hiển thị các bộ phận trong công ty
    private static void showDepartment(ArrayList<Staff> arrStaff, ArrayList<Department> arrdepart) {
        for (Department depart : arrdepart) {
            int i = 0;
            for (Staff s : arrStaff) {
                if (s.getDepartment().equals(depart)) {
                    i++;
                }
            }
            depart.setCurrentStaff(i);
            depart.displayInformation();
        }
    }

    //3. Hiển thị các nhân viên theo từng bộ phận
    private static void showEmloyee_department(ArrayList<Staff> arrStaff, ArrayList<Department> arrdepart) {
        for (Department depart : arrdepart) {
            int i = 0;
            for (Staff s : arrStaff) {
                if (s.getDepartment().equals(depart)) {
                    i++;
                }
            }
            depart.setCurrentStaff(i);
            depart.displayInformation();
            for (Staff s : arrStaff) {
                if (s.getDepartment().equals(depart)) {
                    s.displayInformation();
                }
            }
            System.out.println();
        }
    }

    // 4.Thêm nhân viên mới vào công ty
    private static void addEmployee(ArrayList<Staff> arrStaff, ArrayList<Department> arrdepart) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập thông tin nhân viên mới:");

        System.out.print("ID:");
        String ID = sc.next();

        // Kiểm tra ID đã tồn tại chưa
        boolean have = false;
        do {
            for (Staff s : arrStaff) {
                if (ID.equals(s.getID())) {
                    System.out.println("Mã nhân viên này đã tồn tại! Vui lòng nhập lại!");
                    System.out.print("ID:");
                    ID = sc.next();
                    have = true;
                    break;
                } else {
                    have = false;
                }

            }
        } while (have);

        System.out.print("Tên:");
        String name = sc.next();


        System.out.print("Tuổi:");
        int age = sc.nextInt();

        System.out.print("Hệ số lương:");
        int multiSalary = sc.nextInt();

        System.out.print("Ngày vào làm ( VD: 01.01.1999):");
        String dateHiring = sc.next();

        System.out.print("Bộ Phận: " +
                "1. Service " +
                "2. Supply " +
                "3. Assurance" +
                "4. Finance" +
                "5. IT\n" +
                "Hãy nhập thứ tự của bộ phận!");
        int indexDepart = sc.nextInt();

        Department department = new Department("", "");
        switch (indexDepart) {
            case 1:
                department = arrdepart.get(0);
                break;
            case 2:
                department = arrdepart.get(1);
                break;
            case 3:
                department = arrdepart.get(2);
                break;
            case 4:
                department = arrdepart.get(3);
                break;
            case 5:
                department = arrdepart.get(4);
                break;

        }
//       Department departService = new Department("DEP_001_SER", "Service" );
//       Department departSupply = new Department("DEP_002_SCM", "Supply" );
//       Department departAssurance = new Department("DEP_003_PQA", "Assurance" );
//       Department departFinance  = new Department("DEP_004_FIN", "Finance " );
//       Department departIT = new Department("DEP_005_IT", "IT" );
        //Kiểm tra số ngày nghỉ phép
        System.out.print("Số ngày nghỉ phép:");
        int dayOff = sc.nextInt();
        boolean numDayOff = false;
        do {
            for (Staff s : arrStaff) {
                if (dayOff > 366) {
                    System.out.println("Tính số ngày nghỉ phép trong 1 năm!");
                    System.out.print("Số ngày nghỉ phép:");
                    dayOff = sc.nextInt();
                    numDayOff = true;
                    break;
                } else {
                    numDayOff = false;
                }

            }
        } while (numDayOff);

        System.out.print("Số giờ làm thêm:");
        int extraHour = sc.nextInt();

        Staff addEmployee = new Employee(ID, name, age, multiSalary, dateHiring, department, dayOff, extraHour);
        arrStaff.add(addEmployee);
    }

    private static void addManager(ArrayList<Staff> arrStaff, ArrayList<Department> arrdepart) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập thông tin nhân viên mới:");

        System.out.print("ID:");
        String ID = sc.next();
        // Kiểm tra ID đã tồn tại chưa
        boolean have = false;
        do {
            for (Staff s : arrStaff) {
                if (ID.equals(s.getID())) {
                    System.out.println("Mã nhân viên này đã tồn tại! Vui lòng nhập lại!");
                    System.out.print("ID:");
                    ID = sc.next();
                    have = true;
                    break;
                } else {
                    have = false;
                }

            }
        } while (have);

        System.out.print("Tên:");
        String name = sc.next();

        System.out.print("Tuổi:");
        int age = sc.nextInt();

        System.out.print("Hệ số lương:");
        int multiSalary = sc.nextInt();

        System.out.print("Ngày vào làm:");
        String dateHiring = sc.next();

        System.out.print("Bộ Phận: " +
                "1. Service " +
                "2. Supply " +
                "3. Assurance" +
                "4. Finance" +
                "5. IT\n" +
                "Hãy nhập thứ tự của bộ phận!");
        int indexDepart = sc.nextInt();

        Department department = new Department("", "");
        switch (indexDepart) {
            case 1:
                department = arrdepart.get(0);
                break;
            case 2:
                department = arrdepart.get(1);
                break;
            case 3:
                department = arrdepart.get(2);
                break;
            case 4:
                department = arrdepart.get(3);
                break;
            case 5:
                department = arrdepart.get(4);
                break;
        }

        System.out.print("Số ngày nghỉ phép:");
        int dayOff = sc.nextInt();

        System.out.print("Vị trí:\n" +
                "1. Business Leader\n" +
                "2. Project Leader\n" +
                "3. Technical Leader");
        String organisationRole = sc.next();

        Staff addManager = new Manager(ID, name, age, multiSalary, dateHiring, department, dayOff, organisationRole);
        arrStaff.add(addManager);
    }

    //5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
    private static void findInfor_name(ArrayList<Staff> arrStaff) {
        System.out.println("Hãy nhập tên bạn muốn tìm kiếm:");
        Scanner sc = new Scanner(System.in);
        int have = 0;
        String find = sc.next();
        for (Staff stf : arrStaff) {
            if (stf.getName().equalsIgnoreCase(find)) {
                stf.displayInformation();
                have++;
            }
        }
        if (have == 0) {
            System.out.println("Không tìm thấy đối tượng phù hợp!");
        }
    }

    private static void findInfor_index(ArrayList<Staff> arrStaff) {
        System.out.println("Hãy nhập mã nhân viên  bạn muốn tìm kiếm:");
        Scanner sc = new Scanner(System.in);
        String find = sc.next();
        int have = 0;
        for (Staff stf : arrStaff) {
            if (stf.getID().equalsIgnoreCase(find)) {
                stf.displayInformation();
                have++;
            }
        }
        if (have == 0) {
            System.out.println("Không tìm thấy đối tượng phù hợp!");
        }
    }

    //6. Hiển thị bảng lương của nhân viên toàn công ty
    private static void showSalary(ArrayList<Staff> arrStaff) {
        for (Staff s : arrStaff) {
            System.out.println("ID: " + s.getName() + "\t Tên: " + s.getName() + "\t Bộ phận: " + s.getDepartment().getIdDepart() + "\t Lương: " + s.calculateSalary());
        }
    }

    // 7. Hiển thị bảng lương của nhân viên theo thứ tự
    // tăng dần
    private static void sortSalaryIncrease(ArrayList<Staff> arrStaff) {
        ArrayList<Staff> sortArrStaff = sortSalary(arrStaff);
        for (Staff stf : sortArrStaff) {
            stf.displayInformation();
        }
    }

    // giảm dần
    private static void sortSalaryDecrease(ArrayList<Staff> arrStaff) {
        ArrayList<Staff> sortArrStaff = sortSalary(arrStaff);
        for (int i = sortArrStaff.size() - 1 ; i >= 0; i-- ) {
            sortArrStaff.get(i).displayInformation();
        }
    }

    // Sắp xếp lương thep thứ tự
    private static ArrayList<Staff> sortSalary(ArrayList<Staff> arrStaff) {
        Staff temp;
        ArrayList<Staff> sortArrStaff = new ArrayList<Staff>();
        for (Staff s : arrStaff) {
            sortArrStaff.add(s);
        }
        double minSalary;
        for (int i = 0; i < sortArrStaff.size(); i++) {
            minSalary = sortArrStaff.get(i).calculateSalary();
            for (int j = i + 1; j < sortArrStaff.size(); j++) {
                if (minSalary > sortArrStaff.get(j).calculateSalary()) {
                    minSalary = sortArrStaff.get(j).calculateSalary();
                    temp = sortArrStaff.get(i);
                    sortArrStaff.set(i, sortArrStaff.get(j));
                    sortArrStaff.set(j, temp);
                }
            }

        }
        return sortArrStaff;
    }
}