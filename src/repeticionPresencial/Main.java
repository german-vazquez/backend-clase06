package repeticionPresencial;

public class Main {
    public static void main(String[] args) {
        IP2 direccionIp = new IP2(22,22,22,22);
        GrillaDePeliculasProxy2 proxyDePrueba = new GrillaDePeliculasProxy2(direccionIp);
        String peliEnCuestion="pelicula dos";

        try {
            // solicito que me busque la pelicula en cuestion y me devuelva su link
            System.out.println(proxyDePrueba.getPelicula(peliEnCuestion).getLink());
        }catch (PeliculaNoHabilitadaException2 exception2){
            exception2.printStackTrace();
        }
    }
}
