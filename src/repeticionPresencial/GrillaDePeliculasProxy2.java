package repeticionPresencial;

public class GrillaDePeliculasProxy2 implements IGrillaDePeliculas2{
    private GrillaDePeliculas2 grilla;
    private IP2 dirIP;

    public GrillaDePeliculasProxy2(IP2 dirIP) {
        this.grilla = new GrillaDePeliculas2();
        this.dirIP = dirIP;
    }

    @Override
    public Pelicula2 getPelicula(String nombrePelicula) throws PeliculaNoHabilitadaException2 {
        Pelicula2 buscarPelicula = grilla.getPelicula(nombrePelicula);
        String origenIP = dirIP.getPais();
        String origenPelicula = buscarPelicula.getPais();

        if(origenPelicula.equals(origenIP)){
            return buscarPelicula;
        }else {
            throw new PeliculaNoHabilitadaException2(nombrePelicula + " pelicula no disponible para "+ dirIP.getPais());
        }
    }
}
