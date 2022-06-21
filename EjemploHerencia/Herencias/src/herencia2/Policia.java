
package herencia2;

public class Policia extends Persona {

    private String rango;
    

    public Policia(String n, String a, int e, String mat) {
        super(n, a, e);
        setRango(mat);
    }

    public void setRango(String mat) {
        rango = mat;
    }

    public String getRango() {
        return rango;
    }

    @Override
    public String toString() {

        return String.format("%s"
                + "Rango: %s\n", super.toString(), getRango());
    }
}
