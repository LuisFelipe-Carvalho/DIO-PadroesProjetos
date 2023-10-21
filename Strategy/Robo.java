package Strategy;

public class Robo{

    private Comportamento comportamentoMover;
   



    public void setComportamentoMover(Comportamento comportamentoMover) {
        this.comportamentoMover = comportamentoMover;
    }

    public void mover() {
        comportamentoMover.mover();
    }


}

