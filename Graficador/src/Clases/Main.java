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
            archivo = new File("Pacientes.txt");
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
                if(!"1".equals(referencia)){
                    referencia = "Interno";
                }
                else{
                    referencia = "Externo";
                }
                poli = false;
                if("1".equals(data[6])){
                    poli = true;
                }
                abandono = false;
                if("1".equals(data[7])){
                    abandono = true;
                }
                epoc = false;
                if("1".equals(data[8])){
                    epoc = true;
                }
                dm = false;
                if("1".equals(data[9])){
                    System.out.println("4. DM");
                    dm = true;
                }
                hta = false;
                if("1".equals(data[10])){
                    hta = true;
                }
                cardio = false;
                if("1".equals(data[11])){
                    cardio = true;
                }
                irc = false;
                if("1".equals(data[12])){
                    irc = true;
                }
                demencia = false;
                if("1".equals(data[13])){
                    demencia = true;
                }
                cancer = false;
                if("1".equals(data[14])){
                    cancer = true;
                }
                osteo = false;
                if("1".equals(data[15])){
                    osteo = true;
                }
                park = false;
                if("1".equals(data[16])){
                    park = true;
                }
                avc = false;
                if("1".equals(data[17])){
                    avc = true;
                }
                inmovil = false;
                if("1".equals(data[18])){
                    inmovil = true;
                }
                valoracion = false;
                if("1".equals(data[19])){
                    valoracion = true;
                }
                otros = false;
                if("1".equals(data[20])){
                    otros = true;
                }
                alta = false;
                if("1".equals(data[21])){
                    alta = true;
                }
                nuevo = false;
                if("1".equals(data[22])){
                    nuevo = true;
                }
                pac = new Paciente(nombre, cedula, sexo, edad, lugar, referencia, poli, abandono, 
                        epoc, dm, hta, cardio, irc, demencia, cancer, osteo, park, avc, inmovil, 
                        valoracion, otros, alta, nuevo);
                
                System.out.println("/////////////////////////");
                System.out.println("Nombre: " + nombre);
                System.out.println("Cedula: " + cedula);
                System.out.println("Sexo: " + sexo);
                System.out.println("Edad: " + edad);
                System.out.println("Lugar: " + lugar);
                System.out.println("Referencia: " + referencia);
                if(poli){
                    System.out.println("Polifarmacia");
                }
                if(abandono){
                    System.out.println("Abandono");
                }
                if(alta){
                    System.out.println("Dado de alta");
                }
                if(avc){
                    System.out.println("A.V.C.");
                }
                if(cancer){
                    System.out.println("Cancer");
                }
                if(cardio){
                    System.out.println("Cardiopata");
                }
                if(demencia){
                    System.out.println("Demencia");
                }
                if(dm){
                    System.out.println("D.M.");
                }
                if(epoc){
                    System.out.println("E.P.O.C.");
                }
                if(hta){
                    System.out.println("H.T.A.");
                }
                if(inmovil){
                    System.out.println("Paciente inmovil");
                }
                if(irc){
                    System.out.println("I.R.C.");
                }
                if(osteo){
                    System.out.println("Osteoporosis");
                }
                if(park){
                    System.out.println("Parkinson");
                }
                if(valoracion){
                    System.out.println("Valoración preoperatoria");
                }
                if(otros){
                    System.out.println("Otras enfermedades");
                }
                if(nuevo){
                    System.out.println("El paciente es nuevo");
                }
                
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
