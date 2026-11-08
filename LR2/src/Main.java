import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Найти индекс максимального элемента.
        Scanner scan = new Scanner(System.in);
        int task;
        while (true) {
            System.out.println("Введите номер задания (1-2): ");
            if (scan.hasNextInt()) {
                task = scan.nextInt();
                if (task != 1 || task != 2) {
                    break;
                }
            } else {
                scan.next();
            }
        }
        switch (task) {
            case 1:
                int size;
                System.out.println("Введите размер массива");
                while (!scan.hasNextInt()) {
                    System.out.println("Введите размер массива");
                    scan.next();
                }
                size = scan.nextInt();
                double[] arr = new double[size];
                System.out.println("Заполните массив : ");
                for (int i = 0; i < size; i++) {
                    System.out.print("arr [" + i + "] = ");
                    while (!scan.hasNextDouble()) {
                        System.out.println("Неверное значение ! " + "arr [" + i + "] = ");
                        scan.next();
                    }
                    arr[i] = scan.nextDouble();
                }
                int indMax = 0;
                for (int i = 1; i < size; i++) {
                    if (arr[i] > arr[i - 1]) {
                        indMax = i;
                    }
                }
                System.out.println("Индекс максимального элемента : " + indMax);
                break;
            /* 8. Умножить матрицу 5x5 на число (все элементы умножить на X).*/
            case 2:
                int size1 = 5;
                int size2 = 5;
                double x;
                System.out.println("Введите x : ");
                while (!scan.hasNextDouble()) {
                    System.out.println("Введите x : ");
                    scan.next();
                }
                x = scan.nextDouble();
                double[][] arr2 = new double[size1][size2];
                System.out.println("Массив : ");
                double rand = Math.random();
                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < size2; j++) {
                        arr2[i][j] = (Math.random() * 20) + 1;
                        System.out.printf("%-5.0f", arr2[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("Массив умноженный на х(" + x + ")");
                for (int i = 0; i < size1; i++) {
                    for (int j = 0; j < size2; j++) {
                        System.out.printf("%-5.0f", arr2[i][j] * x);
                    }
                    System.out.println();
                }
                break;
        }
    }
}