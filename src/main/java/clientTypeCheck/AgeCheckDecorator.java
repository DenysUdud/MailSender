package clientTypeCheck;

import client.Client;

public class AgeCheckDecorator extends ClientCheckDecorator {
    private int minAge;
    private int maxAge;

    public AgeCheckDecorator(ClientTypeCheck source, int minAge, int maxAge) {
        super(source);
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public boolean checkClient(Client client) {
        boolean sourceCheck =  super.checkClient(client);
        if (minAge <= client.getAge() && maxAge > client.getAge()) {
            return sourceCheck;
        }
        return false;
    }
}
