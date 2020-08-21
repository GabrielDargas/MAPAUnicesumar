//TODAS AS CLASSES DEVEM IMPLEMENTAR O EXIBIR DADOS SOZINHA


package mapa;

/**
 *
 * @author gabri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cadastro do presidente
        Presidente p1 = new Presidente("Asdrubal Leôncio Correa", "182.666-7", 15000, 2);
        
        //Cadastro das Secretárias
        Secretaria s1 = new Secretaria("Fátima", "658.114-9", 3000, 3);
        Secretaria s2 = new Secretaria("Ana", "522.128-7", 2200, 4);
        
        //Cadastro dos Vendedores
        Vendedor v1 = new Vendedor("João", "220.874-5", 1500, 10);
        Vendedor v2 = new Vendedor("Vanessa", "225.874-6", 1500, 11);
        Vendedor v3 = new Vendedor("Carlos", "895.002-6", 1500, 12);
        
        // Cadastro dos clientes
        Cliente c1 = new Cliente("MarcosAurelio", "123789", "Marcos", "189.630-9" );
        Cliente c2 = new Cliente("JoanaAmor", "Passatempo", "Joana", "187.589-6");
        Cliente c3 = new Cliente("ElisinhaAQuerida", "MangaAbacatePera1589*/", "Elisa", "562.894-4");
        Cliente c4 = new Cliente("LuquinhasSk8", "segredo", "Lucas", "889.569-4");

        //Comissão dos vendedores
        v1.setComissao(200);
        v2.setComissao(600);
        v3.setComissao(320);
        
        //Salario Anual
        System.out.println("O salario anual do Asdrubal com 13º é: " + p1.calculaSalarioAnual());
        System.out.println("O salario anual da Ana com 13º é: " + s2.calculaSalarioAnual());
        
        //Verificação de senhas
        System.out.println(c4.verificarSenha("123456"));
        System.out.println(c4.verificarSenha("segredo"));
        System.out.println(c4.verificarSenha("teste"));
        
        //Exibir dados
        p1.exibeDados();
        s1.exibeDados();
        s2.exibeDados();
        v1.exibeDados();
        v2.exibeDados();
        v3.exibeDados();
        c1.exibeDados();
        c2.exibeDados();
        c3.exibeDados();
        c4.exibeDados();
    
        
    }
}
/*2.1 - Cadastre o presidente da empresa, que é o Asdrubal Leôncio Correa.
*2.2 - Cadastre as duas secretárias, a Fátima e, a Ana.
*2.3 - Cadastre os vendedores João, Vanessa e, Carlos.
*2.4 - Cadastre os clientes Marcos, Joana, Elisa e, Lucas.
*2.5 - Defina as comissões dos vendedores
*2.6 - Calcule o salário anual do Asdrubal e, da Ana.
*2.7 - O usuário Lucas esqueceu a senha dele. Verifique se a senha dele é "123456", "segredo" ou "teste".
*2.8 - Mande exibir os dados de todas as pessoas (uma por uma).
 
*Essas ações devem ficar em sua classe principal para que, ao executar, as ações já sejam executadas.
 
* Os detalhes que você não tiver sobre as pessoas você pode inventar.
*/
