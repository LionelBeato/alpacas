package Lesson.Creational.Builder;

public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private boolean isNewsletter() {
        return newsletter;
    }

    private void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }


    private BankAccount(BankAccountBuilder bankAccountBuilder){
        accountNumber = bankAccountBuilder.accountNumber;
        email = bankAccountBuilder.email;
        name = bankAccountBuilder.name;
        newsletter = bankAccountBuilder.newsletter;
    }


    public static class BankAccountBuilder {
        // builder code

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber){
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter){
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }



    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                ", newsletter=" + newsletter +
                '}';
    }
}
