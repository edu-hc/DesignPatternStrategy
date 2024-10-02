class Disciplina {

    private String nome;
    private double p1, p2;
    private ICalcMedia calcMedia;

    public Disciplina(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void calcularMedia() {
        double media = calcMedia.calculaMedia(p1, p2);
        System.out.printf("P1: %.2f P2: %.2f Média: %.2f Situação: %s\n", p1, p2, media, calcMedia.situacao(media));
    }
}