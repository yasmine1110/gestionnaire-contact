public class ContactsManager {

    Contact[] myFriends;
    int friendsCount;

    public ContactsManager() {
        this.myFriends    = new Contact[10];
        this.friendsCount = 0;
    }

    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}