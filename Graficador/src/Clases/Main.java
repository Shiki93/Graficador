package Clases;

import Ventanas.Principal;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    
    static ArrayList<Paciente> pacientes = new ArrayList<>();
    static File archivo = null;
    static FileReader fr = null;
    static BufferedReader br = null;
    
    public static void cargarPacientes(){
        Paciente pac;
        String[] data;
        String nombre;
        String cedula;
        String sexo;
        String edad;
        String lugar;
        String referencia;
        boolean poli = false;
        boolean abandono = false;
        boolean epoc = false;
        boolean dm = false;
        boolean hta = false;
        boolean cardio = false;
        boolean irc = false;
        boolean demencia = false;
        boolean cancer = false;
        boolean osteo = false;
        boolean park = false;
        boolean avc = false;
        boolean inmovil = false;
        boolean valoracion = false;
        boolean otros = false;
        boolean alta = false;
        boolean nuevo = false;
        try {
            archivo = new File("C:\\Users\\oto_z\\Documents\\Programas\\Graficador\\Graficador\\Pacientes.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                data = line.split(",");
                nombre = data[0];
                cedula = data[1];
                sexo = data[2];
                edad = data[3];
                lugar = data[4];
                referencia = data[5];
                if("1".equals(data[6])){
                    poli = true;
                }
                if("1".equals(data[7])){
                    abandono = true;
                }
                if("1".equals(data[8])){
                    epoc = true;
                
                }
                if("1".equals(data[9])){
                    dm = true;
                }
                if("1".equals(data[10])){
                    hta = true;
                }
                if("1".equals(data[11])){
                    cardio = true;
                }
                if("1".equals(data[12])){
                    irc = true;
                }
                if("1".equals(data[13])){
                    demencia = true;
                }
                if("1".equals(data[14])){
                    cancer = true;
                }
                if("1".equals(data[15])){
                    osteo = true;
                }
                if("1".equals(data[16])){
                    park = true;
                }
                if("1".equals(data[17])){
                    avc = true;
                }
                if("1".equals(data[18])){
                    inmovil = true;
                }
                if("1".equals(data[19])){
                    valoracion = true;
                }
                if("1".equals(data[20])){
                    otros = true;
                }
                if("1".equals(data[21])){
                    alta = true;
                }
                if("1".equals(data[22])){
                    nuevo = true;
                }
                pac = new Paciente(nombre, cedula, sexo, edad, lugar, referencia, poli, abandono, 
                        epoc, dm, hta, cardio, irc, demencia, cancer, osteo, park, avc, inmovil, 
                        valoracion, otros, alta, nuevo);
                
                pacientes.add(pac);
            }
            JOptionPane.showMessageDialog(null, "Base de datos cargada.");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la base de datos.");
        }
        finally{
            try{
                if(null != fr) {
                    fr.close();
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en protocolo de cierre.");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cargarPacientes();
        Logica logica = new Logica();
        logica.setPacientes(pacientes);
        Principal prin = new Principal();
        prin.logica = logica;
        prin.pacientes = pacientes;
        prin.setVisible(true);
    }
    
}
