package commonFolder;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ElementCollection
	private List<String>phoneNumbers;
	
	@ElementCollection
	private List<String>emails;
	
	private LocalDate dateOfBirth;
	
	
	
	public Contact(String name, List<String> phoneNumbers, List<String> emails, LocalDate dateOfBirth) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
        this.dateOfBirth = dateOfBirth;
    }
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public List<String> getphoneNumbers() {
		return phoneNumbers;
	}
	
	public void setphoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers=phoneNumbers;
	}
	
	public List<String> getemails() {
		return emails;
	}
	
	public void setemails(List<String> emails) {
		this.emails=emails;
	}
	
	
	public LocalDate getdateOfBirth() {
		return dateOfBirth;
	}
	
	public void setdateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	
	
	
	
	

}
