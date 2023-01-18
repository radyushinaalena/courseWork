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
        counter++;
        id = counter;
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

    public static void getListEmployees() {

        for (int i = 0; i < counter; i++) {
            Employee employee = Main.employees[i];
            System.out.println(employee);
        }
    }

    public static void calculateAmountSalaries() {
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += Main.employees[i].salary;
        }
        System.out.printf("Сумма затрат на зарплаты в месяц: %.2f \n" ,sum);
    }

    public static void calculateAverageSalaries() {
        double sum = 0;
        double averageSum = 0;
        for (int i = 0; i < counter; i++) {
            sum += Main.employees[i].salary;
        }
        averageSum = sum / counter;
        System.out.printf("Средняя зарплата за месяц: %.2f \n" , averageSum);

    }


    public static void getNamesEmployees() {

        for (int i = 0; i < counter; i++) {
            Employee employee = Main.employees[i];
            System.out.println(employee.getName());
        }
    }

    public static void findEmployeeMinSalary() {
        double min = Main.employees[0].getSalary();
        String minEmployee = Main.employees[0].getName();
        for (int i = 1; i < counter; i++) {
            Employee employee = Main.employees[i];
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                minEmployee = employee.getName();
            } else if (employee.getSalary() == min) {
                min = employee.getSalary();
                minEmployee = minEmployee + ", " + employee.getName();
            }

        }
        System.out.println("Сотрудник(и) с минимальной зарплатой: " + minEmployee);
    }

    public static void findEmployeeMaxSalary() {
        double max = Main.employees[0].getSalary();
        String maxEmployee = Main.employees[0].getName();
        for (int i = 1; i < counter; i++) {
            Employee employee = Main.employees[i];
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                maxEmployee = employee.getName();
            } else if (employee.getSalary() == max) {
                max = employee.getSalary();
                maxEmployee = maxEmployee + ", " + employee.getName();
            }

        }
        System.out.println("Сотрудник(и) с максимальной зарплатой: " + maxEmployee);
    }

    @Override
    public String toString() {
        return "ФИО: " + name + ", отдел: " + department + ", з/п: " + salary;
    }

}
