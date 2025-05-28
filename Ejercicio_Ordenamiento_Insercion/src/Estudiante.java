public class Estudiante {
    private String nombre;
    private float nota;
    private String carrera;

    public Estudiante(String nombre, float nota, String carrera) {
        this.nombre = nombre;
        this.nota = nota;
        this.carrera = carrera;
    }

    public float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Estudiante: " +
                "nombre: " + nombre +
                "nota: " + nota +
                "carrera: " + carrera + "\n";
    }
}
