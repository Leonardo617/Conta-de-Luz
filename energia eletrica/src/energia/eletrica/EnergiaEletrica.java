package energia.eletrica;

import javax.swing.JOptionPane;

public class EnergiaEletrica {

    public static void main(String[] args) {
        
        ClasseEner dados = new ClasseEner();
        
        dados.setLeituraAnt(Double.parseDouble(JOptionPane.showInputDialog("Primeira leitura:")));
        dados.setLeituraAtu(Double.parseDouble(JOptionPane.showInputDialog("Leitura atual :"))); 
        
        dados.gasto(dados.getLeituraAnt(),dados.getLeituraAtu());
        dados.taxate(dados.getGasto());
        dados.taxatusd(dados.getGasto());
        dados.somataxas(dados.getTe(),dados.getTusd());
        dados.icms(dados.getTotal1());
        dados.bandeira(dados.getGasto());
        dados.mais(dados.getBandeira(),dados.getIcms());
        dados.taxaPagar(dados.getIcms());
        
        dados.recibo(dados.getLeituraAnt(),dados.getLeituraAtu(),dados.getGasto(),dados.getTotal1(),dados.getBandeira(),dados.getTotal2());
        
    }
    
}
