package commonFolder;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public Contact getContactById(int id) {
        if (id >= 0 && id < contacts.size()) {
            return contacts.get(id);
        }
        return null;
    }

    public void updateContact(int id, Contact updatedContact) {
        if (id >= 0 && id < contacts.size()) {
            contacts.set(id, updatedContact);
        }
    }

    public void deleteContact(int id) {
        if (id >= 0 && id < contacts.size()) {
            contacts.remove(id);
        }
    }
}