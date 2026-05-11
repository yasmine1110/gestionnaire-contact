 public class Main {

    public static void main(String[] args) {

        //  Créer le ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // ajouter Contact 1
        Contact myContact = new Contact();
        myContact.name        = "abdoul karim";
        myContact.phoneNumber = "0758493021";
        myContactsManager.addContact(myContact);

        // ajouter Contact 2
        Contact contact2 = new Contact();
        contact2.name        = "Mariam kone";
        contact2.phoneNumber = "0612345678";
        myContactsManager.addContact(contact2);

        // ajouter Contact 3
        Contact contact3 = new Contact();
        contact3.name        = "tossah fafa";
        contact3.phoneNumber = "0717306789";
        myContactsManager.addContact(contact3);

        // Contact 4
        Contact contact4 = new Contact();
        contact4.name        = "Aminata ouattara";
        contact4.phoneNumber = "0698765432";
        myContactsManager.addContact(contact4);

        // ajouter Contact 5
        Contact contact5 = new Contact();
        contact5.name        = "koffiMartin";
        contact5.phoneNumber = "0745678901";
        myContactsManager.addContact(contact5);

        //  Rechercher un contact et afficher son numéro
        Contact found = myContactsManager.searchContact("tossah fafa");

        if (found != null) {
            System.out.println("Contact trouvé !");
            System.out.println("Nom         : " + found.name);
            System.out.println("Téléphone   : " + found.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}