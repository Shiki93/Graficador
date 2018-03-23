package Clases;

import java.util.ArrayList;

public class Logica {
    
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public Logica() {
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public boolean verifica(String cedula){
        boolean res = false;
        for(Paciente paciente : pacientes){
            if(paciente.getCedula().equals(cedula)){
                res = true;
            }
        }
        return res;
    }
    
    public int contarLugar(String lugar){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.getLugar().equals(lugar)){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarSexo(String sexo){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.getSexo().equals(sexo)){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarEdad(int a, int b){
        int total = 0;
        for(Paciente paciente : pacientes){
            int x = Integer.parseInt(paciente.getEdad());
            if(x >= a && x <= b){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarAltas(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isAlta()){
                total += 1;
            }
        }
        return total;
    }
    
    public int contarNoAltas(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(!paciente.isAlta()){
                total += 1;
            }
        }
        return total;
    }
    
    public int contarNuevos(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isNuevo()){
                total += 1;
            }
        }
        return total;
    }
    
    public int contarNoNuevos(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(!paciente.isNuevo()){
                total += 1;
            }
        }
        return total;
    }
    
    public int contarPoli(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isPoli()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarAbandono(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isAbandono()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarAvc(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isAvc()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarCancer(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isCancer()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarCardio(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isCardio()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarDemencia(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isDemencia()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarDm(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isDm()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarEpoc(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isEpoc()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarHta(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isHta()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarInmovil(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isInmovil()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarIrc(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isIrc()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarOsteo(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isOsteo()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarOtros(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isOtros()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarPark(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isPark()){
                total = total + 1;
            }
        }
        return total;
    }
    
    public int contarValoracion(){
        int total = 0;
        for(Paciente paciente : pacientes){
            if(paciente.isValoracion()){
                total = total + 1;
            }
        }
        return total;
    }
}
