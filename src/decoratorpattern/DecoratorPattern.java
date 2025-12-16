
package decoratorpattern;

public class DecoratorPattern {

    public static void main(String[] args) {
        // Create the basic notifier (email only)
        Notifier notifier = new BasicNotifier();

        // Add SMS notifications
        notifier = new SMSNotifier(notifier);

        // Add Facebook notifications
        notifier = new FacebookNotifier(notifier);

        // Add Slack notifications
        notifier = new SlackNotifier(notifier);

        // Send a notification through all channels
        notifier.send("Your house is on fire!");
    }
}


