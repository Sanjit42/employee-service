package com.employee.service;

import com.employee.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    private Employee employee;
    @CrossOrigin
    @GetMapping("/employees")
    public Employee getEmployees() {
        try {
            Configuration config = new Configuration()
                    .configure()
                    .addAnnotatedClass(Employee.class);

            ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            SessionFactory sf = config.buildSessionFactory(registry);
            Session session = sf.openSession();

            Transaction tx = session.beginTransaction();

            employee = (Employee) session.get(Employee.class, 63247);
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }

    @RequestMapping("/employee")
    public void storeEmployee(
            @RequestBody Employee employee
    ) {
        try {
            Configuration config = new Configuration()
                    .configure()
                    .addAnnotatedClass(Employee.class);

            ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            SessionFactory sf = config.buildSessionFactory(registry);
            Session session = sf.openSession();

            Transaction tx = session.beginTransaction();

            session.save(employee);
            tx.commit();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
