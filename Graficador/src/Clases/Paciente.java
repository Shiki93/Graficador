package Clases;

import java.util.ArrayList;

/**
 *
 * @author oto_z
 */
public class Paciente {
    private String nombre;
    private boolean sexo;//0 Maculino 1 Femenino
    private int fec_Nac;//DDMMAA
    private int cedula;
    private String residencia;
    private ArrayList<Integer> enfermedades = new ArrayList<>();
    private ArrayList<Integer> medicinas = new ArrayList<>();

    public Paciente(String nombre, boolean sexo, int fec_Nac, int cedula, String residencia) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fec_Nac = fec_Nac;
        this.cedula = cedula;
        this.residencia = residencia;
    }
    
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    /**
     * @return the sexo
     */
    public boolean isSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the fec_Nac
     */
    public int getFec_Nac() {
        return fec_Nac;
    }

    /**
     * @param fec_Nac the fec_Nac to set
     */
    public void setFec_Nac(int fec_Nac) {
        this.fec_Nac = fec_Nac;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the residencia
     */
    public String getResidencia() {
        return residencia;
    }

    /**
     * @param residencia the residencia to set
     */
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    /**
     * @return the enfermedades
     */
    public ArrayList<Integer> getEnfermedades() {
        return enfermedades;
    }

    /**
     * @param enfermedades the enfermedades to set
     */
    public void setEnfermedades(ArrayList<Integer> enfermedades) {
        this.enfermedades = enfermedades;
    }

    /**
     * @return the medicinas
     */
    public ArrayList<Integer> getMedicinas() {
        return medicinas;
    }

    /**
     * @param medicinas the medicinas to set
     */
    public void setMedicinas(ArrayList<Integer> medicinas) {
        this.medicinas = medicinas;
    }
    
    
}
