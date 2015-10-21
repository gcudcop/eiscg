/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oscunach.vif.busquedas;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import oscunach.vif.entidades.SalaAcgda;

/**
 *
 * @author Geovanny Cudco
 */
public class FBSalaAcgda {

    public static ArrayList<SalaAcgda> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<SalaAcgda> lst = new ArrayList<SalaAcgda>();
        SalaAcgda datos = null;
        try {
            while (rs.next()) {
                datos = new SalaAcgda(
                        rs.getInt("pcodigo"),
                        rs.getInt("pnumero_ficha"),
                        rs.getString("pprovincia"),
                        rs.getString("pcanton"),
                        rs.getString("pbarrio"),
                        rs.getString("pinstitucion"),
                        rs.getDate("pfecha_atencion"),
                        rs.getString("papellidos_victima"),
                        rs.getString("pnombres_victima"),
                        rs.getInt("pedad_victima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pinstruccion_victima"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("ptelefono_victima"),
                        rs.getString("pcanton_domicilio"),
                        rs.getString("pparroquia_domicilio"),
                        rs.getString("pdireccion_domicilio_victima"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pdireccion_trabajo_victima"),
                        rs.getString("ptelefono_trabajo_victima"),
                        rs.getString("ptipo_agresion"),
                        rs.getString("pfrecuencia"),
                        rs.getString("plugar_agresion"),
                        rs.getDate("pfecha_agresion"),
                        rs.getString("phora_agresion"),
                        rs.getString("pasociacion_agresion"),
                        rs.getString("pobjeto_agresion"),
                        rs.getString("pestado_conciencia"),
                        rs.getString("papellidos_agresor"),
                        rs.getString("pnombres_agresor"),
                        rs.getInt("pedad_agresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("pdireccion_domicilio_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pdireccion_trabajo_agresor"),
                        rs.getString("ptelefono_trabajo_agresor"),
                        rs.getString("pparentesco"),
                        rs.getString("ptratamiento"),
                        rs.getString("pcaso_medico"),
                        rs.getString("preferido")
                );
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    public static ArrayList<SalaAcgda> obtenerDatos() throws Exception {
        ArrayList<SalaAcgda> lst = new ArrayList<SalaAcgda>();
        try {
            String sql = "select * from vif.select_spa()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<SalaAcgda> obtenerDatosDadoAnio(int anio) throws Exception {
        ArrayList<SalaAcgda> lst = new ArrayList<SalaAcgda>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.select_spa_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<SalaAcgda> obtenerDatosDadoAnioCircuito(int anio, String circuito) throws Exception {
        ArrayList<SalaAcgda> lst = new ArrayList<SalaAcgda>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.select_spa_dado_anio_circuito(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<SalaAcgda> obtenerDatosDadoAnioCircuitoGenero(int anio, String circuito, String sexo) throws Exception {
        ArrayList<SalaAcgda> lst = new ArrayList<SalaAcgda>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.select_spa_dado_anio_circuito_genero(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, circuito));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<SalaAcgda> obtenerDatosDadoAnioSubcircuito(int anio, String subcircuito) throws Exception {
        ArrayList<SalaAcgda> lst = new ArrayList<SalaAcgda>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.select_spa_dado_anio_subcircuito(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<SalaAcgda> obtenerDatosDadoAnioSubcircuitoGenero(int anio, String subcircuito, String sexo) throws Exception {
        ArrayList<SalaAcgda> lst = new ArrayList<SalaAcgda>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.select_spa_dado_anio_subcircuito_genero(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, subcircuito));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

}
