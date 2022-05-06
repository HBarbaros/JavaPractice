package day44_Abstraction.deviceTask;

public interface AppleApps extends Downloadable{

    default void appStoreName(){
        System.out.println("App Store");
    }

    default void OS(){
        System.out.println("iOS");
    }

}
