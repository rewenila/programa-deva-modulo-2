package br.com.ada.pooii.aula06.srp.withoutsolid;

public class User {
    private String nome;
    private String email;
    private String cpf;

    // getters and setters

    public void saveUser() {
        // save user in the batabase
        // violates SRP, because the class User is aldo sealing with data persistence
    }

    public void sendEmail(String message) {
        // sends email to the user
        // violates SRP, because the class User is also dealing with communication via email
    }

    public void sendSMS(String message) {
        // sends SMS to the user
        // violates SRP, because the class User is also dealing with communication via SMS
    }

    public boolean isValidCPF() {
        // do the calculations to verify if CPF is valid
        // violates SRP, because the class User also has to know the calculation of CPF
        return false;
    }
}
