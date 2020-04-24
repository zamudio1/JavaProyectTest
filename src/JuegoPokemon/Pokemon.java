package JuegoPokemon;

import java.util.Random;

public abstract class Pokemon {
    protected String apodo;
    protected int salud;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int ataqueEspecial;
    protected int defensaEspecial;
    protected int nivel;
    protected int experiencia;
    public final static String ATAQUE1 = "Placaje";
    public final static float DAÑOATAQUE1 = 0.4f;
    public final static String ATAQUE2 = "Ataque rápido";
    public final static float DAÑOATAQUE2 = 0.4f;
    public final static String ATAQUEESPECIAL1 = "Hiper-rayo";
    public final static float DAÑOESPECIAL1 = 1.5f;
    public final static String ATAQUEESPECIAL2 = "Furia dragón";
    public final static float DAÑOESPECIAL2 = 0.4f;
    
    public Pokemon() {
        this.salud = 100;
        this.ataque = 20;
        this.defensa = 20;
        this.velocidad = 20;
        this.ataqueEspecial = 20;
        this.defensaEspecial = 20;
        this.apodo = "generic pokemon";
        this.nivel = 1;
        this.experiencia = 0;
    }
    
    public Pokemon(int salud, int ataque, int defensa, int velocidad,
            int ataqueEspecial, int defensaEspecial) {   
        this();
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;

    }
    
    public Pokemon(int salud, int ataque, int defensa, int velocidad,
            int ataqueEspecial, int defensaEspecial, int nivel, int experiencia) {      
        this(salud, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial);
        this.nivel = nivel;
        this.experiencia = experiencia;       
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String toString() {
        return "Pokemon{" + "apodo=" + apodo + ", salud=" + salud + ", ataque=" + ataque + ", defensa=" + defensa + ", velocidad=" + velocidad + ", ataqueEspecial=" + ataqueEspecial + ", defensaEspecial=" + defensaEspecial + ", nivel=" + nivel + ", experiencia=" + experiencia + '}';
    }
    
    private void recibirDaños(int ataqueEnemigo, String nombreAtaque) {
        int resta = 0;
        if(nombreAtaque.equals(ATAQUE1)){
            resta = (int)(ataqueEnemigo*DAÑOATAQUE1 - defensa);
        } else if(nombreAtaque.equals(ATAQUE2)){
            resta = (int)(ataqueEnemigo*DAÑOATAQUE2 - defensa);
        } else if(nombreAtaque.equals(ATAQUEESPECIAL1)){
            resta = (int)(ataqueEnemigo*DAÑOESPECIAL1 - defensaEspecial);
        } else if(nombreAtaque.equals(ATAQUEESPECIAL2)){
            resta = (int)(ataqueEnemigo*DAÑOESPECIAL2 - defensaEspecial);
        }   
        
        if(resta < 0) {
            resta = 1;
        }
        salud = salud - resta;     
    }
    
    public void atacar(Pokemon enemigo) {
        Random rand = new Random(); 
        int aleatorio = rand.nextInt(4) + 1;
        System.out.println(aleatorio);
        
        enemigo.recibirDaños(ataque, ATAQUE1);
    }
    
    public abstract void imprimirTipoPokemon();
    
}
