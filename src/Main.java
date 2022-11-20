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
            // System.out.println("Задача 2");
            if (age >= 7) ;
            if (age < 18) {
                System.out.println("Ходит в школу");
            }
            if (age >= 18) ;
            if (age < 24) {
                System.out.println(" ходит в университет " + (age < 24));
                if (age >= 24) ;
                System.out.println("ходит на работу");
                // Задача 3
                System.out.println("Залача 3");

                int capacity = 102;
                int seating = 60;
                int other = capacity - seating;
                System.out.println(" Стоячих мест" + (capacity - seating));

                int seatsOccupied = 37;
                int standingUsed = 18;
                if (seatsOccupied < seating) {
                    System.out.println(" Есть ещё мест " + (seating - seatsOccupied) + " других ");
                }
                if (standingUsed < other) {
                    System.out.println("Есть ещё " + (other - standingUsed) + " других");
                    // Задача 1.1
                    System.out.println("Задача 1.1");
                    int yearsOld = 15;
                    if (yearsOld >= 18) {
                        System.out.println("Поздравляем с совершеннолетием !");
                    } else {

                    }
                    if (age < 18) {
                        System.out.println("Возраст совершеннолетия ещё не наступил");

                        // Задача 2,2
                        System.out.println("Задача 2,2");
                        if (age <= 7 && age > 18) {
                            System.out.println("Ходит в школу");
                        } else if (age <= 18 && age > 25) {
                            System.out.println("Человек ходит в университет");
                        } else {
                            if (age >= 25) {
                                System.out.println("Человек ходит на работу");
                                // Задача 3.3
                                System.out.println("Задача 3.3");
                            }
                            if (seatsOccupied < seating) {
                                System.out.println("Есть ещё" + (seating - seatsOccupied));
                            } else {
                                System.out.println("Сидячих мест нет");
                            }
                            if (other < seatsOccupied) {
                                System.out.println("Есть ещё" + (seatsOccupied - other) + "стоячих мест");
                            } else {
                                System.out.println(("сидячих мест нет"));
                            }

                            // "Условный оператор-сравнение" 1
                            System.out.println("Условный оператор-сравнение" + 1);
                            int manOfyears = 20;
                            if (manOfyears >= 2 && manOfyears <= 6) {
                                System.out.println("Если возраст человека  " + manOfyears + "нужно ходить в детский сад");
                            } else if (manOfyears > 6 && manOfyears <= 18) {
                                System.out.println("Если возраст человека  " + manOfyears + " нужно ходить в школу");
                            } else if (manOfyears > 18 && manOfyears < 24) {
                                System.out.println("Если возраст человека  " + manOfyears + " нужно ходить в университет");
                                // "Условный оператор-сравнение 2
                                System.out.println("Условный оператор-сравнение" + 2);
                                int theChildYearsOld = 5;
                                if (theChildYearsOld <= 5) {
                                    System.out.println("Не может кататься");
                                    if (theChildYearsOld <= 14) {
                                        System.out.println(" Может кататься в сопровождении взрослого");
                                    } else if (theChildYearsOld >= 14) ;

                                    // "Условный оператор-сравнение 3
                                }
                                System.out.println("Условный оператор-сравнение" + 3);
                                int one = 5;
                                int two = -7;
                                int three = 50;
                                if (one >= two) {
                                    if (one > three) {
                                        System.out.println("Максимальное число" + one);
                                    } else {
                                        System.out.println("Максимальное число" + three);

                                        if (two > one) {
                                        }
                                        if (two > three) {
                                            System.out.println("Максимальное число" + two);
                                        } else {
                                            System.out.println("Максимальное число" + three);
                                        }
                                    } {
                                        if (one > three) {
                                            System.out.println("Максимальное число" + one);
                                        } else if (three > one) ;
                                        System.out.println("Максимальное число" + three);
                                    }
                                } else {
                                    System.out.println(" Все 3 равны");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}












        



