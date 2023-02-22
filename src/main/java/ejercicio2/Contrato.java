package ejercicio2;

public class Contrato implements IContrato{
    private int sueldo;
    private int cargaHoraria;
    private Boolean cursoEducacionSuperior;
    private Boolean accesoPlataforma;
    private Boolean marcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;
    private String nombre;
    private String apellido;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargarHoraria() {
        return cargaHoraria;
    }

    public void setCargarHoraria(int cargarHoraria) {
        this.cargaHoraria = cargarHoraria;
    }

    public Boolean getCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(Boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public Boolean getAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(Boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public Boolean getMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(Boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }

    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
    }

    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }

    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void showContrato(){
        System.out.println("--------------------------------------");
        System.out.println("Mostrando sueldo de docente>>>>>");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Sueldo: "+getSueldo());
        System.out.println("Carga Horaria: "+getCargarHoraria());
        System.out.println("Curso de Educacion Superior: "+ getCursoEducacionSuperior());
        System.out.println("Acceso a Plataforma: "+getAccesoPlataforma());
        System.out.println("Marcado Biometrico: "+getMarcadoBiometrico());
        System.out.println("Marcado Hora de Entrada: "+getMarcadoHoraEntrada());
        System.out.println("Marcado Hora de Salida: "+getMarcadoHoraSalida());

    }
    @Override
    public Contrato clone() {
        Contrato clon = new Contrato();
        clon.setSueldo(this.getSueldo());
        clon.setCargarHoraria(this.getCargarHoraria());
        clon.setCursoEducacionSuperior(this.getCursoEducacionSuperior());
        clon.setAccesoPlataforma(this.getAccesoPlataforma());
        clon.setMarcadoBiometrico(this.getMarcadoBiometrico());
        clon.setMarcadoHoraEntrada(this.getMarcadoHoraEntrada());
        clon.setMarcadoHoraSalida(this.getMarcadoHoraSalida());
        clon.setNombre(this.getNombre());
        clon.setApellido(this.getApellido());
        return clon;
    }
}
