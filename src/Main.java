public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Enzo");
        p.setEdad(22);
        p.setTelefono("261345924");

        System.out.println(p.getNombre()+" "+p.getEdad()+" "+p.getTelefono());
    }
}