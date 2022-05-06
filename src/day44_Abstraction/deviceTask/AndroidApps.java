package day44_Abstraction.deviceTask;

public interface AndroidApps extends Downloadable{

    default void appStoreName(){
        System.out.println("Google Play Store");
    }

    default void OS(){
        System.out.println("Android");
    }

}
