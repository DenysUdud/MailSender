package clientTypeCheck;

import client.Client;

public class SexCheckDecorator extends ClientCheckDecorator {
    protected String sex;

    public SexCheckDecorator(ClientTypeCheck source, String sex) {
        super(source);
        this.sex = sex;
    }

    @Override
    public boolean checkClient(Client client) {
        boolean sourceCheck =  super.checkClient(client);
        if (client.getSex().equals(sex)) {
            return sourceCheck;
        }
        return false;
    }
}
