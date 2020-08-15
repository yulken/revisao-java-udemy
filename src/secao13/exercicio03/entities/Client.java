package secao13.exercicio03.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
   private static SimpleDateFormat birthSdf = new SimpleDateFormat("dd/MM/yyyy");
   private String name;
   private String email;
   private Date birthDate;

    public Client() {
    }

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return getName() + "(" + birthSdf.format(getBirthDate()) + ") - " + getEmail();
    }

}