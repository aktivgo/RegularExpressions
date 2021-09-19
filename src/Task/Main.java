package Task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("1. Проверка корректности IP адреса\n2. Проверка корректности GUID идентификатора\n" +
                    "3. Проверка корректности URL адреса\n4. Проверка надёжности пароля\n5. Выход\n\nВыберите пункт: ");
            try {
                int menu = scan.nextInt();
                switch (menu) {
                    case 1: {
                        System.out.print("\nВведите IP-адрес: ");
                        System.out.println(isPattern.IP(new Scanner(System.in).nextLine()) ? "IP-адрес корректный\n" : "IP-адрес некорректный\n");
                    }
                    break;
                    case 2: {
                        System.out.print("\nВведите GUID идентификатор: ");
                        System.out.println(isPattern.IP(new Scanner(System.in).nextLine()) ? "IP-адрес корректный\n" : "IP-адрес некорректный\n");
                    }
                    break;
                    case 3: {
                        System.out.print("\nВведите URL адрес: ");
                        System.out.println(isPattern.IP(new Scanner(System.in).nextLine()) ? "IP-адрес корректный\n" : "IP-адрес некорректный\n");
                    }
                    break;
                    case 4: {
                        System.out.print("\nВведите пароль: ");
                        System.out.println(isPattern.IP(new Scanner(System.in).nextLine()) ? "IP-адрес корректный\n" : "IP-адрес некорректный\n");
                    }
                    break;
                    case 5: return;
                    default:
                        System.out.println("Ошибка выбора пункта меню: введёный пункт не существует\n");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } while(true);
    }
}