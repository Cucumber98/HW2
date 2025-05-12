//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(" dog = "+dog+" cat = "+ cat+" papper = "+papper);
        // 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;
        System.out.println(" dog = "+dog+" cat = "+ cat+" papper = "+papper);
        // 3
        System.out.println("Задача 3");
        dog = dog - 3.5 ;
        cat = cat - 1.6;
        papper = papper - 7639;
        System.out.println(" dog = "+dog+" cat = "+ cat+" papper = "+papper);
        // 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("1) "+friend);
        friend = friend + 2;
        System.out.println("2) "+friend);
        friend = friend / 7;
        System.out.println("3) "+friend);
        // 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("1) "+frog);
        frog = frog * 10;
        System.out.println("2) "+frog);
        frog = frog / 3.5;
        System.out.println("3) "+frog);
        frog = frog + 4;
        System.out.println("4) "+frog);
        // 6
        System.out.println("Задача 6");
        var warrior1 = 78.2;
        var warrior2 = 82.7;
        var Ves = warrior1 + warrior2;
        var modul = warrior1 - warrior2;
        System.out.println("Общий вес бойцов = "+Ves);
        System.out.println("Разница в весе бойцов = "+Math.abs(modul));
        // 7
        System.out.println("Задача 7");

        System.out.println("Остаток от деления между весами бойцов = "+warrior2 % warrior1);

        // 8
        System.out.println("Задача 8");
        var time = 640;
        var worker = time / 8;
        System.out.println("Всего в компании "+ worker+" сотрудников");
        worker = 94;
        time = worker * 8;
        System.out.println("Если в компании работает "+worker+" человек то всего "+time+" часов может быть поделено между работниками");

    }
}