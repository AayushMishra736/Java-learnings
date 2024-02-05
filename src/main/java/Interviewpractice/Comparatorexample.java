package Interviewpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

    int id;
    String name;
    int joiningYear;

    public Employee(int id, String name, int joiningYear) {
        this.id = id;
        this.name = name;
        this.joiningYear = joiningYear;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }
}

class Namecomparator implements Comparator{

    public int compare(Object o1,Object o2){
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.getName().compareTo(e2.getName());
    }
}

class Datecomparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        if(e1.joiningYear == e2.joiningYear){
            return 0;
        } else if (e2.joiningYear > e2.joiningYear) {
            return 1;
        }else {
            return -1;
        }
    }
}

public class Comparatorexample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Oggy",2011));
        employeeList.add(new Employee(2,"Sinchan",2014));
        employeeList.add(new Employee(3,"Doremon",2017));
        employeeList.add(new Employee(4,"Tom&Jerry",2019));

        Collections.sort(employeeList,new Datecomparator());

        for(Employee employee: employeeList){
            System.out.println(employee.id + " : " + employee.name +  " : " + employee.joiningYear);
        }

        Collections.sort(employeeList,new Namecomparator());

        for(Employee employee: employeeList){
            System.out.println(employee.id + " : " + employee.name +  " : " + employee.joiningYear);
        }

    }
}
