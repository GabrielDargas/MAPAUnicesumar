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
public class Cliente extends Pessoa{
    private String usuario;
    private String senha;
    
    //getters and Setters

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //construtor

    public Cliente(String usuario, String senha, String nome, String documento) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.documento = documento;
    }
    public Cliente(){
        
    }
    
    
    public boolean verificarSenha(String s){
        return this.getSenha() == s;
    }

    @Override
    public void exibeDados() {
        System.out.println("--- Dados do Cliente ---");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Documento: " + this.getDocumento());
        System.out.println("----------------------------");
    }
}
/*O método "verificarSenha" recebe uma senha como parâmetro e, compara com a senha 
*armazenada para o cliente. Não se preocupe com criptografia, 
*a senha vai estar em texto comum e, vai ser comparada com a que for passada 
*com parâmetro.
*/