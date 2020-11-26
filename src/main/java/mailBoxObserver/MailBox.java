package mailBoxObserver;

import mailInfo.MailInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<MailInfo>();
    public MailBox() {
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void deleteInfo(MailInfo mailInfo) {
        // can be realize in future versions, if we make everyday
        // reminders that children can get discount,
        // but now someone is over 18 years and we should delete him
        // from subscribers...
    }

    public void sendAll() throws IOException {
        for (MailInfo info : infos) {
            info.send();
        }
    }
}
