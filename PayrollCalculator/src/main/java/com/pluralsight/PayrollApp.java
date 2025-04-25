package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {




        try {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter the name of the file employee file to process: ");
            String fileName = scanner.nextLine();

            System.out.println("Enter the name of the payroll file to create: ");
            String payrollFileName = scanner.nextLine();


            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(payrollFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            fileWriter.write("id|name|gross pay\n");



            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employeeData = line.split("\\|");
                System.out.println(line);

                if (employeeData.length == 4) {
                    try {
                        int employeeId = Integer.parseInt(employeeData[0].trim());
                        String name = employeeData[1].trim();
                        double hoursWorked = Double.parseDouble(employeeData[2].trim());
                        double payRate = Double.parseDouble(employeeData[3].trim());

                        Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                        System.out.printf("Employees Id: %d%n", employee.getEmployeeId());
                        System.out.printf("Employees name: %s%n", employee.getName());
                        System.out.printf("Employees gross pay: $%.2f%n", employee.getGrossPay());
                    } catch (NumberFormatException e) {
                        System.out.println("Error");
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(payrollFileName);
            bufferedReader.close();


        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}












