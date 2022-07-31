public class Main {
    public static void main(String[] args) {
        Employee[] workers = {
                new Employee("John H.", 1, 1000),
                new Employee("Copran L.", 2, 980),
                new Employee("Copran L.", 2, 980),
        };
        PrintService printService = new PrintService();
        printService.print(workers);

    }
}