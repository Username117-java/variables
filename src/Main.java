public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println();

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println();

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println();

        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);

        System.out.println();

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println();

        var m1 = 78.2;
        var m2 = 82.7;
        var total = m1 + m2;
        var diff = Math.abs(m1 - m2);
        System.out.println("Общая масса двух бойцов: " + total + " кг.");
        System.out.println("Разница между массами бойцов: " + diff + " кг.");

        System.out.println();

        var m3 = 78.2;
        var m4 = 82.7;
        var div = m4 % m3;
        System.out.println(div);

        System.out.println();

        var totalHours = 640;
        var workingDayLength = 8;
        var totalEmployees = totalHours / workingDayLength;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + (totalEmployees * 8) + " часов работы может быть поделено между сотрудниками");
    }
}