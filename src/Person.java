/**
 * Created by icondor on 08/04/2017.
 */
public class Person {

    private String name;
    private String phone;

    Person(String name, String phone) {
        this.name=name;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
