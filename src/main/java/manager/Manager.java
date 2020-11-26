package manager;

import client.Client;
import clientTypeCheck.ClientCheckDecorator;
import mailBoxObserver.MailBox;
import mailInfo.MailInfo;
import mailStrategy.MailStrategy;

import java.util.List;

public class Manager {
    private List<Client> clients;

    public Manager(List<Client> clients) {
        this.clients = clients;
    }

    public MailBox createNewMailBox(ClientCheckDecorator clientType, MailStrategy mailStrategy) {
        MailBox mailBox = new MailBox();
        for (Client client : clients) {
            if (clientType.checkClient(client)) {
                mailBox.addMailInfo(new MailInfo(mailStrategy, client));
            }
        }
        return mailBox;
    }
}
