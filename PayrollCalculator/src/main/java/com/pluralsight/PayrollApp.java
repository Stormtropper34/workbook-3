package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollApp {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/data/employees.csv");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String headerLine = bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employeesData = line.split("\\|");
                System.out.println(line);

                if (employeesData.length == 4) {
                    try {
                        int employeeId = Integer.parseInt(employeesData[0].trim());
                        String name = employeesData[1].trim();
                        double hoursWorked = Double.parseDouble(employeesData[2].trim());
                        double payRate = Double.parseDouble(employeesData[3].trim());

                        Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                        System.out.printf("Employees Id: %d%n", employee.getEmployeeId());
                        System.out.printf("Employees name: %s%n", employee.getName());
                        System.out.printf("Employees gross pay: $%.2f%n", employee.getGrossPay());
                    } catch (NumberFormatException e) {
                        System.out.println("String error: " + employeesData[0].trim());
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Wrong" + line);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}












