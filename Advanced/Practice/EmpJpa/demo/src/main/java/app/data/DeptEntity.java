package app.data;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "dept")
public class DeptEntity {
    
    @Id
    @Column(name = "deptno")
    private int deptNo;

    @Basic
    @Column(name = "dname")
    private String deptName;

    @Basic 
    @Column(name = "loc")
    private String location;

    @OneToMany(mappedBy = "dept", cascade = CascadeType.REFRESH)
    private List<EmployeeEntity> employees;

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<EmployeeEntity> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeEntity> employees) {
        this.employees = employees;
    }

   

}
