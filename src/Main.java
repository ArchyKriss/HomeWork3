public class Main {
    public static void main(String[] args) {
        //task1
        int a = 356;
        byte b = 3;
        short c = 168;
        long d = 178L;
        float e = 12.6f;
        double f = 189.567;

        System.out.println("Значение переменной а с типом int равно "+a+".");
        System.out.println("Значение переменной b с типом byte равно "+b+".");
        System.out.println("Значение переменной c с типом short равно "+c+".");
        System.out.println("Значение переменной d с типом long равно "+d+".");
        System.out.println("Значение переменной e с типом float равно "+e+".");
        System.out.println("Значение переменной f с типом double равно "+f+".");

        //task2
        float oneNum = 27.12f;
        long twoNum = 987678965549L;
        float threeNum = 2.786f;
        short fourNum = 569;
        short fiveNum = -159;
        short sixNum = 27897;
        byte sevenNum = 67;


        //task3
        byte lydmilaPavlovnaClass = 23;
        byte annaSergeevnaClass = 27;
        byte ekaterinaAndreevnaClass = 30;
        short paper = 480;
        System.out.println("На каждого ученика расчитано "+paper/(lydmilaPavlovnaClass+annaSergeevnaClass+ekaterinaAndreevnaClass)+" листов бумаги.");

        //task4
        byte produseBottleInOneMinutes = 16/2;
        int produseBottleInTwentyMinutes = produseBottleInOneMinutes*20;
        int produseBottleInDay = produseBottleInOneMinutes*1440;
        int produseBottleInThreeDays = produseBottleInOneMinutes*4320;
        int produseBottleInMonth = produseBottleInOneMinutes*43200;
        System.out.println("За 20 минут машина произвела "+produseBottleInTwentyMinutes+" штук бутылок.");
        System.out.println("За день машина произвела "+produseBottleInDay+" штук бутылок.");
        System.out.println("За 3 дня машина произвела "+produseBottleInThreeDays+" штук бутылок.");
        System.out.println("За месяц машина произвела "+produseBottleInMonth+" штук бутылок.");

        //task5
        byte paintForSchool = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int classes = paintForSchool/(whiteColor+brownColor);
        int whiteColorGeneral = whiteColor*classes;
        int brownColorGeneral = brownColor*classes;
        System.out.println("В школе, где "+classes+" классов, нужно "+whiteColorGeneral+" банок белой краски и "+brownColorGeneral+" банок коричневой краски.");

        //task6
        short weightBananas = 5*80;
        short weightMilk = 2*105;
        short weightIcecream = 2*100;
        short weightEggs = 4*70;
        float breakfastGramm = weightBananas+weightMilk+weightIcecream+weightEggs;
        float breakfastKg = breakfastGramm/1000;
        System.out.println(breakfastGramm);
        System.out.println(breakfastKg);

        //task7
        byte lessWeight = 7;
        short minLess = 250;
        short maxWeight = 500;
        int daysMinLess = lessWeight*1000/minLess;
        int dayMaxLess = lessWeight*1000/maxWeight;
        System.out.println(daysMinLess);
        System.out.println(dayMaxLess);

        //task8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76320;

        int newMashaSalary = (mashaSalary/100*10)+mashaSalary;
        int newDenisSalary = (denisSalary/100*10)+denisSalary;
        int newKristinaSalary = (kristinaSalary/100*10)+kristinaSalary;

        int mashaIncomeDifference = newMashaSalary*12-mashaSalary*12;
        int denisIncomeDifference = newDenisSalary*12-denisSalary*12;
        int kristinaIncomeDifference = newKristinaSalary*12-kristinaSalary*12;

        System.out.println("Маша теперь получает " + newMashaSalary+" рублей. Годовой доход вырос на "+mashaIncomeDifference+ " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary+" рублей. Годовой доход вырос на "+denisIncomeDifference+ " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary+" рублей. Годовой доход вырос на "+kristinaIncomeDifference+ " рублей");


    }
}