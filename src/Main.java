public class Main {
    public static void main(String[] args) {
        //task4.1//
        int age = 1;
        if (age >= 18) {System.out.println("Поздравляем с совершеннолетием!");}
        if (age < 18) {System.out.println("Возраст совершеннолетия ещё не наступил, вам нужно подождать");}

        //task4.2//
        int ageOfKid = 7;
        int ageOfStudent = 18;
        int ageOfYouth = 24;
        if (ageOfKid >= 7) {System.out.println("ребенок ходит в школу");}
        if (ageOfStudent >= 18) {System.out.println("уже закончил школу и может отправляться в университет");}
        if (ageOfYouth >= 24) {System.out.println("окончил университет и пора искать первую работу");}

        //task4.3//
        int place = 88;
        if (place <= 59) {System.out.println("В вагоне есть сидячие и стоячие места");}
        if (place >= 60 && place <= 102) {System.out.println("В вагоне есть только стоячие места");}
        if (place >= 102) {System.out.println("В вагоне нет свободных мест");}

        //task4.4//
        int Age = 1;
        if (Age >= 18) {System.out.println("Поздравляем с совершеннолетием!");}
        else {System.out.println("Возраст совершеннолетия ещё не наступил, вам нужно подождать");}

        //task4.5//
        int anyAge = 1;
        if (anyAge < 7) {System.out.println("Дошколёнок");}
        if (anyAge >= 7 && anyAge <18) {System.out.println("ребенок ходит в школу");}
        if (anyAge >= 18 && anyAge < 24) {System.out.println("уже закончил школу и может отправляться в университет");}
        else {System.out.println("окончил университет и пора искать первую работу");}

         //task4.6//
        int placeAtTrain = 1;
        if (placeAtTrain <= 59) {System.out.println("В вагоне есть сидячие и стоячие места");}
        if (placeAtTrain >= 60 && placeAtTrain <= 102) {System.out.println("В вагоне есть только стоячие места");}
        else {System.out.println("В вагоне нет свободных мест");}


    }

}