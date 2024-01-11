package br.com.ada.pooii.domain;

public class Cliente implements Autentica {

    private String senha;

    @Override
    public boolean autentica(String senha) {

        int range = Autentica.TAMANHO_MAX_SENHA;

        if (senha != null && senha.length() > range) {
            int resultadoDivisao = 10/0;
            return false;
        }
        return autenticaDefault(senha);
    }
}
