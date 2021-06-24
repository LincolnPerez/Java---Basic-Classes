class Onibus {

    String liga;                    //Liga o ônibus//
    String desliga;                //Desliga o ônibus//
    String ponto_inicio;          //Ponto Inicio Turísco//
    String ponto_final; //Ponto Final do Turísco//
    String ponto_atual;  //Ponto Atual do Ônibus//
    String marca;                 //Marca de ônibus//
    String ano;                //Ano de fabricação do ônibus//
    String viacao;              //Empresa que disponibiliza o Ônibus//              //Cor do ônibus//
    int paradas;              //Quantidade de paradas//
    int capacidade;    //Capacidade Total//
    int pessoas;           //Quantas pessoas entraram//
    int portas;            //Quantidade de portas//
    int rodas;              //Quantidade de rodas//
    int entrada;            //Entrada de pessoas//
    int saída;              //Saída de pessoas//
    Date data_fabri;        //Data de fabricação//
    double peso;            //Peso do ônibus//
    double combustível;     //Combustível//
    String para;            //Quando o Ônibus para//
    String anda;            //Quando o Ônibus anda//
    String cor;             //Cor do Ônibus//
    


    //Método construtor

    public Onibus(String marca, String viacao, String ponto_inicio, String ponto_final, String ponto_atual, int capacidade, int pessoas, int paradas, int entrada, int saida, String para, String anda, String liga, String desliga, String cor) {


    this.marca = marca;
    this.modelo = viacao;
    this.motor = motor;
    this.ponto_final = ponto_final;
    this.ponto_inicio = ponto_inicio;
    this.liga = liga;
    this.desliga = desliga;
    this.entrada = entrada;
    this.saida = saida;
    this.assentos = assentos;
    this.capacidade = capacidade;
    this.paradas = paradas;
    this.para = para;
    this.anda = anda;
    this.cor = cor;

     }

    public String returnMarca() {
        return this.marca;
    }
     public String returnViacao() {
        return this.viacao;
    }
     public String returnPonto_Inicio() {
        return this.ponto_inicio;
    }
     public String returnPonto_Final() {
        return this.ponto_final;
    }
     public int returnPonto_Atual() {
        return this.ponto_atual;
    }
     public int returnEntrada() {
        return entrada;
    }
     public int returnSaida() {
        return saida;
    }
     public int returnCapacidade() {
        return capacidade;
    }
    public int returnPessoas() {
        return pessoas;
    }
     public int returnParadas() {
        return paradas;
    }
    public String returnCor() {
        return cor;
    }

    void liga() {
        System.out.println("O Onibus está ligado");
    }
    void desliga(){
        System.out.println("O Onibus está desligado");
    }
    void para(){
        System.out.print("O Onibus parou");
    }
    void anda(){
        System.out.println("O Onibus voltou a andar");
    }

    }
     


