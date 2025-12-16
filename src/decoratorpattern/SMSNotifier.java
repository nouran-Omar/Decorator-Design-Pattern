
package decoratorpattern;

public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Delegates to the wrapped notifier
        System.out.println("Sending SMS notification: " + message);
    }
}



