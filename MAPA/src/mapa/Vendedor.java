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
public class Vendedor extends Funcionario {

    private double comissao;

    public double salariMesComComissao() {
        double salarioComissao = this.salario + this.comissao;
        return salarioComissao;
    }

    //getters e Setters
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    //construtor 
    public Vendedor() {

    }

    public Vendedor(String nome, String documento, double salario, int ramal) {
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
        this.ramal = ramal;
    }

    @Override
    public void exibeDados() {
        System.out.println("--- Dados do Vendedor ---");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Documento: " + this.getDocumento());
        System.out.println("----------------------------");
    }
}
