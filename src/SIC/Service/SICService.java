/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIC.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author GALICIA
 */
public class SICService {
  private static final String PERSISTENCE_UNIT_NAME = "SistemaContablePU";
  private static EntityManagerFactory factory;
    private static ServCuenta servCuenta;
    private static ServMovimiento servMovimiento;
    private static ServUsuario servUsuario;
    private static ServCuentaSaldada servCuentaSaldada;
    private static ServEmpleado servEmpleado;
    private static ServCargo servCargo;
    private static ServTipoCuenta servTipoCuenta;
    private static ServTipoEstadoFinanciero servTipoEstadoFinanciero;
    private static ServPeriodo servPeriodo;
    private static ServOrdenFabricacion servOrdenFabricacion;
    private static ServDepartamento servDepartamento;

    public static ServPeriodo getServPeriodo() {
        if(servPeriodo==null)
            servPeriodo=new ServPeriodo(PERSISTENCE_UNIT_NAME);
        return servPeriodo;
    }

    
    public static ServTipoEstadoFinanciero getServTipoEstadoFinanciero() {
        if(servTipoEstadoFinanciero==null)
            servTipoEstadoFinanciero=new ServTipoEstadoFinanciero(PERSISTENCE_UNIT_NAME);
        return servTipoEstadoFinanciero;
    }

    
    public static ServEmpleado getServEmpleado() {
        if(servEmpleado==null)
            servEmpleado=new ServEmpleado();
        return servEmpleado;
    }

    public static ServTipoCuenta getServTipoCuenta() {
        if(servTipoCuenta==null)
            servTipoCuenta=new ServTipoCuenta(PERSISTENCE_UNIT_NAME);
        return servTipoCuenta;
    }

    public static ServCargo getServCargo() {
        if(servCargo==null)
            servCargo=new ServCargo();
        return servCargo;
    }

    
    
    public static ServUsuario getServUsuario() {
        if(servUsuario==null)
            servUsuario=new ServUsuario(PERSISTENCE_UNIT_NAME);
        
        return servUsuario;
    }
    
    public static ServCuenta getServCuenta() {
        if (servCuenta == null) {
            SICService.servCuenta = new ServCuenta(PERSISTENCE_UNIT_NAME);
        }
        return servCuenta;
    }

    public static ServMovimiento getServMovimiento() {
        if (servMovimiento == null) {
            SICService.servMovimiento = new ServMovimiento(PERSISTENCE_UNIT_NAME);
        }
        return servMovimiento;
    }

    public static ServCuentaSaldada getServCuentaSaldada() {
        if(servCuentaSaldada==null)
            servCuentaSaldada=new ServCuentaSaldada(PERSISTENCE_UNIT_NAME);
        
        return servCuentaSaldada;
    }
    public static ServOrdenFabricacion getServOrdenFabricacion() {
        if(servOrdenFabricacion==null)
            servOrdenFabricacion=new ServOrdenFabricacion();
        
        return servOrdenFabricacion;
    }
    public static ServDepartamento getServDepartamento() {
        if(servDepartamento==null)
            servDepartamento=new ServDepartamento();
        
        return servDepartamento;
    }
    
}

