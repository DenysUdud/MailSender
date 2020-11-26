package clientTypeCheck;

import client.Client;

public class NameCheckDecorator extends ClientCheckDecorator {
    protected String name;

    public NameCheckDecorator(ClientTypeCheck source, String name) {
        super(source);
        this.name = name;
    }

    @Override
    public boolean checkClient(Client client) {
        boolean sourceCheck =  super.checkClient(client);
        if (client.getName().equals(name)) {
            return sourceCheck;
        }
        return false;
    }
}
