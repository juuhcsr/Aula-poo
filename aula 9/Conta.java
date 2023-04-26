package hotel;

public class Conta {
    private int reserva;
    private double diaria;
    private int dias;
    private boolean garagem;
    private double refeicao;
    private double servico;
    private double iss;
    private double turismo;
    private boolean situacao; // true - conta aberta / false - conta fechada
    
    // Construtor
    public Conta(int reserva, double diaria, int dias, boolean garagem) {
        this.reserva = reserva;
        this.diaria = diaria;
        this.dias = dias;
        this.garagem = garagem;
        this.refeicao = 0.0;
        this.servico = 10.0;
        this.iss = 5.0;
        this.turismo = 1.50;
        this.situacao = true;
    }
    
    // Métodos de acesso e modificadores
    public int getReserva() {
        return reserva;
    }
    
    public void setReserva(int reserva) {
        if (this.situacao) { // só pode alterar se a conta ainda estiver aberta
            this.reserva = reserva;
        } else {
            System.out.println("Não é possível alterar uma conta já fechada.");
        }
    }
    
    public double getDiaria() {
        return diaria;
    }
    
    public void setDiaria(double diaria) {
        if (this.situacao) { // só pode alterar se a conta ainda estiver aberta
            this.diaria = diaria;
        } else {
            System.out.println("Não é possível alterar uma conta já fechada.");
        }
    }
    
    public int getDias() {
        return dias;
    }
    
    public void setDias(int dias) {
        if (this.situacao) { // só pode alterar se a conta ainda estiver aberta
            this.dias = dias;
        } else {
            System.out.println("Não é possível alterar uma conta já fechada.");
        }
    }
    
    public boolean isGaragem() {
        return garagem;
    }
    
    public void setGaragem(boolean garagem) {
        if (this.situacao) { // só pode alterar se a conta ainda estiver aberta
            this.garagem = garagem;
        } else {
            System.out.println("Não é possível alterar uma conta já fechada.");
        }
    }
    
    public double getRefeicao() {
        return refeicao;
    }
    
    public void setRefeicao(double refeicao) {
        if (this.situacao) { // só pode alterar se a conta ainda estiver aberta
            this.refeicao = refeicao;
        } else {
            System.out.println("Não é possível alterar uma conta já fechada.");
        }
    }
    
    public double getServico() {
        return servico;
    }
    
    public void setServico(double servico) {
        if (this.situacao) { // só pode alterar se a conta ainda estiver aberta
            this.servico = servico;
        } else {
            System.out.println("Não é possível alterar uma conta já fechada.");
        }
    }
    
    public double getIss() {
        return iss;
    }
    
    public void setIss(double iss) {
        if (this.situacao) { // só pode alterar se
        }
    }

    public void setTurismo(double turismo) {
        if (this.situacao) { // só pode alterar se a conta estiver aberta
            this.turismo = turismo;
        } else {
            System.out.println("Não é possível alterar uma conta já fechada.");
        }
    }
// d) Método para adicionar valor de uma nova refeição:
    public void adicionarRefeicao(double valorRefeicao) {
        if (this.situacao) { // só pode alterar se a conta estiver aberta
            this.refeicao += valorRefeicao;
        } else {
            System.out.println("Não é possível alterar uma conta já fechada.");
        }
    }
// e) Método para calcular o valor parcial da conta:
    public double calcularValorParcial() {
        double valorParcial = this.dias * this.diaria; // valor da hospedagem
        if (this.reserva == 3) { // se reservou pela internet, tem desconto de 10%
            valorParcial *= 0.9;
        }
        if (this.garagem) { // se usou a garagem, acrescenta o valor
            valorParcial += this.dias * 15.0;
        }
        valorParcial += this.refeicao; // acrescenta o valor das refeições
        return valorParcial;
    }
// f) Método para calcular o valor da taxa de serviço:
    public double calcularTaxaServicos(double valorParcial) {
        return valorParcial * (this.servico / 100.0);
    }
// g) Método para calcular o ISS:
    public double calcularISS(double valorTotal) {
        return valorTotal * (this.iss / 100.0);
    }
    
    public double calcularTotal() {
        double valorParcial = calcularValorParcial();
        double taxaServicos = calcularTaxaServicos(valorParcial);
        double valorTotal = valorParcial + taxaServicos;
        double valorISS = calcularISS(valorTotal);
        valorTotal += valorISS + turismo;
        return valorTotal;
    }

    
// h) Método para mostrar o extrato da conta:
    public void mostraExtrato() {
        System.out.println("===============================================");
        System.out.println("                 EXTRATO DA CONTA               ");
        System.out.println("===============================================");
        System.out.println("Reserva: " + this.reserva);
        System.out.println("Preço da diária: R$" + String.format("%.2f", this.diaria));
        System.out.println("Dias de permanência: " + this.dias);
        System.out.println("Garagem utilizada: " + (this.garagem ? "Sim" : "Não"));
        System.out.println("Valor das refeições: R$" + String.format("%.2f", this.refeicao));
        System.out.println("Taxa de serviços: " + this.servico + "%");
        System.out.println("Valor da taxa de serviços: R$" + String.format("%.2f", this.calcularTaxaServicos(calcularValorParcial())));
        System.out.println("Imposto sobre serviços (ISS): " + this.iss + "%");
        System.out.println("Valor do ISS: R$" + String.format("%.2f", this.calcularISS(iss)));
        System.out.println("Taxa de turismo: R$" + String.format("%.2f", this.turismo));
        System.out.println("===============================================");
        System.out.println("Valor Parcial (Diária, Garagem e Refeição): R$" + String.format("%.2f", this.calcularValorParcial()));
        System.out.println("Valor da taxa de serviço: R$" + String.format("%.2f", this.calcularTaxaServicos(calcularValorParcial())));
        System.out.println("Valor ISS: R$" + String.format("%.2f", this.calcularISS(calcularTotal())));
        System.out.println("TOTAL: R$" + String.format("%.2f", this.calcularTotal()));
        System.out.println("===============================================");
    }

}


