package day36_Inheritance.planetTask;

public class Planet {

    public String name, mass, radius, surfaceGravity, surfaceArea, volume, population;



    public void setInfo(String name, String mass, String radius, String surfaceGravity, String surfaceArea, String volume, String population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", radius=" + radius +
                ", surfaceGravity='" + surfaceGravity + '\'' +
                ", surfaceArea='" + surfaceArea + '\'' +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }

}
