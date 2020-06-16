package energia.eletrica;

import javax.swing.JOptionPane;

public class ClasseEner {
    
    private double leituraAnt;
    private double leituraAtu;
    private double gasto;
    private double tusd;
    private double Mais;
    private double icms;
    private String bandeira;
    private double te;
    private double total1;
    private double total2;
   
    public double getLeituraAnt() {
        return leituraAnt;
    }

    public void setLeituraAnt(double leituraAnt) {
        this.leituraAnt = leituraAnt;
    }

    public double getLeituraAtu() {
        return leituraAtu;
    }

    public void setLeituraAtu(double leituraAtu) {
        this.leituraAtu = leituraAtu;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getTotal1() {
        return total1;
    }

    public void setTotal1(double total1) {
        this.total1 = total1;
    }

    public double getTotal2() {
        return total2;
    }

    public void setTotal2(double totalBandeira) {
        this.total2 = totalBandeira;
    }

    public double getMais() {
        return Mais;
    }

    public void setMais(double Mais) {
        this.Mais = Mais;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }  
    
    
    
    public double gasto(double leituraAnt, double leituraAtu){    
        this.gasto = this.leituraAtu - this.leituraAnt;
        return this.gasto;        
    }
    public double taxate(double gasto){
        this.te = this.gasto * 0.29;
        return this.te;
    }    
    public double taxatusd(double gasto){
        this.tusd = this.gasto * 0.30;
        return this.tusd;
    }
    public double somataxas(double tusd, double te){
        this.total1 = this.tusd + this.te;
        return this.total1;
    }
    public String bandeira(double gasto){
        if (this.gasto <100) {
            this.bandeira = "verde";
        }else if (this.gasto >101 && this.gasto <150) {
            this.bandeira = "amarelo";
        }else if (this.gasto>150 && this.gasto<200) {
            this.bandeira = "vermelho nivel 1";
        }else{
            this.bandeira = "vermelho nivel 2";
        }
        return this.bandeira;
    }
    public double icms(double total1){
        this.icms = this.total1 *0.25;
        this.icms = this.icms + this.total1;
        return icms;
    }
    
    public double mais(String bandeira, double icms){
        if ("verde".equals(this.bandeira)) {
            this.Mais = 1;
        }
        if ("amarelo".equals(this.bandeira)) {
            this.Mais = 0.04169;
        }
        if ("vermelho nivel 1".equals(this.bandeira)) {
            this.Mais = 0.04169;
        }
        if ("vermelho nivel 2".equals(this.bandeira)) {
            this.Mais = 0.06243;
        }
        return this.Mais;
    }
    public double taxaPagar(double icms){
        this.total2 = this.icms * this.Mais;
        this.total2 = this.total2+this.icms;
        return this.total2;
    }

    void recibo(double leituraAnt, double leituraAtu, double gasto, double total1, String bandeira, double totalBandeira) {
        JOptionPane.showMessageDialog(null,"Conta"
                + "\n\nLeitura antiga: "
                + this.leituraAnt
                + "\nLeitura atual: "
                + this.leituraAtu
                + "\nTotal gasto: "
                + this.gasto
                + "\nTotal sem bandeira: "
                + this.total1
                + "\nBandeira: "
                + this.bandeira
                + "\nTotal com bandeira "
                + this.total2);
    } 

    
}
