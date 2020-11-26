package manager;
import client.Client;
import lombok.Getter;
import lombok.Setter;

public class ClientTypeCheck implements clientTypeCheck.ClientTypeCheck {
    @Setter
    private int minAge = Integer.MIN_VALUE;
    @Setter
    private int maxAge = Integer.MAX_VALUE;
    @Setter
    private String sex = "";
    @Setter
    private String name = "";

    public boolean checkClient(Client client) {
        System.out.println(client.getAge());
        if (minAge <= client.getAge() && maxAge > client.getAge()) {
            if (sex.length() == 0 && name.length() == 0) {
                return true;
            }
            return checkSex(client) && checkName(client);
        }
        return false;
    }

    public boolean checkSex(Client client) {
        if (sex.length() == 0) {
            return true;
        }
        if (sex.equals(client.getSex())) {
            return true;
        }
        return false;
    }

    public boolean checkName(Client client) {
        if (name.length() == 0) {
            return true;
        }

        if (name.equals(client.getName())) {
            return true;
        }
        return false;
    }
}
