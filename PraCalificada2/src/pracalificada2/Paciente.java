package pracalificada2;

public class Paciente {
    
    private int Dni;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private float Peso;
    private float Temperatura;
    private Medico medico;

    public Paciente(int Dni, String Nombre,String Apellido, String Direccion, float Peso, float Temperatura) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Peso = Peso;
        this.Temperatura = Temperatura;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(float Temperatura) {
        this.Temperatura = Temperatura;
    }
       public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    @Override
	public String toString() {
		return "Paciente{" +
                                "DNI ="+ Dni +
                                ",Nombre ="+ Nombre +
                                ",Apellido ="+ Apellido +
                                ",Direccion="+ Direccion +
                                ",Peso ="+ Peso +
                                ",Temperatura ="+ Temperatura +
                                ",Medico ="+ medico +
                                "}";  
    }
}
