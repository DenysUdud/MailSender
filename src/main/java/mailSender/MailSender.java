package mailSender;
// using SendGrid's Java Library
// https://github.com/sendgrid/sendgrid-java
import com.sendgrid.*;
import java.io.IOException;

public class MailSender {
    public static void send(String message, String email) throws IOException {
        Email from = new Email("udud@ucu.edu.ua");
        String subject = "Test of Udud Denys's sender";
        Email to = new Email(email);
        Content content = new Content("text/plain", message);
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid("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");
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }
}
