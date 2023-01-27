public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int num) {
        if ((num < 0) || (num > 100)) {
            this.age = 0;
        } else {
            this.age = num;
        }
    }

    public boolean isTeen() {
        if ((age > 12) && (age < 20)) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if ((firstName.isEmpty()) && (lastName.isEmpty())) {
            return "";
        }
        if (firstName.isEmpty())
            return lastName;
        if (lastName.isEmpty())
            return firstName;
        return firstName + " " + lastName;
    }

}