package Strategy;

public class teste{
        public static void main(String args[]) {

            Comportamento defensivo = new ComportamentoDefensivo();
            Comportamento normal = new ComportamnetoNormal();
            Comportamento agressivo = new ComportamentoAgressivo();

            Robo robo = new Robo();
            robo.setComportamentoMover(agressivo);
            robo.mover();
            robo.setComportamentoMover(normal);
            robo.mover();
            robo.setComportamentoMover(defensivo);
            robo.mover();

        }



}
 

