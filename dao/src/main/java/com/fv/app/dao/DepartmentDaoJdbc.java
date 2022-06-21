package com.fv.app.dao;

import com.fv.app.model.Department;

import java.util.List;

public interface DepartmentDaoJdbc {

    //CRUD - Create, Read, Update, Delete

    List<Department> GetAllDepartments ();

}
