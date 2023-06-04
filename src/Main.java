import java.util.Random;

public class Main {
    /*
    Создать возвращаемый метод который будет принимать 2 входящих параметра - возраст человека и температуру на улице, и возвращать результат в виде строки.
Алгоритм метода должен работать следующим образом:
если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;
если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;
а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.
ДЗ на сообразительность:
Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с помощью метода “generateRandomAge”
test(23, 10); test(generateRandomAge(), 10);
     */


    public static void main(String[] args) {
        System.out.println("Можно ли идти гулять");

        System.out.println(ageAndTemperature(25, 15));
        System.out.println(ageAndTemperature(55, 30));
        System.out.println(ageAndTemperature(33, 30));
        System.out.println(ageAndTemperature(28, 28));
        System.out.println(ageAndTemperature(50, 10));
        test(generateRandomAge(),12);
        test(generateRandomAge(),69);
        test(26,27);
        test(37,58);




    }

    public static String ageAndTemperature(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }



    public static void test(int age, int temperature) {
        System.out.println("Возраст: " + age + ", Температура: " + temperature);
        System.out.println(ageAndTemperature(age, temperature));
        System.out.println();
    }


    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }

}
