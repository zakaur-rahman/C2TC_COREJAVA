package com.tns.jpastart.entities;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue( & quot; MGR & quot;)
public class Manager extends Employee {
    private static final long serialVersionUID = 1 L;
    private String departmentName;
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}