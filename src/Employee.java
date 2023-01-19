public class Employee {

    private String name;
    private int department;
    private double salary;

    private static int counter;
    private int id;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void getListEmployees(Employee[] employees) {

        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public static void calculateAmountSalaries(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += employees[i].getSalary();
        }
        System.out.printf("Сумма затрат на зарплаты в месяц: %.2f \n" ,sum);
    }

    public static void calculateAverageSalaries(Employee[] employees) {
        double sum = 0;
        double averageSum = 0;
        int k=0;
        for (int i = 0; i < counter; i++) {
            k++;
            sum += employees[i].getSalary();
        }
        averageSum = sum / k;
        System.out.printf("Средняя зарплата за месяц: %.2f \n" , averageSum);
    }
    public static void getNamesEmployees(Employee[] employees) {

        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getName());
        }
    }
    public static void findEmployeeMinSalary(Employee[] employees) {
        double min = employees[0].getSalary();
        String minEmployee = employees[0].getName();
        for (int i = 1; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                minEmployee = employee.getName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minEmployee);
    }

    public static void findEmployeeMaxSalary(Employee[] employees) {
        double max = employees[0].getSalary();
        String maxEmployee = employees[0].getName();
        for (int i = 1; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                maxEmployee = employee.getName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxEmployee);
    }

    @Override
    public String toString() {
        return "ФИО: " + name + ", отдел: " + department + ", з/п: " + salary;
    }

}
