
package decoratorpattern;

public class SlackNotifier extends NotifierDecorator {
    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Delegates to the wrapped notifier
        System.out.println("Sending Slack notification: " + message);
    }
}


