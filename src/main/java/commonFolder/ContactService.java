package commonFolder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public List<Contact> findContactsByName(String name) {
        return contactRepository.findByNameContainingIgnoreCaseOrderByName(name);
    }

    public List<Contact> findContactsByPhoneNumber(String phoneNumber) {
        return contactRepository.findByPhoneNumbersContaining(phoneNumber);
    }

    public List<Contact> findContactsByEmail(String email) {
        return contactRepository.findByEmailsContaining(email);
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

    public Contact updateContact(Long id, Contact updatedContact) {
        updatedContact.setId(id);
        return contactRepository.save(updatedContact);
    }
}