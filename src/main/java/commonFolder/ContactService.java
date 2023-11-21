package commonFolder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactService {

    @Autowired
    private ContactDao contactDao;

    public int addContact(Contact contact) {
        return contactDao.insert(contact);
    }

    public int updateContact(Contact contact) {
        return contactDao.update(contact);
    }

    public int removeContact(Contact contact) {
        return contactDao.delete(contact);
    }
}
