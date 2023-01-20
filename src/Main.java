public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 1);
        employees[1] = new Employee("Петров Петр Петрович", 2, 2);
        employees[2] = new Employee("Арбузов Игорь Семенович", 3, 3);
        employees[3] = new Employee("Голубев Александр Никитич", 1, 4);
        employees[4] = new Employee("Рязанов Максим Сергеевич", 2, 5);
        employees[5] = new Employee("Сидоров Алексей Михайлович", 5, 6);
        employees[6] = new Employee("Бунина Елена Игоревна", 4, 7);
        employees[7] = new Employee("Бакина Ольга Романовна", 5, 8);
        employees[8] = new Employee("Цветков Семен Николаевич", 3, 9);
        employees[9] = new Employee("Кошкина Ольга Валерьевна", 4, 10);
        Employee.getListEmployees(employees);
        Employee.calculateAmountSalaries(employees);
        Employee.findEmployeeMinSalary(employees);
        Employee.findEmployeeMaxSalary(employees);
        Employee.calculateAverageSalaries(employees);
        Employee.getNamesEmployees(employees);
        Employee.increaseSalary(employees, 10);
        Employee.findEmployeeMinSalaryNew(employees, 5);
        Employee.findEmployeeMaxSalaryNew(employees, 2);
        Employee.calculateAmountSalariesNew(employees, 5);
        Employee.calculateAverageSalariesNew(employees, 4);
        Employee.increaseSalaryNew(employees, 100, 4);
        Employee.printDepartmentEmployees(employees, 5);
        Employee.findSalaryMore(employees, 8);
        Employee.findSalaryLess(employees, 8);

    }

}