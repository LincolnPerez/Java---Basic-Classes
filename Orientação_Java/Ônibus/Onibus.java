class Onibus {

    String liga;                    //Liga o ônibus//
    String desliga;                //Desliga o ônibus//
    String ponto_inicio;          //Ponto Inicio Turísco//
    String ponto_final; //Ponto Final do Turísco//
    String ponto_atual;
    String marca;                 //Marca de ônibus//
    String ano;                //Ano de fabricação do ônibus//
    String viacao;              //Empresa que disponibiliza o Ônibus//              //Cor do ônibus//
    int paradas;              //Quantidade de paradas//
    int capacidade;    //Capacidade Total//
    int pessoas;           //Quantas pessoas entraram//
    int portas;            //Quantidade de portas//
    int rodas;              //Quantidade de rodas//
    int entrada;            //Entrada de pessoas//
    double peso;            //Peso do ônibus//
    double combustível;     //Combustível//
    String para;            //Quando o Ônibus para//
    String anda;            //Quando o Ônibus anda//
    String cor;             //Cor do Ônibus//
    int assentos;
    int saida;
    


    //Método construtor

    public Onibus(String marca, String viacao, String ponto_inicio, String ponto_final, int capacidade, int pessoas, String cor, int assentos, String ponto_atual) {


    this.marca = marca;
    this.viacao = viacao;
    this.ponto_final = ponto_final;
    this.ponto_inicio = ponto_inicio;
    this.assentos = assentos;
    this.capacidade = capacidade;
    this.pessoas = pessoas;
    this.cor = cor;
    this.ponto_atual = ponto_atual;

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
     public String returnPonto_Atual() {
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
        System.out.println("O Onibus esta ligado");
    }
    void desliga(){
        System.out.println("O Onibus esta desligado");
    }
    void para(){
        System.out.print("O Onibus parou");
    }
    void anda(){
        System.out.println("O Onibus voltou a andar");
    }

    }
     


