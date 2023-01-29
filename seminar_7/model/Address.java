package seminar_7.model;

import java.util.LinkedList;
import java.util.List;

public class Address implements Contact<String> {
    private String contactLabel;
    private List<String> contactList = new LinkedList<>();
    private String contactData;

    public Address(String contactLabel, String contactData) {
        this.contactLabel = contactLabel;
        this.contactData = contactData;
        contactList.add(contactData);
    }

    @Override
    public String getContactLabel() {
        return contactLabel;
    }

    @Override
    public List<String> getContactList() {
        return contactList;
    }

    @Override
    public String getContactData() {
        return contactData;
    }

    @Override
    public String toString() {
        return contactLabel + ": " + contactList.iterator().next();
    }

}
