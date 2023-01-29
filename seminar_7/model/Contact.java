package seminar_7.model;

import java.util.List;

public interface Contact<String> {

    public String getContactLabel();

    public List<String> getContactList();

    public String getContactData();

}
