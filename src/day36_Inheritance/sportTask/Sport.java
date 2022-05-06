package day36_Inheritance.sportTask;

public class Sport {

    public String teamName, name;
    public int numberOfPlayers, numberOfReferee;

    public void setInfo(String teamName, String name, int numberOfPlayers, int numberOfReferee) {
        this.teamName = teamName;
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
    }

    public String toString() {
        return "Sport{" +
                "Team name='" + teamName + '\'' +
                ", Name='" + name + '\'' +
                ", Number Of Players=" + numberOfPlayers +
                ", Number Of Referee=" + numberOfReferee +
                '}';
    }

    public void play(){
        System.out.println(name + " playing");
    }

}
