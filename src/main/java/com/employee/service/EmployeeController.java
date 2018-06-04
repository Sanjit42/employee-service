package com.employee.service;

import com.employee.model.*;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.*;

@RestController
public class EmployeeController {

    private List employees;
    private ResultSet sqlData;

    @CrossOrigin
    @GetMapping("/employees")
    public List getEmployees() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();

            sqlData = statement.executeQuery("SELECT * FROM employee");
            employees = getJSONFromResultSet(sqlData);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    @CrossOrigin
    @GetMapping("/employee/avatar")
    public List getAvatars() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();

            sqlData = statement.executeQuery("SELECT * FROM avatar");
            employees = getJSONFromResultSet(sqlData);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    @CrossOrigin
    @RequestMapping("/employee/avatar")
    public void saveEmployee(
            @RequestBody Employee employee
    ) {
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into employee (name, employeeId, role, gender, currentProject, homeOffice) values (?, ?, ?, ?, ? ,?)");

            preparedStatement.setString(1, employee.getName());
            preparedStatement.setInt(2, employee.getEmployeeId());
            preparedStatement.setString(3, employee.getGender());
            preparedStatement.setString(4, employee.getRole());
            preparedStatement.setString(5, employee.getCurrentProject());
            preparedStatement.setString(6, employee.getHomeOffice());

            preparedStatement.execute();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @CrossOrigin
    @RequestMapping("/employee/avatar/employeeId")
    public void saveAvatar(
            @RequestBody Avatar avatar
    ) {
        try {
            Connection connection = getConnection();
            PreparedStatement statement =
                    connection.prepareStatement("insert into avatar (employeeId, image) values (?, ?)");
            statement.setInt(1, avatar.getEmployeeId());
            statement.setString(2, avatar.getImage());
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @CrossOrigin
    @RequestMapping("/employee/domain")
    public void saveDomainSkill(
            @RequestBody Domain domain
    ) {
        try {
            Connection connection = getConnection();
            PreparedStatement statement =
                    connection.prepareStatement("insert into domain_skills (employeeId, government, education) values (?, ?, ?)");
            statement.setInt(1, domain.getEmployeeId());
            statement.setInt(2, domain.getGovernment());
            statement.setInt(3, domain.getEducation());
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @CrossOrigin
    @RequestMapping("/employee/consulting")
    public void saveConsultingSkill(
            @RequestBody Consulting consulting
    ) {
        try {
            Connection connection = getConnection();
            PreparedStatement statement =
                    connection.prepareStatement("insert into consulting_skills (employeeId, communication, planning, questioning) values (?, ?, ?, ?)");
            statement.setInt(1, consulting.getEmployeeId());
            statement.setInt(2, consulting.getCommunication());
            statement.setInt(3, consulting.getPlanning());
            statement.setInt(4, consulting.getQuestioning());
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @CrossOrigin
    @RequestMapping("/employee/technical")
    public void saveTechnicalSkill(
            @RequestBody Technical technical
    ) {
        try {
            Connection connection = getConnection();
            PreparedStatement statement =
                    connection.prepareStatement("insert into technical_skills (employeeId, java, AWS) values (?, ?, ?)");
            statement.setInt(1, technical.getEmployeeId());
            statement.setInt(2, technical.getJava());
            statement.setInt(3, technical.getAws());
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @CrossOrigin
    @RequestMapping("/employee/testing")
    public void saveTestingSkill(
            @RequestBody Testing testing
    ) {
        try {
            Connection connection = getConnection();
            PreparedStatement statement =
                    connection.prepareStatement("insert into testing_skills (employeeId, capybara, cucumber, fitnesse) values (?, ?, ?, ?)");
            statement.setInt(1, testing.getEmployeeId());
            statement.setInt(2, testing.getCapybara());
            statement.setInt(3, testing.getCucumber());
            statement.setInt(4, testing.getFitnesse());
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Properties props = new Properties();
        props.put("password", "password");
        props.put("user", "root");
        props.put("characterEncoding", "UTF-8");

        String url = "jdbc:mysql://localhost:3306/tw";

        Class.forName("com.mysql.jdbc.Driver");
        Connection myCon = DriverManager.getConnection(url, "root", "password");
        return myCon;
    }

    private static List getJSONFromResultSet(ResultSet result) {
        List list = new ArrayList();
        if (result != null) {
            try {

                ResultSetMetaData metaData = result.getMetaData();

                while (result.next()) {
                    Map<String, Object> columnMap = new HashMap<>();
                    for (int i = 1; i <= metaData.getColumnCount(); i++) {
                        String val = result.getString(metaData.getColumnName(i));
                        String key = metaData.getColumnLabel(i);

                        if (val == null) {
                            columnMap.put(key, "");
                        } else if (val.chars().allMatch(Character::isDigit)) {
                            columnMap.put(key, Integer.parseInt(val));
                        } else
                            columnMap.put(key, val);
                    }
                    list.add(columnMap);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
