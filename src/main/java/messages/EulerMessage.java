package messages;

/**
 * Created by Ioana on 29/08/2016.
 */
public class EulerMessage extends Throwable {

    private String message;

    public EulerMessage(String message){
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message);
    }
}
