package org.example;
import java.io.*;
import java.nio.file.*;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Номер задания (1-5): ");
        int task = scanner.nextInt();
        switch (task) {
            /*1. Создать файл с информацией о своей школе. Вывести данные об этом
        файле. Вывести информацию из файла.*/
            case 1: {
                System.out.println("Задание 1");
                Path path = Paths.get("school_info.txt");
                // 1. Создаем файл и записываем информацию
                try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                    writer.write("СШ № 167\n");
                    writer.write("ул. Якубовского 46\n");
                    writer.write("Количество учеников: ~1500\n");
                } catch (IOException e) {
                    System.out.println("Ошибка записи: " + e.getMessage());
                    break;
                }
                try {
                    System.out.println("Имя файла: " + path.getFileName());
                    System.out.println("Размер файла: " + Files.size(path) + " байт");
                } catch (IOException e) {
                    System.out.println("Не удалось получить данные о файле.");
                }
                System.out.println("\nСодержимое файла : ");
                try (BufferedReader reader = Files.newBufferedReader(path)) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения : " + e.getMessage());
                }
                break;
            }
            /*2. Ввести с клавиатуры в файл ‘f’ 10 целых чисел. Вывести их на экран
        и найти количество отрицательных чисел.*/
            case 2: {
                System.out.println("Задания 2 ");
                File file = new File("f.txt");
                System.out.println("Введите 10 целых чисел:");
                try (PrintWriter writer = new PrintWriter(file)) {
                    for (int i = 0; i < 10; i++) {
                        int num = scanner.nextInt();
                        writer.print(num + " ");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи : " + e.getMessage());
                    break;
                }
                System.out.print("Числа из файла : ");
                int negativeCount = 0;
                try (Scanner fileScanner = new Scanner(file)) {
                    while (fileScanner.hasNextInt()) {
                        int num = fileScanner.nextInt();
                        System.out.print(num + " ");
                        if (num < 0) {
                            negativeCount++;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения : " + e.getMessage());
                }
                System.out.println("\nКоличество отрицательных чисел : " + negativeCount);
                break;
            }
            /*3. Создать текстовый файл ‘f’ со случайными целыми числами. Записать
            в файл ‘g’ все числа, являющиеся квадратами, а в файл ‘h’ – все остальные.*/
            case 3: {
                System.out.println("Задания 3");
                File fileF = new File("f.txt");
                File fileG = new File("g.txt");
                File fileH = new File("h.txt");
                try (PrintWriter writerF = new PrintWriter(fileF)) {
                    for (int i = 0; i < 20; i++) {
                        writerF.print(random.nextInt(101) + " ");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка создания файла f.txt");
                    break;
                }
                try (Scanner scannerF = new Scanner(fileF);
                     PrintWriter writerG = new PrintWriter(fileG);
                     PrintWriter writerH = new PrintWriter(fileH)) {
                    while (scannerF.hasNextInt()) {
                        int num = scannerF.nextInt();
                        double root = Math.sqrt(num);
                        if (root == (int) root) {
                            writerG.print(num + " ");
                        } else {
                            writerH.print(num + " ");
                        }
                    }
                    System.out.println("Числа успешно разделены по файлам g.txt и h.txt!");
                } catch (IOException e) {
                    System.out.println("Ошибка при работе с файлами: " + e.getMessage());
                }
                break;
            }
            /* 4. Ввести с клавиатуры в файл 10 вещественных значений напряжения.
                Считать данные и вывести среднее напряжение.*/
                    case 4: {
                System.out.println("Задания 4 ");
                File file = new File("voltage.txt");
                // 1. Ввод вещественных значений напряжения
                System.out.println("Введите 10 вещественных значений напряжения :");
                try (PrintWriter writer = new PrintWriter(file)) {
                    for (int i = 0; i < 10; i++) {
                        double v = scanner.nextDouble();
                        writer.print(v + " ");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи : " + e.getMessage());
                    break;
                }
                double sum = 0;
                int count = 0;
                try (Scanner fileScanner = new Scanner(file)) {
                    while (fileScanner.hasNextDouble()) {
                        sum += fileScanner.nextDouble();
                        count++;
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения : " + e.getMessage());
                }
                if (count > 0) {
                    System.out.println("Среднее напряжение : " + (sum / count) + " В");
                }
                break;
            }
            /*5. Создать текстовый файл ‘f’ с 10 целыми числами. Вывести количество
        чисел, попадающих в диапазон от 1 до 100.*/
            case 5: {
                System.out.println("Задание 5");
                File file = new File("f.txt");
                try (PrintWriter writer = new PrintWriter(file)) {
                    for (int i = 0; i < 10; i++) {
                        int num = random.nextInt(201) - 50; // числа от -50 до 150
                        writer.print(num + " ");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи : " + e.getMessage());
                    break;
                }
                System.out.print("Числа в файле : ");
                int inRangeCount = 0;
                try (Scanner fileScanner = new Scanner(file)) {
                    while (fileScanner.hasNextInt()) {
                        int num = fileScanner.nextInt();
                        System.out.print(num + " ");
                        if (num >= 1 && num <= 100) {
                            inRangeCount++;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения : " + e.getMessage());
                }
                System.out.println("\nКоличество чисел в диапазоне от 1 до 100: " + inRangeCount);
                break;
            }
            default:
                System.out.println("Неверный номер задания(1-5)");
                break;
        }
    }
}
