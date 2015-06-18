package projetotelefone;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Telefone> velhos;
    private List<Celular> celulares; 

    public List<Telefone> getVelhos() {
        return velhos;
    }

    public void setVelhos(List<Telefone> velhos) {
        this.velhos = velhos;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(List<Celular> celulares) {
        this.celulares = celulares;
    }
    
    public Loja ()
    {
        velhos = new ArrayList<Telefone>();
        celulares = new ArrayList<Celular>();
    }
    
    public void catalogarTelefone ()
    {
        Telefone t = new Telefone();
        t.setCor("Canarinho");
        t.setModelo("Gran Phone");
        t.setPeso(3.2);
        velhos.add(t);
        t = new Telefone();
        t.setCor("Blue");
        t.setModelo("Sim Phone");
        t.setPeso(3.4);
        velhos.add(t);
        t = new Telefone();
        t.setCor("Preto");
        t.setModelo("Motovelho");
        t.setPeso(3.2);
        velhos.add(t);
        t = new Telefone();
        t.setCor("Dourado");
        t.setModelo("Nescau");
        t.setPeso(3.2);
        velhos.add(t);
    }
    
    public void catalogarCelular ()
    {
        Celular c = new Celular();
        c.setCor("Branco e Preto");
        c.setModelo("Iphone");
        c.setPeso(3.2);
        c.setDespertador(true);
        c.setMsg_texto(false);
        celulares.add(c);
        c = new Celular();
        c.setCor("Azul");
        c.setModelo("Samsung");
        c.setPeso(3.4);
        c.setDespertador(true);
        c.setMsg_texto(false);
        celulares.add(c);
        c = new Celular();
        c.setCor("Prateado");
        c.setModelo("Motorola");
        c.setPeso(3.2);
        c.setDespertador(true);
        c.setMsg_texto(false);
        celulares.add(c);
        c = new Celular();
        c.setCor("Vermelho");
        c.setModelo("Nokia");
        c.setPeso(3.2);
        c.setDespertador(true);
        c.setMsg_texto(false);
        celulares.add(c); 
    }
    
    public Celular buscarCeLModelo (String modelo)
    {
        Celular achei = null;
        
        for (Celular celular : celulares) {
            if(modelo.equals(celular.getModelo()))
            {
                // se achou joga na variavel achei
                achei = celular;
                break;
            }
            
        }
        return achei;
    }
}
