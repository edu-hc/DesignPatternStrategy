public class Main {

    public static void main(String[] args) {
        Aritmetica calculo = new Aritmetica();


        Disciplina d = new Disciplina(calculo);
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();

    }
}