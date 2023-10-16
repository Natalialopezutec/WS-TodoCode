/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona{
    //private int id_Responsable;
    private String tipo_Resp;
   

    public Responsable() {
    }

    public Responsable(String tipo_Resp, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipo_Resp = tipo_Resp;
    }





    public String getTipo_Resp() {
        return tipo_Resp;
    }

    public void setTipo_Resp(String tipo_Resp) {
        this.tipo_Resp = tipo_Resp;
    }

    
    
}
