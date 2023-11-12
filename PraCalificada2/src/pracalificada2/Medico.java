/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pracalificada2;

/**
 *
 * @author Us
 */
public class Medico {
    
    private int Nrocolegiatura;
    private String Nombre;
    private String Especialidad;

    public Medico(int Nrocolegiatura, String Nombre, String Especialidad) {
        this.Nrocolegiatura = Nrocolegiatura;
        this.Nombre = Nombre;
        this.Especialidad = Especialidad;
    }

    public int getNrocolegiatura() {
        return Nrocolegiatura;
    }

    public void setNrocolegiatura(int Nrocolegiatura) {
        this.Nrocolegiatura = Nrocolegiatura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
}
