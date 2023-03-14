public class Main {
    public static void main(String[] args) {
        contact contact1 = new eMail("tre","treap@gmail.com");
        contact1.contact();
        contact contact2 = new phoneNumber("tre","123-456-7890");
        contact2.contact();
    }
}

abstract class contact{
    private String contactName;

    public contact(String contactName) {
        this.contactName = contactName;
    }
    public abstract void contact();

}
class eMail extends contact{
    private String eMail;

    public eMail(String contactName, String eMail) {
        super(contactName);
        this.eMail = eMail;
    }

    @Override
    public void contact() {
        System.out.println("emailing: "+ eMail);
    }
}
class phoneNumber extends contact{
    private String phoneNumber;

    public phoneNumber(String contactName, String phoneNumber) {
        super(contactName);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("calling: " +phoneNumber);
    }
}
