public class Main {
    public static void main(String[] args) {
        //task4.1//
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }

        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, вам нужно подождать");
        }

        //task4.2//
        int ageOfKid = 7;
        int ageOfStudent = 18;
        int ageOfYouth = 24;
        if (ageOfKid >= 7) {System.out.println("ребенок ходит в школу");}
        if (ageOfStudent >= 18) {System.out.println("уже закончил школу и может отправляться в университет");}
        if (ageOfYouth >= 24) {System.out.println("окончил университет и пора искать первую работу");}

    }
}