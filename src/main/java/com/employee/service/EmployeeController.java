package com.employee.service;

import com.employee.model.Employee;
import com.employee.model.SkillsAndAbilities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private List<SkillsAndAbilities> skillsAndAbilities;
    private List<Employee> employees;

    @CrossOrigin
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        try {
            Session session = getSession();

            Transaction tx = session.beginTransaction();
            employees = session.createCriteria(Employee.class).list();
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employees;
    }

    @CrossOrigin
    @RequestMapping("/employee")
    public void storeEmployee(
            @RequestBody Employee employee
    ) {
        try {
            Session session = getSession();

            Transaction tx = session.beginTransaction();
            session.save(employee);
            tx.commit();

        } catch (Exception e) {
            e.getMessage();
        }
    }

    @CrossOrigin
    @RequestMapping("/employee/skillsAndAbilities")
    public void saveSkillsAndAbilities(
            @RequestBody SkillsAndAbilities skillsAndAbilities
    ) {
        try {
            Session session = getSession();

            Transaction tx = session.beginTransaction();
            session.save(skillsAndAbilities);
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @CrossOrigin
    @GetMapping("/employees/skillsAndAbilities")
    public List<SkillsAndAbilities> getSkillsAndAbilities() {
        try {
            Session session = getSession();

            Transaction tx = session.beginTransaction();

            skillsAndAbilities = session.createCriteria(SkillsAndAbilities.class).list();

            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return skillsAndAbilities;
    }

    private Session getSession() {
        Configuration config = new Configuration()
                .configure()
                .addAnnotatedClass(SkillsAndAbilities.class);

        ServiceRegistry registry = new ServiceRegistryBuilder()
                .applySettings(config.getProperties())
                .buildServiceRegistry();
        SessionFactory sf = config.buildSessionFactory(registry);
        return sf.openSession();
    }
}
