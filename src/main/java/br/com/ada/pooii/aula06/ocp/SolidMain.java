package br.com.ada.pooii.aula06.ocp;

public class SolidMain {
    public static void main(String[] args) {

        // SOLID
        // SRP: Single Responsability Principle / Princípio da Responsabilidade Única
        // OCP: Open-Closed Principle / Princípio do aberto e fechado
        // LSP: Liskov Substitution Principle / Princípio da substituição de Liskov
        // ISP: Interface Segregation Principle / Princípio da Segregaçǎo de Interfaces
        // DIP: Dependancy Inversion Principle / Princípio da inversão de Dependências

        // All together: Dependancy Injection Principle / Princípio da Injeção de Dependência

        // SRP
        Funcionario funcionariaErica = new Gerente("Érica", 5000);
        Funcionario funcionariaPaula = new Produto("Paula", 2000);
        Funcionario funcionariaAgata = new Almoxarifado("Ágata", 3200);

        double bonusErica = funcionariaErica.calcularBonus();
        double bonusPaula = funcionariaPaula.calcularBonus();
        double bonusAgata = funcionariaAgata.calcularBonus();

        System.out.println(bonusErica);
        System.out.println(bonusPaula);
        System.out.println(bonusAgata);

    }
}


