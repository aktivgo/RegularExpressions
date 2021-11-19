package task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("""
                    1. Проверка корректности IPv4 адреса
                    2. Проверка корректности GUID идентификатора
                    3. Проверка корректности URL адреса
                    4. Проверка надёжности пароля
                    5. Выход

                    Выберите пункт:\s""");
            try {
                int menu = Integer.parseInt(scan.nextLine());
                switch (menu) {
                    case 1: {
                        System.out.print("\nВведите IPv4-адрес: ");
                        System.out.println(IsPattern.IPv4(new Scanner(System.in).nextLine()) ?
                                "IPv4 адрес корректный\n" : "IPv4 адрес некорректный\n");
                    }
                    break;
                    case 2: {
                        System.out.print("\nВведите GUID идентификатор: ");
                        System.out.println(IsPattern.GUID(new Scanner(System.in).nextLine()) ?
                                "GUID идентификатор корректный\n" : "GUID идентификатор некорректный\n");
                    }
                    break;
                    case 3: {
                        System.out.print("\nВведите URL адрес: ");
                        System.out.println(IsPattern.URL(new Scanner(System.in).nextLine()) ?
                                "URL адрес корректный\n" : "URL адрес некорректный\n");
                    }
                    break;
                    case 4: {
                        System.out.print("\nВведите пароль: ");
                        System.out.println(IsPattern.StrongPassword(new Scanner(System.in).nextLine()) ?
                                "Пароль надёжный\n" : "Пароль ненадёжный\n");
                    }
                    break;
                    case 5:
                        return;
                    default:
                        System.out.println("Ошибка выбора пункта меню: введёный пункт не существует\n");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage() + "\n");
            }
        } while (true);
    }
}