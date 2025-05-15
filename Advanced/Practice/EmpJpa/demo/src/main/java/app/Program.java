package app;

import app.data.DeptEntity;
import jakarta.persistence.Persistence;

public class Program {
    
    public static void main(String[] args) throws Exception {

        var emf = Persistence.createEntityManagerFactory("app.data");
        try(var em = emf.createEntityManager()){
            if(args.length == 0){
                var query = em.createQuery("SELECT d FROM DeptEntity d", DeptEntity.class);
                var departments = query.getResultList();
                for (var dept : departments) {
                    System.out.printf("%d\t%s\t%s\n", dept.getDeptNo(), dept.getDeptName(),dept.getLocation());
                }
            }else{
                int empid = Integer.parseInt(args[0]);
                var emp = em.find(DeptEntity.class, empid);
                if(emp != null){
                    for(var entry : emp.getEmployees()){
                        System.out.printf("%d\t%s\t%s\t%f\t%s\n", entry.getEmpid(), entry.getEmpName(),emp.getDeptName(), entry.getSalary(),entry.getJob());
                    }
                }else{
                    System.out.println("Department not Found");
                }
            }
        }
    }
}

