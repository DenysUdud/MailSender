package mailStrategy;

import client.Client;

public class ChildrenDayStrategy implements MailStrategy{
    public String formMail(Client client) {
        return String.format(
                "Dear %s, happy children's day. " +
                        "You can get your toy today in our shop",
                client.getName()
        );
    }
}
