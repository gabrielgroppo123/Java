import entities.Combatente;

public class EngineBatalha {


    public void ataque(Combatente a, Combatente b){
        if (a.rolarParaAcertar() >= b.getAc()){
            System.out.println(a.getNome() + " acertou " + b.getNome());
            b.receberDano(a.rolarDano());
            if(b.getVivo() == false){
                System.out.println(b.getNome() + " morreu");
            }
            System.out.println(b.getNome() + " continua vivo");
        }
        System.out.println(a.getNome() + " errou " + b.getNome());
        if (b.rolarParaAcertar() >= a.getAc()){
            System.out.println(b.getNome() + " acertou "  + a.getNome());
            a.receberDano(b.rolarDano());
            if(a.getVivo() == false){
                System.out.println(a.getNome() + " morreu");
            }
            System.out.println(a.getNome() + " continua vivo");
        }
        System.out.println(b.getNome() + " errou " + a.getNome());
    }

    public void lutar(Combatente a , Combatente b){
        
    }
}
