public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    public Persona() {
        this.id = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String tel, String email) {
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String tel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int numeroPersonas() {
        return numeroPersonas;
    }

    public static void setNumeroPersonas(int numeroPersonas) {
        Persona.numeroPersonas = numeroPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", tel=" + tel +
                ", email=" + email +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", "8099532703", "juan@mail.com");
        System.out.println(persona1);
    }
}
