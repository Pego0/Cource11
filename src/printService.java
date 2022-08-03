public class printService {
    public void print(Employee[] workers) {
        System.out.println("Size of workers list: " + workers.length);
        for (int i = 0; i < workers.length; i++) {
            Employee employee = workers[i];
            System.out.println("Name: " + employee.getName() + "; department: " + employee.getDepartment() + "; salary: " + employee.getSalary() + ".");
        }
    }
}
