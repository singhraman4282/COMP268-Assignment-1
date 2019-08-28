public class AddressBook {

    private String firstName;
    private String middleName;
    private String lastName;
    private String homeAddress;
    private String businessPhone;
    private String homePhone;
    private String cellphone;
    private String skypeId;
    private String facebookId;
    private String personalWebSite;

    /**
     * Initializes AddressBook
     */
    public AddressBook(String firstName, String middleName, String lastName, String homeAddress, String businessPhone, String homePhone, String cellphone, String skypeId, String facebookId, String personalWebSite) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.businessPhone = businessPhone;
        this.homePhone = homePhone;
        this.cellphone = cellphone;
        this.skypeId = skypeId;
        this.facebookId = facebookId;
        this.personalWebSite = personalWebSite;
    }

    /**
     * Initializes AddressBook
     */
    public AddressBook(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * Initializes AddressBook
     */
    public AddressBook(String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
    }

    /**
     * Initializes AddressBook
     */
    public AddressBook(String firstName) {
        this.firstName = firstName;
    }

    /**
     * returns first name
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * returns middle name
     * @return String
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets middle name
     * @param middleName String
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * returns last name
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name
     * @param lastName String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * returns home address
     * @return String
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * sets home address
     * @param homeAddress
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * returns business phone number
     * @return String
     */
    public String getBusinessPhone() {
        return businessPhone;
    }

    /**
     * sets business phone number
     * @param businessPhone String
     */
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    /**
     * retunrs home phone number
     * @return
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * sets home phone number
     * @param homePhone
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * returns cell phone number
     * @return String
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * sets cell phone number
     * @param cellphone
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * returns skypeID
     * @return String
     */
    public String getSkypeId() {
        return skypeId;
    }

    /**
     * Sets skype id
     * @param skypeId String
     */
    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    /**
     * returns facebookID
     * @return String
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     * sets facebook ID
     * @param facebookId String
     */
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    /**
     * returns personal website
     * @return String
     */
    public String getPersonalWebSite() {
        return personalWebSite;
    }

    /**
     * sets personal website
     * @param personalWebSite String
     */
    public void setPersonalWebSite(String personalWebSite) {
        this.personalWebSite = personalWebSite;
    }

    /**
     * Compares two names
     * @param name1 String
     * @param name2 String
     */
    public static void compare(String name1, String name2) {


        // We define a constant SPACE since we'll be using it again and again in this routine.
        String SPACE = " ";

        // We get the first name from the strings by getting a substring from the names given ranging from index 0 to the index of SPACE.
        String fn1 = name1.substring(0, name1.indexOf(SPACE));
        String fn2 = name1.substring(0, name2.indexOf(SPACE));

        // We get a string with middle name and last name. We get that by getting the index of space and adding 1 to it so that our resulting string won't have a space in the beginning.
        String ml1 = name1.substring(name1.indexOf(SPACE) + 1);
        String ml2 = name2.substring(name2.indexOf(SPACE) + 1);

        // From the middle names strings, we extract the middle name by starting from the character at index 0 and stopping when we get to SPACE
        String mn1 = ml1.substring(0, ml1.indexOf(SPACE));
        String mn2 = ml2.substring(0, ml2.indexOf(SPACE));

        // We extract the last name from strings by getting the characters starting from the index of SPACE. We add 1 to it to avoid getting a space in the beginning of the string obtained.
        String ln1 = ml1.substring(ml1.indexOf(SPACE) + 1);
        String ln2 = ml2.substring(ml2.indexOf(SPACE) + 1);

        // Here we do a simple string match to get the result.
        System.out.println("first names match: " + (fn1.equals(fn2)));
        System.out.println("middle names match: " + (mn1.equals(mn2)));
        System.out.println("last names match: " + (ln1.equals(ln2)));

    }

    /**
     * checks if the phone number is correct (i.e. does not contain non-digits)
     * @return boolean value
     */
    public boolean phoneNumberIsCorrect() {

        for (int i=0; i<cellphone.length(); i++) {
            char c = cellphone.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}


