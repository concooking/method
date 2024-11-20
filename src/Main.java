import java.time.LocalDate;

public class Main {
    // Задание 1
    public static void isLeapYear(int year) {
        System.out.println(String.format("%s год - %sвисокосный год", year, ((year > 1584) && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "" : "Не "));
    }

    // Задание 2
    public static void deviceAppVersion(int OS, int yearOfProduction) {
        int clientDeviceYear = LocalDate.now().getYear();
        System.out.println(String.format("Установите %s версию приложения для %s по ссылке", (yearOfProduction < clientDeviceYear ? "облегченную " : "обычную"), (OS == 0 ? "OS" : "Android")));
    }

    // Задание 3 метод расчета дней доставки
    public static void deliveryCalculation(int distance) {
        if (distance <= 20) {
            System.out.printf("Потребуется дней: 1\n");
        } else if (distance > 20 && distance < 60) {
            System.out.printf("Потребуется дней: 2\n");
        } else if (distance >= 60 && distance < 100) {
            System.out.printf("Потребуется дней: 3\n");
        } else {
            System.out.printf("Доставки нет\n");
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        isLeapYear(year);
        int deviceOS = 0;
        int clientDeviceYear = 2024;
        deviceAppVersion(deviceOS, clientDeviceYear);
        int distance = 95;
        deliveryCalculation(distance);
    }
}
