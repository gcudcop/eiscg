/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.ArrayList;

/**
 *
 * @author oscunach
 */
public class Distancia {

    public static ArrayList<String> obtenerDistancias() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("0 - 100 m");
        lst.add("101 - 200 m");
        lst.add("201 - 300 m");
        lst.add("301 - 400 m");
        lst.add("401 - 500 m");
        lst.add("501 - 1000 m");
        lst.add("1001 - 1999 m");
        lst.add("2000 - 2999 m");
        lst.add("Mas de 3000 m");
        return lst;

    }

}
