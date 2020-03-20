/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder02;

import modelo.Paciente;

/**
 *
 * @author wolley
 */
public class App {
    
    public static void main(String[] args) {
        
        Paciente paciente = PacienteBuilder.novoPacienteBuilder()
                .comNome("Jose da Silva")
                .comCPF("333.333.333-33")
                .nascidoEm("12/02/1970")
                .doSexo('M')
                .comRG("25025125-x")
                .comCep("1236547")
                .comCidade("Campos do Jordão")
                .comLogradouro(" Rua Fala Zeze bom dia cara, deixa eu te falar uma coisa.")
                .comUf("SP")
                .comNumero(179)
                .comTiposanguineo(" Tipo O")
                .comAltura(1.76)
                .comPeso(70)
                .constroi();
        
        System.out.println(paciente);
        
    }
    
}
