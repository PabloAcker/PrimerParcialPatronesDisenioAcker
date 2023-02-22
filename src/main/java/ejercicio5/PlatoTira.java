package ejercicio5;

public class PlatoTira extends BuilderPlato{
    @Override
    public void buildTipoCarne() {this.plato.setTipoCarne("Tira de carne");}

    @Override
    public void buildSabdorRefresco() {this.plato.setSaborRefresco("CocaCola");}

    @Override
    public void buildGuarnicion() {this.plato.setGuarniciones("Fideo");}
}
