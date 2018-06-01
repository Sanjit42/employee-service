package com.employee.service;

import com.employee.model.Avatar;
import com.employee.model.Employee;
import com.employee.model.Technical;
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
    @RequestMapping("/employees/employeeId")
    public void saveTechnicalAbilities(
            @RequestBody Technical technical
    ) {
        System.out.println(technical);
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
