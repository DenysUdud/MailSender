package clientTypeCheck;

import client.Client;

public abstract class ClientCheckDecorator implements ClientTypeCheck {
    protected ClientTypeCheck wrappe;

    public ClientCheckDecorator(ClientTypeCheck source) {
        this.wrappe = source;
    }

    public boolean checkClient(Client client) {
        return wrappe.checkClient(client);
    }
}
