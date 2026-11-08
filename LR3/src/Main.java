import java.util.Scanner;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Employee {
    String fullname;
    double salary;
    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}
class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о зп:");
        for (Employee emp : employees) {
            System.out.printf(Locale.US, "%-15s %10.2f%n", emp.fullname, emp.salary);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int task;
        while (true) {
            System.out.print("Введите номер задания (1-4, 0 - выход) : ");
            if (scan.hasNextInt()) {
                task = scan.nextInt();
                scan.nextLine();
                if (task < 1 || task > 4) {
                    System.out.println("Выход из программы.");
                    break;
                }
            } else {
                scan.next();
                System.out.println("Неверный ввод. Попробуйте еще раз.");
                continue;
            }
            switch (task) {
                case 1:
                    System.out.println("Введите строку 1:");
                    String str1 = scan.nextLine();
                    System.out.println("Введите строку 2:");
                    String str2 = scan.nextLine();
                    if (str1.equals(str2)) {
                        System.out.println("Строки совпадают");
                    } else {
                        System.out.println("Строки не совпадают");
                    }
                    break;
                case 2:
                    System.out.println("Введите строку:");
                    String str21 = scan.nextLine();
                    str21 = str21.toLowerCase();
                    int gl_count = 0;
                    int sogl_count = 0;
                    for (int i = 0; i < str21.length(); i++) {
                        char ch = str21.charAt(i);
                        boolean isLetter = (ch >= 'a' && ch <= 'z') || (ch >= 'а' && ch <= 'я') || ch == 'ё';
                        if (isLetter) {
                            if (ch == 'а' || ch == 'у' || ch == 'е' || ch == 'ы' || ch == 'о' || ch == 'э' || ch == 'я' || ch == 'и' || ch == 'ю' || ch == 'ё' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'a') {
                                gl_count++;
                            } else {
                                sogl_count++;
                            }
                        }
                    }
                    System.out.println("Гласных: " + gl_count);
                    System.out.println("Согласных: " + sogl_count);
                    break;
                case 3:
                    Employee[] employees = {
                            new Employee("Иванов И.И.", 125000.50),
                            new Employee("Петров П.П.", 85400.99),
                            new Employee("Сидорова А.А.", 210000.00),
                            new Employee("Петров В.", 55000.00)
                    };
                    Report.generateReport(employees);
                    break;
                case 4:
                    String text = "aAXa aeffa aGha aza ax23a a3sSa";
                    Pattern pattern = Pattern.compile("\\ba[a-z]+a\\b");
                    Matcher matcher = pattern.matcher(text);
                    System.out.println("Найденные строки:");
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                    }
                    break;
            }
            System.out.println();
        }
        scan.close();
    }
}
