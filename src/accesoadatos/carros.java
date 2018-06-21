package accesoadatos;

import java.sql.ResultSet;

public class carros {
    
    conexion cnx = new conexion();

    public void insertar(String codigo, String marca, String color, String modelo, String fecha, String tipo, String kilometraje) {
        cnx.UID("INSERT INTO carros(codigo,marca,color,modelo,fecha,tipo,kilometraje) VALUES('" + codigo + "','" + marca + "','" + color + "','" + modelo + "','" + fecha + "','" + tipo + "','" + kilometraje + "')");
    }
   
    public void modificar(String codigo, String marca, String color, String modelo, String fecha, String tipo, String kilometraje) {
        cnx.UID("UPDATE carros SET apellido1='" + marca + "',color'" + color + "',modelo='" + modelo + "',fecha='" + fecha + "',tipo='" + tipo + "',kilometraje='" + kilometraje + "' WHERE codigo='" + codigo + "'");
    }

    public void eliminar(String codigo) {
        cnx.UID("DELETE FROM carros WHERE codigo='" + codigo + "'");
    }

    public ResultSet buscar(String codigo) {
        return (cnx.getValores("SELECT * FROM carros WHERE codigo='" + codigo + "'"));
    }

    public ResultSet contarRegistros() {
        return (cnx.getValores("SELECT COUNT(codigo) FROM carros"));
    }

    public ResultSet mayorRegistro() {
        return (cnx.getValores("SELECT MAX(codigo) FROM carros"));
    }

    public ResultSet llenarTabla() {
        return (cnx.getValores("SELECT codigo,marca,modelo,kilometraje FROM carros"));
    }
}
