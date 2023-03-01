public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age > 17) {
            System.out.println("Если возвраст человека равен " + age + "  , то он совершеннолетний");
        }
        if (age < 17) {
            System.out.println("Если возвраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        int age1 = 17;
        if (age1 > 18) {
            System.out.println("Если возвраст человека равен " + age1 + "  , то он совершеннолетний");
        }
        if (age1 < 18) {
            System.out.println("Если возвраст человека равен " + age1 + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int degree1 = 6;
        if (degree1 < 5) {
            System.out.println("На улице " + degree1 + " градусов ,нужно надеть шапку");
        }
        if (degree1 > 5) {
            System.out.println("На улице " + degree1 + " градусов ,можно идти без шапки");
        }
        int degree2 = 3;
        if (degree2 < 5) {
            System.out.println("На улице " + degree2 + " градусов ,нужно надеть шапку");
        }
        if (degree2 > 5) {
            System.out.println("На улице " + degree2 + " градусов ,можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то,придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то,можно ехать спокойно");
        }
        int speed2 = 40;
        if (speed2 > 60) {
            System.out.println("Если скорость " + speed2 + " то,придется заплатить штраф");
        }
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + " то,можно ехать спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int person1 = 24;
        if (person1 >= 2 && person1 <= 6) {
            System.out.println("Если возвраст человека равен " + person1 + " лет,то ему нужно ходить в детский сад");
        } else if (person1 > 7 && person1 <= 18)
            System.out.println("Если возвраст человека равен " + person1 + " лет,то ему нужно ходить в в школу");
        else if (person1 > 18 && person1 <= 24)
            System.out.println("Если возвраст человека равен " + person1 + " лет,то ему нужно ходить в университет");
        else if (person1 > 24)
            System.out.println("Если возвраст человека равен " + person1 + " лет,то ему нужно ходить на работу");


    }

    public static void task5() {
        System.out.println("Задача 5");
        {
            int kid1 = 7;
            if (kid1 < 5) {
                System.out.println("Если возвраст ребенка равен " + kid1 + " то ,ему нельзя кататься на аттракционе");
            } else if (kid1 > 5 && kid1 < 14) {
                System.out.println("Если возвраст ребенка равен " + kid1 + " ,то ему можно кататься в сопровождении взрослого.Если взрослого нет,то кататься нельзя");
            } else if (kid1 > 14) {
                System.out.println("Если возвраст ребенка равен " + kid1 + " ,то ему можно кататься без сопровождения взрослого");
            }

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int places = 102;
        int seats = 60;
        int standingPlaces = places - seats;//стоячих мест

        int seatsUsed = 60;
        int standingPlacesUsed = 42;
        if (seatsUsed < seats) {
            System.out.println("Есть еще " + (seats - seatsUsed) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет! ");
        }
        if (standingPlacesUsed < standingPlaces) {
            System.out.println("Есть еще " + (standingPlaces - standingPlacesUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет!");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
    int one = -5;
    int two = 13;
    int there = 59;
    if (one > two) {
        if (one > there) {
            System.out.println("Максимальное число " + one);
        } else if (there > one) {
            System.out.println("Максимальное число " + there);
        } else {
            System.out.println("Числа " + one + " и " + there + " равны");
        }
    } else if (two > one) {
        if (two > there) {
            System.out.println("Максимальное число " + two);
        } else if (there > one) {
            System.out.println("Максимальное число " + there);
        } else {
            System.out.println("Числа " + two + " и " + there + " равны");
        }
    }else {
        if (one > there) {
            System.out.println("Максимсальное число " + one);
        } else if (there >one) {
            System.out.println("Максимальное число " + there);
        }else {
            System.out.println("Все числа равны");

        }
    }
    }
    }


