package day36_Inheritance.planetTask;

public class PlanetObjects {

    public static void main(String[] args) {

        Earth earth = new Earth();
        earth.setInfo("Earth", "5,972×10^24 kg", "6371 km", "9,807 m/s²", "510 100 000 km²","1,083,206,916,846 cubic kilometers", "7.9 Billion");
        System.out.println(earth);

        System.out.println();

        Moon moon = new Moon();
        moon.setInfo("Moon", "7.342×1022 kg ", "1738.1 km", "1.622 m/s2", "3.793×107 km2", "2.1958×1010 km3 ", "Zero");
        System.out.println(moon);

        System.out.println();

        Mercury mercury = new Mercury();
        mercury.setInfo("Mercury", "3.3011×1023 kg", "2,439.7±1.0 km", "3.7 m/s2", "7.48×107 km2", "6.083×1010 km3", "Zero");
        System.out.println(mercury);

        System.out.println();

        Venus venus = new Venus();
        venus.setInfo("Venus", "4.8675×1024 kg", "6,051.8±1.0 km", "8.87 m/s2", "4.6023×108 km2", "9.2843×1011 km3", "Zero");
        System.out.println(venus);



    }

}
