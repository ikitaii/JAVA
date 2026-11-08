import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int task=0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Выберите номер задания (1-3): ");
            if (scan.hasNextInt()) {
                task = scan.nextInt();
                if (task >= 1 && task <= 3) {
                    break;
                }
            }
            else {
                scan.next();
            }
        }
        switch (task) {
            case 1 :
                double km;
                System.out.println("Введите расстояние (в км)");
                while(!scan.hasNextDouble()){
                    System.out.println("Введите расстояние");
                    scan.next();
                }
                km = scan.nextDouble();
                System.out.println("Расстояние в метрах : "+km*1000);
                break;
//            Проверить, делится ли число A на число B без остатка.
            case 2:
                double number1;
                System.out.println("Введите число А");
                while(!scan.hasNextDouble()){
                    System.out.println("Введите число А");
                    scan.next();
                }
                number1 = scan.nextDouble();
                double number2;
                System.out.println("Введите число В");
                while(!scan.hasNextDouble()){
                    System.out.println("Введите число В");
                    scan.next();
                }
                number2 = scan.nextDouble();
                if(number1%number2==0){
                    System.out.println("Число А делится на число В без остатка");
                }
                else if(number1%number2!=0){
                    System.out.println("Число А делится на число В с остатком (остаток : "+number1%number2+")");
                }
                break;
//            Вывести все числа, кратные 3, в диапазоне от 1 до 100
            case 3:
                System.out.println("Числа, кратные 3 от 1 до 100 : ");
                /*for (int i=1;i<101; i++){
                    if(i%3==0){
                        System.out.println(i);
                    }
                }*/
                int i=1;
                while(i<101){
                    if(i%3==0){
                        System.out.println(i);
                    }
                    i++;
                }
                break;
        }
        scan.close();
    }
}