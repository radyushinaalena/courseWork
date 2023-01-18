public class Main {
    public static Employee[] employees;
    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 33333.55);
        employees[1] = new Employee("Петров Петр Петрович", 2, 222222.5);
        employees[2] = new Employee("Арбузов Игорь Семенович", 3, 33333.33);
        employees[3] = new Employee("Голубев Александр Никитич", 1, 22);
        employees[4] = new Employee("Рязанов Максим Сергеевич", 2, 222222);
        employees[5] = new Employee("Сидоров Алексей Михайлович", 5, 66666);
        employees[6] = new Employee("Бунина Елена Игоревна", 4, 22);
        employees[7] = new Employee("Бакина Ольга Романовна", 5, 22);
        employees[8] = new Employee("Цветков Семен Николаевич", 3, 222222);
        employees[9] = new Employee("Кошкина Ольга Валерьевна", 4, 22);
        Employee.getListEmployees();
        Employee.calculateAmountSalaries();
        Employee.findEmployeeMinSalary();
        Employee.findEmployeeMaxSalary();
        Employee.calculateAverageSalaries();
        Employee.getNamesEmployees();
    }

}