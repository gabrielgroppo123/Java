public class EnumExemplo {

    public enum DiaDaSemana{
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO
    }

    public static void testeEnumBasico(){
        DiaDaSemana hoje = DiaDaSemana.TERCA;
        System.out.println("Hoje é " + hoje);

        System.out.println("\nTodos os dias da semana:");
        for (DiaDaSemana dia : DiaDaSemana.values()){
            System.out.println(dia);
        }
    }

    public static void verificarDia(DiaDaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Inicio da semana :(");
                break;

            case SEXTA:
                System.out.println("Ultimo dia da semana :)");
                break;

            case SABADO:
            case DOMINGO:
                System.out.println("Fim de semana :D");
                break;

            default:
                System.out.println("Meio da semana: ~");
                break;
        }
    }

    public static void testeEnumSwitch(){
        verificarDia(DiaDaSemana.SEGUNDA);
        verificarDia(DiaDaSemana.TERCA);
        verificarDia(DiaDaSemana.SEXTA);
        verificarDia(DiaDaSemana.SABADO);
    }

    public enum Nivel{
        BAIXO(1), MEDIO(5), ALTO(10);

        private final int codigo;

        private Nivel(int codigo){
            this.codigo = codigo;
        }

        private int getCodigo(){
            return codigo;
        }
    }

    public static void main(String[] args) {
        //testeEnumBasico();
        //testeEnumSwitch();
        Nivel prioridade = Nivel.ALTO;
        System.out.println("Nivel de prioridade: " + prioridade);
        System.out.println("Código de prioridade: " + prioridade.getCodigo());
    }
}