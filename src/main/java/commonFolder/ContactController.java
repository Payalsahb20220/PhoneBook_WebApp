package commonFolder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public String index(Model model) {
        
        return "index";
    }

    @PostMapping("/addContact")
    public String addContact(Contact contact) {
        contactService.addContact(contact);
        return "redirect:/";
    }

    @PostMapping("/updateContact")
    public String updateContact(Contact contact) {
        contactService.updateContact(contact);
        return "redirect:/";
    }

    @PostMapping("/removeContact")
    public String removeContact(Contact contact) {
        contactService.removeContact(contact);
        return "redirect:/";
    }
}
