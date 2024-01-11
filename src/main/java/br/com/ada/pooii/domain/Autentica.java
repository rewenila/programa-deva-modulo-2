package br.com.ada.pooii.domain;

// if a class implements an interface, its children automatically implement it too
public interface Autentica extends AutenticaTwoFactor{

    // interface atributes are always public, static, and final
    public static final Integer TAMANHO_MAX_SENHA = 8;
    boolean autentica(String senha);

    // default methods: classes implementing the interface are not forced to implement these methods,
    // but can choose to override if needed, were introduced in Java 8
    default boolean autenticaDefault(String senha) {
        return autenticaPrivate(senha);
    }

    // static methods: belong to the interface itself rather than to any specific instance of a class
    // implementing that interface, were intoroduced in Java 8
    static boolean autenticaStatic(String senha) {
        return senha.equals("123");
    }

    // private methods: can only be acessed within the interface itself, were introduced in Java 9
    private boolean autenticaPrivate(String senha) {
        return senha.equals("123");
    }
}

