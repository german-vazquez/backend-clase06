package presencial;

public class GrillaDePeliculasProxy implements IGrillaDePeliculas {
    private GrillaDePeliculas grilla;
    private IP dirIP;

    public GrillaDePeliculasProxy(IP dirIP) {
        this.grilla = new GrillaDePeliculas();
        this.dirIP = dirIP;
    }

    @Override
    public Pelicula getPelicula(String nombrePelicula) throws PeliculaNoHabilitadaException {
        // que el pais de la pelicula sea igual al pais de la dirección

        // buscar la película
        Pelicula peliculaBuscada = grilla.getPelicula(nombrePelicula);

        // comparar el factor común (en este caso pais)
        String origenPelicula = peliculaBuscada.getPais();
        String origenIP = dirIP.getPais();
        if (!origenPelicula.equals(origenIP)) {
            throw new PeliculaNoHabilitadaException(nombrePelicula + "no disponible para" + origenIP);
        } else {
            return peliculaBuscada;
        }
    }

        public GrillaDePeliculas getGrilla() {
            return grilla;
        }

        public void setGrilla (GrillaDePeliculas grilla){
            this.grilla = grilla;
        }

        public IP getDirIP () {
            return dirIP;
        }

        public void setDirIP (IP dirIP){
            this.dirIP = dirIP;
        }
    }

