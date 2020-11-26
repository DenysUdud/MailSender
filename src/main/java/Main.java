import client.Client;
import clientTypeCheck.*;
import mailBoxObserver.MailBox;
import mailStrategy.AnniversaryStrategy;
import mailStrategy.MailStrategy;
import mailStrategy.MansDayStrategy;
import manager.ClientTypeCheck;
import manager.Manager;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // can write getter of users from file and making Clients for data from file
        ArrayList<Client> clientsList = new ArrayList<Client>();
        Client client1 = new Client(1, "denis.udud@gmail.com", "Denys", 19, "male");
        clientsList.add(client1);
        Client client2 = new Client(2, "denys.udud@gmail.com", "Ulyana", 20, "female");
        clientsList.add(client2);
        Client client3 = new Client(3, "denichka.udud@gmail.com", "Max", 15, "male");
        clientsList.add(client3);
        Client client4 = new Client(4, "vova.peganov@gmail.com", "Vova", 19, "male");
        clientsList.add(client4);

        // create manager with adding all our clients
        Manager manager = new Manager(clientsList);

        // set decorator - ті властивості, якими повинен володіти клієнт, щоб йому прийшла розсилка. Типу таргета в інстаграмі.
        // set decorator - the properties that need your clients to get email of chosen format. Like target in Instagram.
        ClientCheckDecorator clientTypeCheck = new AgeCheckDecorator(new BaseClientCheck(), 18, 26);
        clientTypeCheck = new SexCheckDecorator(clientTypeCheck, "male");

        MailStrategy mailStrategy = new MansDayStrategy();

        MailBox mailBox = manager.createNewMailBox(clientTypeCheck, mailStrategy);
        mailBox.sendAll();
    }
}

