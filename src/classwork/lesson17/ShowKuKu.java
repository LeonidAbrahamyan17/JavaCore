package classwork.lesson17;

public interface ShowKuKu {

    default void printKuKu(){
        System.out.println("K U K U");
    }
    static int getDefaultCount(){
        return 1;
    }

}
