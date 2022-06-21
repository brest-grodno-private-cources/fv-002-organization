package com.fv.app.model;

import java.util.Date;

public class Employee {

    private Integer EmploeeID;

    private String FirstName;

    private String LastName;

    private String Email;

    private Date StartDate;

    private Integer DepartmentID;

    public Integer getEmploeeID() {
        return EmploeeID;
    }

    public void setEmploeeID(Integer emploeeID) {
        EmploeeID = emploeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Integer getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        DepartmentID = departmentID;
    }
}
