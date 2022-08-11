package presencial;

public class GrillaDePeliculas implements IGrillaDePeliculas{
    @Override
    public Pelicula getPelicula(String nombrePelicula) throws PeliculaNoHabilitadaException {
        Pelicula pelicula = null;
        switch (nombrePelicula){
            case "peli1":
                pelicula= new Pelicula("peli1", "Brasil","www.peli1.org");
                System.out.println("la pelicula corresponde a Brasil");
                break;
            case "peli2":
                pelicula= new Pelicula("peli2", "Argentina","www.peli3.org");
                System.out.println("la pelicula corresponde a Argentina");
                break;
            case "peli3":
                pelicula= new Pelicula("peli3", "Colombia","www.peli2.org");
                System.out.println("la pelicula corresponde a Colombia");
                break;
            //control de una pelicula inexistente


        }
        return pelicula;
    }
}
