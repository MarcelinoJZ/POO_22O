public class TouchPad {
    String opcion;


    public void touch(int opc){
        switch(opc){
            case 1:
                opcion = "No tiene TouchPad";
                break;
            case 2:
                opcion = "Si tiene TouchPad";
                break;
        }
    }
    
}// Fin de la clase TouchPad
