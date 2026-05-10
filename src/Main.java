 public class Main {

    public static void main(String[] args) {

        //  Créer le ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // ajouter Contact 1
        Contact myContact = new Contact();
        myContact.name        = "Jean Baptiste";
        myContact.phoneNumber = "0758493021";
        myContactsManager.addContact(myContact);

        // ajouter Contact 2
        Contact contact2 = new Contact();
        contact2.name        = "Marie Dupont";
        contact2.phoneNumber = "0612345678";
        myContactsManager.addContact(contact2);

        // ajouter Contact 3
        Contact contact3 = new Contact();
        contact3.name        = "Kofi Mensah";
        contact3.phoneNumber = "0723456789";
        myContactsManager.addContact(contact3);

        // Contact 4
        Contact contact4 = new Contact();
        contact4.name        = "Aminata Bah";
        contact4.phoneNumber = "0698765432";
        myContactsManager.addContact(contact4);

        // ajouter Contact 5
        Contact contact5 = new Contact();
        contact5.name        = "Lucas Martin";
        contact5.phoneNumber = "0745678901";
        myContactsManager.addContact(contact5);

        //  Rechercher un contact et afficher son numéro
        Contact found = myContactsManager.searchContact("Kofi Mensah");

        if (found != null) {
            System.out.println("Contact trouvé !");
            System.out.println("Nom         : " + found.name);
            System.out.println("Téléphone   : " + found.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}