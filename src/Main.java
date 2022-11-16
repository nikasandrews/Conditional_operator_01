public class Main {
    public static void main(String[] args) {
        // Задание1
        System.out.println("Задание1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием !");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил");
            // Задача 2
            System.out.println("Задача 2");

            if (age >= 7) {
                System.out.println("Ребёнок может ходить в школу если ему семь лет ");
                if (age < 7) {
                    System.out.println("Не может ходить в школу если ему меньше семи лет");
                    if (age >= 18) {
                        System.out.println("Может ходить в университет");


                    }
                }
            }
        }
    }
}

