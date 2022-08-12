package repeticionPresencial;

public class GrillaDePeliculas2 implements IGrillaDePeliculas2{
    @Override
    public Pelicula2 getPelicula(String nombrePelicula) throws PeliculaNoHabilitadaException2 {
        Pelicula2 pelicula = null;
        switch (nombrePelicula){
            case "pelicula uno":
                pelicula = new Pelicula2("pelicula uno", "Argentina", "www.cuevana.com/peliculauno");
                break;
            case "pelicula dos":
                pelicula = new Pelicula2("pelicula dos", "Brasil", "www.cuevana.com/peliculados");
                break;
            case "pelicula tres":
                pelicula = new Pelicula2("pelicula tres", "Colombia", "www.cuevana.com/peliculatres");
                break;
        }
        return pelicula;
    }
}
