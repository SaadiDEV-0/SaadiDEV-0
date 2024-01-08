package com.mycompany.encapsulation;
class Employee{
private int emp_id;
    int setEmpId;

public void setEmpId(int emp_id1){
  emp_id = emp_id1;
}

public int getEmpId(){
  return emp_id;
}
}


public class ENCAPSULATION {

    public static void main(String[] args) {
       Employee employee = newEmployee();
       employee.setEmpId = (69);
        
        System.out.println("Emp Id:" + getEmpId());
    }

    private static String getEmpId() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static Employee newEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
