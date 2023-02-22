package ejercicio5;

public class PlatoLomito extends BuilderPlato{
    @Override
    public void buildTipoCarne() {this.plato.setTipoCarne("Lomo");}

    @Override
    public void buildSabdorRefresco() {this.plato.setSaborRefresco("Pepsi");}

    @Override
    public void buildGuarnicion() {this.plato.setGuarniciones("Arroz");}
}
