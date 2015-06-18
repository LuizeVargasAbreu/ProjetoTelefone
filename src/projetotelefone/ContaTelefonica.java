/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetotelefone;

/**
 *
 * @author Aluno
 */
public class ContaTelefonica {
    
    private String operadora;
    private String numero_linha;
    private String saldo_devedor;
    private Usuario usuario;

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNumero_linha() {
        return numero_linha;
    }

    public void setNumero_linha(String numero_linha) {
        this.numero_linha = numero_linha;
    }

    public String getSaldo_devedor() {
        return saldo_devedor;
    }

    public void setSaldo_devedor(String saldo_devedor) {
        this.saldo_devedor = saldo_devedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ContaTelefonica() {
        this.operadora = null;
        this.numero_linha = null;
        this.saldo_devedor = null;
        this.usuario = new Usuario ();
    }
    
    
}
