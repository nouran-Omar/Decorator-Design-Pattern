
package decoratorpattern;

public class FacebookNotifier extends NotifierDecorator {
    public FacebookNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Delegates to the wrapped notifier
        System.out.println("Sending Facebook notification: " + message);
    }
}



