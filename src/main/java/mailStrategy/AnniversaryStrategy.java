package mailStrategy;

import client.Client;
import mailSender.MailSender;

public class AnniversaryStrategy implements MailStrategy{

    public String formMail(Client client) {
        return String.format(
                "Dear %s, happy %d anniversary. " +
                "You can get discount today in our shop",
                client.getName(),
                client.getAge()
        );
    }
}
