document.getElementById("contact-form").addEventListener("submit" , function(event){
    event.preventDefault();
    const name=document.getElementById("name").value;
    const phoneNumbers=document.getElementById("phoneNumbers").value.split(",");
    const emails=document.getElementById("emails").value.split(",");
    const dateOfBirth=document.getElementById("dateOfBirth").value;

    const contact={
        name:name,
        phoneNumbers:phoneNumbers,
        emails:emails,
        dateOfBirth:dateOfBirth
    }

    console.log(contact);
//make an ajax post request to add the contact
    fetch("/api/contacts" , {
        method:"POST",
        header:{
            "Content-Type" : "application/json"
    
        },
        body:JSON.stringify(contact)

        
    })

    .then(response=>response.json())
    .then(data=>{
        console.log("sucess : " , data);
        fetchContacts();
        
    })
    .catch(error=>{
        console.error("Error: " , error);
    });


});


function fetchContacts(){
	fetch("/api/contacts")
    .then(response=>response.json())
    .then(data=>{
        console.log("sucess : " , data);
        
//    	update contact list
    	const contactsList=document.getElementById("contacts-list");
    	contactsList.innerHTML="";
    	data.forEach(contact => {
            const contactItem = document.createElement("div");
            contactItem.innerHTML = `
                <p>Name: ${contact.name}</p>
                <p>Phone Numbers: ${contact.phoneNumbers.join(", ")}</p>
                <p>Emails: ${contact.emails.join(", ")}</p>
                <p>Date of Birth: ${contact.dateOfBirth}</p>
                <button onclick="updateContact(${contact.id})">Update</button>
                <button onclick="deleteContact(${contact.id})">Delete</button>
            `;

            contactsList.appendChild(contactItem);
        });
        
    })
    .catch(error=>{
        console.error("Error: " , error);
    });
	
}

function updateContact(contactId){
//	make ajax request to backend for updating data code here
}

function deleteContact(contactId){
//	make ajax request to backend for deleting data code here
}
	

	



