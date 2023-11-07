package commonFolder;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByNameContainingIgnoreCaseOrderByName(String name);
    List<Contact> findByPhoneNumbersContaining(String phoneNumber);
    List<Contact> findByEmailsContaining(String email);
}