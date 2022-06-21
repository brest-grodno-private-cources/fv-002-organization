package com.fv.app.model;

public class Department {

    private Integer DepartmentID;
    private String DepartmentName;
    private String DepartmentDescription;


    public Integer getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        DepartmentID = departmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentDescription() {
        return DepartmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        DepartmentDescription = departmentDescription;
    }
}
