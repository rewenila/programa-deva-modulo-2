package br.com.ada.pooii.aula06.srp.withsolid;

public class User {
    private String name;
    private String email;

    // getters and setters
}

class UserRepository {
    public void saveUser(User user) {
        // saves user in the database
    }
}

class EmailService {
    public void sendEmail(User user, String message) {
        // sends email to the user
    }
}

class SMSService {
    public void sendSMS(User user, String message) {
        // sends sms to the user
    }
}

class CPFService {
    public boolean isValidCPF(String cpf) {
        // do the calculation to verify if the CPF is valid
        return false;
    }
}