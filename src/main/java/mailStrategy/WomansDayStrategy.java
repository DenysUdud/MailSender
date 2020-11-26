package mailStrategy;

import client.Client;
import mailSender.MailSender;
public class WomansDayStrategy implements MailStrategy {
    public String formMail(Client client) {
        return String.format(
                "Dear %s, happy Women's. " +
                        "You can get discount today in our shop",
                client.getName()
        );
    }
}
