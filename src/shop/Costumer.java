package shop;

public class Costumer {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String subscriptionDate;

    public Costumer(int id, String name, String surname, String email, String subscriptionDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.subscriptionDate = subscriptionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }
}
