package Clases;

public class Paciente {
    
    private String nombre;
    private String cedula;
    private String sexo;
    private String edad;
    private String lugar;
    private String referencia;
    private boolean poli;
    private boolean abandono;
    private boolean epoc;
    private boolean dm;
    private boolean hta;
    private boolean cardio;
    private boolean irc;
    private boolean demencia;
    private boolean cancer;
    private boolean osteo;
    private boolean park;
    private boolean avc;
    private boolean inmovil;
    private boolean valoracion;
    private boolean otros;
    private boolean alta;
    private boolean nuevo = false;

    public Paciente() {
    }

    public Paciente(String nombre, String cedula, String sexo, String edad, String lugar, 
                    String referencia, boolean poli, boolean abandono, boolean epoc, boolean dm, 
                    boolean hta, boolean cardio, boolean irc, boolean demencia, boolean cancer, 
                    boolean osteo, boolean park, boolean avc, boolean inmovil, boolean valoracion, 
                    boolean otros, boolean alta, boolean nuevo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.edad = edad;
        this.lugar = lugar;
        this.referencia = referencia;
        this.poli = poli;
        this.abandono = abandono;
        this.epoc = epoc;
        this.dm = dm;
        this.hta = hta;
        this.cardio = cardio;
        this.irc = irc;
        this.demencia = demencia;
        this.cancer = cancer;
        this.osteo = osteo;
        this.park = park;
        this.avc = avc;
        this.inmovil = inmovil;
        this.valoracion = valoracion;
        this.otros = otros;
        this.alta = alta;
        this.nuevo = nuevo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the ligar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the ligar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the poli
     */
    public boolean isPoli() {
        return poli;
    }

    /**
     * @param poli the poli to set
     */
    public void setPoli(boolean poli) {
        this.poli = poli;
    }

    /**
     * @return the abandono
     */
    public boolean isAbandono() {
        return abandono;
    }

    /**
     * @param abandono the abandono to set
     */
    public void setAbandono(boolean abandono) {
        this.abandono = abandono;
    }

    /**
     * @return the epoc
     */
    public boolean isEpoc() {
        return epoc;
    }

    /**
     * @param epoc the epoc to set
     */
    public void setEpoc(boolean epoc) {
        this.epoc = epoc;
    }

    /**
     * @return the dm
     */
    public boolean isDm() {
        return dm;
    }

    /**
     * @param dm the dm to set
     */
    public void setDm(boolean dm) {
        this.dm = dm;
    }

    /**
     * @return the hta
     */
    public boolean isHta() {
        return hta;
    }

    /**
     * @param hta the hta to set
     */
    public void setHta(boolean hta) {
        this.hta = hta;
    }

    /**
     * @return the cardio
     */
    public boolean isCardio() {
        return cardio;
    }

    /**
     * @param cardio the cardio to set
     */
    public void setCardio(boolean cardio) {
        this.cardio = cardio;
    }

    /**
     * @return the irc
     */
    public boolean isIrc() {
        return irc;
    }

    /**
     * @param irc the irc to set
     */
    public void setIrc(boolean irc) {
        this.irc = irc;
    }

    /**
     * @return the demencia
     */
    public boolean isDemencia() {
        return demencia;
    }

    /**
     * @param demencia the demencia to set
     */
    public void setDemencia(boolean demencia) {
        this.demencia = demencia;
    }

    /**
     * @return the cancer
     */
    public boolean isCancer() {
        return cancer;
    }

    /**
     * @param cancer the cancer to set
     */
    public void setCancer(boolean cancer) {
        this.cancer = cancer;
    }

    /**
     * @return the osteo
     */
    public boolean isOsteo() {
        return osteo;
    }

    /**
     * @param osteo the osteo to set
     */
    public void setOsteo(boolean osteo) {
        this.osteo = osteo;
    }

    /**
     * @return the park
     */
    public boolean isPark() {
        return park;
    }

    /**
     * @param park the park to set
     */
    public void setPark(boolean park) {
        this.park = park;
    }

    /**
     * @return the avc
     */
    public boolean isAvc() {
        return avc;
    }

    /**
     * @param avc the avc to set
     */
    public void setAvc(boolean avc) {
        this.avc = avc;
    }

    /**
     * @return the inmovil
     */
    public boolean isInmovil() {
        return inmovil;
    }

    /**
     * @param inmovil the inmovil to set
     */
    public void setInmovil(boolean inmovil) {
        this.inmovil = inmovil;
    }

    /**
     * @return the valoracion
     */
    public boolean isValoracion() {
        return valoracion;
    }

    /**
     * @param valoracion the valoracion to set
     */
    public void setValoracion(boolean valoracion) {
        this.valoracion = valoracion;
    }

    /**
     * @return the otros
     */
    public boolean isOtros() {
        return otros;
    }

    /**
     * @param otros the otros to set
     */
    public void setOtros(boolean otros) {
        this.otros = otros;
    }

    /**
     * @return the alta
     */
    public boolean isAlta() {
        return alta;
    }

    /**
     * @param alta the alta to set
     */
    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    /**
     * @return the nuevo
     */
    public boolean isNuevo() {
        return nuevo;
    }

    /**
     * @param nuevo the nuevo to set
     */
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    
    public void imprimir(){
        System.out.println("//////////////////////////");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad + " edad");
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
    }
    
}
