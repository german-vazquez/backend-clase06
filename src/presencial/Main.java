package presencial;

public class Main {
    public static void main(String[] args) {
        IP direccion= new IP(47,98,52,74);
        GrillaDePeliculasProxy proxy = new GrillaDePeliculasProxy(direccion);
        String pelicula="peli2";

        //mostrar el link

        try{
            System.out.println(proxy.getPelicula(pelicula).getLink());
        }
        catch (PeliculaNoHabilitadaException exception){
            exception.printStackTrace();
        }
    }
}
