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

    // Задание 3
    public static int distanceTime(int km){

        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        isLeapYear(year);
        int deviceOS = 0;
        int clientDeviceYear = 2024;
        deviceAppVersion(deviceOS, clientDeviceYear);
        int deliveryDistance = 95;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + " срок доставки.");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}