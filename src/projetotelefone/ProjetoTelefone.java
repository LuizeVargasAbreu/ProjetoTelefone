package projetotelefone;

import javax.swing.JOptionPane;

public class ProjetoTelefone {

    public static void main(String[] args) {

       /* Smartphone iphone6 = new Smartphone();
        Celular cel = new Celular();
        iphone6.setCor("Preto");
        iphone6.setDespertador(true);
        iphone6.setInternet2g(true);
        iphone6.setModelo("IPHONE 6");
        iphone6.setMsg_texto(true);
        iphone6.setPeso(3.2);
        iphone6.setResolucao_tela("1920 x 800");
        iphone6.setWi_fi(true);

        TelefoneSemFio semfio = new TelefoneSemFio();
        semfio.setAlcance(2.5);
        semfio.setSecret_eletronica(true);
        semfio.setCor("VERDE");
        semfio.setModelo("VAI LONGE");
        semfio.setPeso(3.5);

        Telefone tetelf = new Telefone();
        tetelf.setCor("Branco");
        tetelf.setModelo("Velho");
        tetelf.setPeso(10.5);

        exibeResumao(iphone6);

    }

    public static void exibeResumao(Telefone tel) {
        JOptionPane.showMessageDialog(null, tel.resumo());*/
        Loja loja = new Loja();
// Se o catalogo for carregado antes vai ser exibido na tela        
        loja.catalogarTelefone();
        
        //for (int i = 0; i < loja.getVelhos().size(); i++) {
          //  System.out.println(loja.getVelhos().get(i).resumo());
    //}
        //for (Telefone velho : loja.getVelhos()) {
          //      System.out.println(velho.resumo());
           // }
        
        loja.catalogarCelular();
            for (Celular celulares : loja.getCelulares()) {
                System.out.println(celulares.resumo());                
            }
        }

    }


