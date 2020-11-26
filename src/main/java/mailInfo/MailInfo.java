package mailInfo;

import client.Client;
import mailSender.MailSender;
import mailStrategy.MailStrategy;

import java.io.IOException;

public class MailInfo {
    private MailStrategy mailStrategy;
    private Client client;

    public MailInfo(MailStrategy mailStrategy, Client client) {
        this.mailStrategy = mailStrategy;
        this.client = client;
    }


    public void send() throws IOException {
        MailSender.send(mailStrategy.formMail(client), client.getEmail());

    }
}
