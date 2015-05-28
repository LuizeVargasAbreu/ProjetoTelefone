package projetotelefone;

import javax.swing.JOptionPane;
public class ProjetoTelefone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Smartphone iphone6 = new Smartphone();
        Celular cel = new Celular ();
        iphone6.setCor("Preto");
        iphone6.setDespertador(true);
        iphone6.setInternet2g(true);
        iphone6.setModelo("IPHONE 6");
        iphone6.setMsg_texto(true);
        iphone6.setPeso(3.2);
        iphone6.setResolucao_tela("1920 x 800");
        iphone6.setWi_fi(true);
        
        JOptionPane.showMessageDialog(null, iphone6.resumo());
     
        
    }
    }
    

