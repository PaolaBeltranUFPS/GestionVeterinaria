public class Mascota
{
    private String nombre;
    private String especie;
    private String edad;
    private String raza;

    public Mascota(){
    }
    
    public Mascota(String nombre, String especie, String edad, String raza){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
    }
    
    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**GET Method Propertie especie*/
    public String getEspecie(){
        return this.especie;
    }

    /**SET Method Propertie especie*/
    public void setEspecie(String especie){
        this.especie = especie;
    }

    /**GET Method Propertie edad*/
    public String getEdad(){
        return this.edad;
    }

    /**SET Method Propertie edad*/
    public void setEdad(String edad){
        this.edad = edad;
    }

    /**GET Method Propertie raza*/
    public String getRaza(){
        return this.raza;
    }

    /**SET Method Propertie raza*/
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public String mostrarInfoMascota(){
        return ("Los datos de la mascota son: \n" + "Nombre: " + nombre +"\n" +"Especie: " + especie + "\n"+ "Edad: " + edad + "\n"+ "Raza: " + raza);
        /*System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);*/
    }
}