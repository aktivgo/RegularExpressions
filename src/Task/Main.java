package Task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("1. Проверка корректности IPv4 адреса\n2. Проверка корректности GUID идентификатора\n" +
                    "3. Проверка корректности URL адреса\n4. Проверка надёжности пароля\n5. Выход\n\nВыберите пункт: ");
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
                        System.out.println(IsPattern.Password(new Scanner(System.in).nextLine()) ?
                                "Пароль надёжный\n" : "Пароль ненадёжный\n");
                    }
                    break;
                    case 5: return;
                    default:
                        System.out.println("Ошибка выбора пункта меню: введёный пункт не существует\n");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage() + "\n");
            }
        } while(true);
    }
}