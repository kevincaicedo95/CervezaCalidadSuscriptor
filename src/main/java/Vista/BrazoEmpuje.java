package Vista;

public class BrazoEmpuje {
    public BrazoEmpuje(){};
    public void ActivarBrazo (String mensaje){
        if (mensaje.equals("Correcto")){
            System.out.println("La lata pasa a proceso de llenado");
        }
        else{
            System.out.println("Brazo mecanico activado");
        }
    }
}
