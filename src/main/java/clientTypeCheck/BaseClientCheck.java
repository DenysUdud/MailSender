package clientTypeCheck;

import client.Client;

public class BaseClientCheck implements ClientTypeCheck {
    public boolean checkClient(Client client) {
        return true;
    }
}
