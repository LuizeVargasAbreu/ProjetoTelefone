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
    public class Smartphone extends Celular{

    private Boolean internet2g;
    private Boolean Wi_fi;
    private String resolucao_tela;

    public Boolean isInternet2g() {
        return internet2g;
    }

    public void setInternet2g(Boolean internet2g) {
        this.internet2g = internet2g;
    }

    public Boolean isWi_fi() {
        return Wi_fi;
    }

    public void setWi_fi(Boolean Wi_fi) {
        this.Wi_fi = Wi_fi;
    }

    public String getResolucao_tela() {
        return resolucao_tela;
    }

    public void setResolucao_tela(String resolucao_tela) {
        this.resolucao_tela = resolucao_tela;
    }

    public Smartphone() {
        this.Wi_fi = false;
        this.internet2g = false;
        this.resolucao_tela = null;
    }
    
    public String resumo ()
    {
        if (this.Wi_fi == true && this.internet2g == true)
        {
            return "SIM";
        }
        else if (this.Wi_fi == false && this.internet2g == false)
        {
            return "NÃO";
        }
        return super.resumo() + "\nInternet 2g: " + this.internet2g + "\n Wi-fi: " + this.Wi_fi + "\nResolução da Tela: " + this.resolucao_tela; 
    }
}
