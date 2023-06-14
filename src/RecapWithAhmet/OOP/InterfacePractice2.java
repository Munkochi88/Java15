package RecapWithAhmet.OOP;

public interface InterfacePractice2 {

    default void run(){
        System.out.println("Hello I am from interface");
    }

    public abstract void dismiss();
    void speakWithAhmet();
}
