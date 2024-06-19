import java.util.ArrayList;

public class Gestion
{
    ArrayList <Mascota> mascotas = new ArrayList();
    private Mascota mascota;

    public Gestion(){
    }
    
    /**GET Method Propertie mascotas*/
    public java.util.ArrayList<Mascota> getMascotas(){
        return this.mascotas;
    }

    /**SET Method Propertie mascotas*/
    public void setMascotas(java.util.ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    /**GET Method Propertie mascota*/
    public Mascota getMascota(){
        return this.mascota;
    }

    /**SET Method Propertie mascota*/
    public void setMascota(Mascota mascota){
        this.mascota = mascota;
    }
    
    public void agregarMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }
    
    public void mostrarMascotas(){
        for(Mascota mascota: this.mascotas){
            mascota.mostrarInfoMascota();
        }
    }
}