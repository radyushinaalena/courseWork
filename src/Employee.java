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
        id = ++counter;
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

    //Получить список всех сотрудников со всеми имеющимися по ним данными
    public static void getListEmployees(Employee[] employees) {

        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    //Посчитать сумму затрат на зарплаты в месяц
    public static void calculateAmountSalaries(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += employees[i].getSalary();
        }
        System.out.printf("Сумма затрат на зарплаты в месяц: %.2f \n", sum);
    }

    //Подсчитать среднее значение зарплат
    public static void calculateAverageSalaries(Employee[] employees) {
        double sum = 0;
        double averageSum = 0;
        int k = 0;
        for (int i = 0; i < counter; i++) {
            k++;
            sum += employees[i].getSalary();
        }
        averageSum = sum / k;
        System.out.printf("Средняя зарплата за месяц: %.2f \n", averageSum);
    }

    //Получить Ф. И. О. всех сотрудников
    public static void getNamesEmployees(Employee[] employees) {

        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getName());
        }
    }

    //Найти сотрудника с минимальной зарплатой
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

    //Найти сотрудника с максимальной зарплатой
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

    //1. Проиндексировать зарплату
    public static void increaseSalary(Employee[] employees, double index) {
        for (int i = 0; i < counter; i++) {
            double newSalary = employees[i].getSalary() * (1 + index / 100);
            employees[i].setSalary(newSalary);
            System.out.printf("%.2f \n", employees[i].getSalary());
        }
    }

    //2a. Повышенная сложность. Найти сотрудника с минимальной зарплатой в отделе
    public static void findEmployeeMinSalaryNew(Employee[] employees, int department) {
        double min = 0;
        String minEmployee = null;
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                min = employee.getSalary();
                minEmployee = employee.getName();
                break;
            }
        }

        for (int n = 0; n < counter; n++) {
            Employee employee = employees[n];
            if (employee.getDepartment() == department && employee.getSalary() < min) {
                min = employee.getSalary();
                minEmployee = employee.getName();
            }
        }
        System.out.println("Сотрудник из отдела " + department + " с минимальной зарплатой: " + minEmployee);
    }

    //2b.Повышенная сложность. Найти сотрудника с максимальной зарплатой в отделе
    public static void findEmployeeMaxSalaryNew(Employee[] employees, int department) {
        double max = -1;
        String maxEmployee = null;
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department && employee.getSalary() > max) {
                max = employee.getSalary();
                maxEmployee = employee.getName();
            }
        }
        System.out.println("Сотрудник из отдела " + department + " с максимальной зарплатой: " + maxEmployee);
    }

    // 2c. Сумма затрат на зарплату по отделу
    public static void calculateAmountSalariesNew(Employee[] employees, int department) {
        double sum = 0.0;
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        System.out.printf("Сумма затрат на зарплаты в месяц в " + department + " отделе: %.2f \n", sum);
    }

    // 2d. Средняя зарплата по отделу
    public static void calculateAverageSalariesNew(Employee[] employees, int department) {
        double sum = 0;
        double averageSum = 0;

        int k = 0;
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {

                k++;
                sum += employees[i].getSalary();
            }
            averageSum = sum / k;
        }
        System.out.printf("Средняя зарплата за месяц в " + department + " отделе: %.2f \n", averageSum);

    }

    // 2e. Проиндексировать зарплату всех сотрудников отдела на процент
    public static void increaseSalaryNew(Employee[] employees, double index, int department) {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                double newSalary = employees[i].getSalary() * (1 + index / 100);
                employees[i].setSalary(newSalary);
            }
            System.out.printf("%.2f \n", employees[i].getSalary());

        }
    }

    // 2f. Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public static void printDepartmentEmployees(Employee[] employees, int department) {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                System.out.println("ФИО: " + employee.getName() + " з/п: " + employee.getSalary());
            }
        }
    }

    // Все сотрудники с зарплатой меньше числа
    public static void findSalaryMore(Employee[] employees, double x) {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < x) {
                System.out.println("ID: " + employee.getId() + " ФИО: " + employee.getName() + " з/п: " + employee.getSalary());
            }
            }
            }
    // Все сотрудники с зарплатой , числа
    public static void findSalaryLess(Employee[] employees, double x) {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > x) {
                System.out.println("ID: " + employee.getId() + " ФИО: " + employee.getName() + " з/п: " + employee.getSalary());
            }
        }
    }

            @Override
            public String toString () {
                return "ФИО: " + name + ", отдел: " + department + ", з/п: " + salary;
            }

        }
