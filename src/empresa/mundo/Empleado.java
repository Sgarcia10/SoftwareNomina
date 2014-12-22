/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.mundo;

import java.util.Date;

/**
 *
 * @author Santiago
 */
public class Empleado 
{
    private String nombres;
    
    private String apellidos;
    
    private int cedula;
    
    private String cargo;
    
    private int salarioBasico;
    
    private Date fechaNacimiento;
    
    private Date fechaIngresoEmpresa;
    
    private Date fechaRegistroSISS;
    
    private String rutaFoto;
    
    private int valorHora;
    
    
    public Empleado(String nombresP, String apellidosP, int cedulaP)
    {
        nombres=nombresP;
        
        apellidos=apellidosP;
        
        cedula=cedulaP;
    } 
    
    public String darNombres()
    {
        return nombres;
    }
    
    public String darApellidos()
    {
        return apellidos;
    }
    
    public int darCedula()
    {
        return cedula;
    }
    
}
