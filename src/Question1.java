/*
Create a class named AddressBook that has the following field names:
firstName, middleName, lastName, homeAddress, businessPhone, homePhone,
cellphone, skypeId, facebookId, and personalWebSite.
Use appropriate data types to store the values for these fields in AddressBook objects.
Create appropriate get and set methods to retrieve and assign values to these names. For
example, getMiddleName(viveAddressBook) should return the middle name of the person
Vive. Similarly, vive.setPersonalWebsite(url) should set the personal website of the person
Vive to the specified URL object.
Using the get and set methods, create a comparison method compareNames(name1, name2)
that compares the first, middle, and last names of strings name1 and name2. Assume that name1
and name2 follow the following format: “FirstName M. LastName”.
Test your program for correct, partially correct (e.g., name string without the middleName), and
incorrect inputs (e.g., phone number containing special characters).
 */


public class Question1 {

    public static void main(String[] args) {
        AddressBook.compare("Raman J Singh", "Singh R Jit");
        AddressBook.compare("Raman J Singh", "Raman J Singh");
    }


}
