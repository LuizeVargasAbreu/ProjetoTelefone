package projetotelefone;

public class Celular extends Telefone{

    private Boolean msg_texto;
    private Boolean despertador;

    public Boolean isMsg_texto() {
        return msg_texto;
    }

    public void setMsg_texto(Boolean msg_texto) {
        this.msg_texto = msg_texto;
    }

    public Boolean isDespertador() {
        return despertador;
    }

    public void setDespertador(Boolean despertador) {
        this.despertador = despertador;
    }

    public Celular() {
        this.msg_texto = false;
        this.despertador = false;
    }
    
   /* public String resumo()
    {
        if (this.msg_texto == true && this.despertador == true)
        {
            return "SIM";
        }
        else if (this.msg_texto == false && this.despertador == false)
        {
            return "NÃO";
        }
        return super.resumo() + "\nMensagem de Texto: " + this.msg_texto+ "\nDespertador: " + this.despertador;*/
    
    public String resumo()
    {
       return super.resumo()+ "MSG:" + this.isMsg_texto()+" DESP: " + this.isDespertador();
               
    }    
    }    

