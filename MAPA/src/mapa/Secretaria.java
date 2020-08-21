/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

/**
 *
 * @author gabri
 */
public class Secretaria extends Funcionario {

    @Override
    public void exibeDados() {
        System.out.println("--- Dados da Secretária ---");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Documento: " + this.getDocumento());
        System.out.println("----------------------------");
    }

    public Secretaria(){
        
    }
    public Secretaria(String nome, String documento, double salario, int ramal) {
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
        this.ramal = ramal;
    }

}
