package org.spring.constructorijection;

import java.awt.datatransfer.StringSelection;

public class EmployeeBean {
    public int id;
    public String name;
    public EmployeeAddress employeeAddress;

    public EmployeeBean(int id,String name,EmployeeAddress employeeAddress){
       super();
       this.id = id;
       this.name = name;
       this.employeeAddress = employeeAddress;
    }

}
