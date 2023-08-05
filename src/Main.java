public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2
        System.out.println("Задача 2");
        var dog1 = dog + 4;
        var cat1 = cat + 43.6;
        var paper1 = paper + 4;

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        //task3
        System.out.println("Задача 3");
        var dog2 = dog - 3.5;
        var cat2 = cat - 1.6;
        var paper2 = paper - 7639;

        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        // task 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task 6
        System.out.println("Задача 6");
        var weiqht1 = 78.2;
        var weiqht2 = 82.7;
        var sum = weiqht1 + weiqht2;
        var diff = weiqht1 - weiqht2;
        System.out.println("sum of weiqht: " + sum);
        System.out.println("diff of weiqht: " + diff);

        // task 7
        System.out.println("Задача 7");
        var diff1 = weiqht2 - weiqht1;
        var diff2 = weiqht2 % weiqht1;
        System.out.println("diff1: " + diff1);
        System.out.println("diff2: " + diff2);

        // task 8
        System.out.println("Задача 8");
        var hours = 640;
        var hoursPerEmploee = 8;
        var numberofEmploees = hours / hoursPerEmploee;
        System.out.println("Всего работников в компании - " + numberofEmploees + " человек");
        numberofEmploees = numberofEmploees + 94;
        hours = numberofEmploees * hoursPerEmploee;
        System.out.println("Если в компании работает " + numberofEmploees + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");

    }
}

