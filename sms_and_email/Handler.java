package sms_and_email;

public class Handler {
	public static void main(String[] args) throws Exception {

		String pdfFilePath = "<path>";
		String xmlFilePath = "<path>";
		// Sending Email
		Sender sendemail = Container.getSendEmail();
		sendemail.doSend(pdfFilePath);

		// Sending Message
		Sender sendmessage = Container.getSendMessage();
		sendmessage.doSend(xmlFilePath);
	}
}
