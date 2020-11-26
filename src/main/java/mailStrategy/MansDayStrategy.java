package mailStrategy;

import client.Client;
import mailSender.MailSender;

public class MansDayStrategy implements MailStrategy {
    public String formMail(Client client) {
        return String.format(
                "Dear %s, happy Men's Day. " +
                        "We are happy to have such a great guy in family!",
                client.getName()
        );
    }
}
