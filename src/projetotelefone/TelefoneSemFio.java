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
public class TelefoneSemFio extends Telefone{
    
    
    private Boolean secret_eletronica;
    private Double alcance;

    
    public Boolean isSecret_eletronica() {
        return secret_eletronica;
    }

    public void setSecret_eletronica(Boolean secret_eletronica) {
        this.secret_eletronica = secret_eletronica;
    }

    public Double getAlcance() {
        return alcance;
    }

    public void setAlcance(Double alcance) {
        this.alcance = alcance;
    }

    public TelefoneSemFio() {
      
        this.secret_eletronica = false;
        this.alcance = 0.0;
    }
    
    public String resumo ()
    {
        if (this.secret_eletronica == true )
        {
            return "SIM";
        }
        else if (this.secret_eletronica == false)
        {
            return "NÃO";
        }
        
        return super.resumo() + "\nSecretária Eletrônica: " + this.secret_eletronica + "\nAlcance: " + this.alcance;
    }    
}
