package repeticionPresencial;

public class IP2 {
    private int nro1;
    private int nro2;
    private int nro3;
    private int nro4;

    public IP2(int nro1, int nro2, int nro3, int nro4) {
        this.nro1 = nro1;
        this.nro2 = nro2;
        this.nro3 = nro3;
        this.nro4 = nro4;
    }

    public String getPais(){
        String respuesta ="";
        if(nro1>0 && nro1<50){
            respuesta = "Argentina";
        } else if (nro1<100) {
            respuesta = "Brasil";
        } else if (nro1<150){
            respuesta = "Colombia";
        }
        return respuesta;
    }

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public int getNro3() {
        return nro3;
    }

    public void setNro3(int nro3) {
        this.nro3 = nro3;
    }

    public int getNro4() {
        return nro4;
    }

    public void setNro4(int nro4) {
        this.nro4 = nro4;
    }
}
