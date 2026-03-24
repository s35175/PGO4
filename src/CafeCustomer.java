public class CafeCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName() { return firstName + " " + lastName; }

    @Override
    public String toString() {
        return "CafeCustomer{customerId=" + customerId + ", name='" + getFullName() + "', email='" + email + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CafeCustomer that = (CafeCustomer) obj;
        return customerId == that.customerId || email.equals(that.email);
    }
}
