public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4 ;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5 ;
        System.out.println(dog);
        cat = cat -1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2 ;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println(weightTotal);
        var weightDifference = Math.abs(weightBoxer1 - weightBoxer2);
        System.out.println(weightDifference);
        weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println(weightDifference);
        weightDifference = weightBoxer2 % weightBoxer1;
        System.out.println(weightDifference);
        var totalWorkingHours = 640;
        var workinHoursPerEmploee = 8;
        var numberOfCompanyEmployees = totalWorkingHours / workinHoursPerEmploee;
        System.out.println("Всего работников в компании - " + numberOfCompanyEmployees + " человек");

        var moreNumberOfCompanyEmployees = numberOfCompanyEmployees + 94;
        var moreTotalWorkingHours = moreNumberOfCompanyEmployees * workinHoursPerEmploee;
        System.out.println("Если в компании работает " + moreNumberOfCompanyEmployees +
                ", то всего " + moreTotalWorkingHours + " часов работы может быть поделено между сотрудниками");


    }
}