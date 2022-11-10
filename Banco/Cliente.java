import java.util.Scanner;
public class Cliente {

    public static void main(String [] args){

        String name = "Marcelino Jimenez";
        int c = 8080;
        double e = 4554546.46;

        System.out.println("Bienvenido al banco humilde");
        Cuenta ct = new Cuenta();
        /*___________________________  MENU  _______________________________ */
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
         
        while(!salir){
             
            System.out.println("1. Ingresare todos los datos");
            System.out.println("2. Ingresare solo cuenta y efectivo");
            System.out.println("3. Ingresare solo efectivo");
            System.out.println("4. Ya estan mis datos");
            System.out.println("5. Salir");
             
            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();
             
            switch(opcion){
                case 1:
                    
                    System.out.println("Has seleccionado la opcion 1");
                    ct.datos_cliente();

                    while(!salir){
                            
                        System.out.println("1. Deposito");
                        System.out.println("2. Retiro");
                        System.out.println("3. Salir");
                            
                        System.out.println("Escribe una de las opciones");
                        opcion = sc.nextInt();
                            
                        switch(opcion){
                            case 1:
                                System.out.println("Has seleccionado Deposito");

                                ct.deposito();

                                break;
                            case 2:
                                System.out.println("Has seleccionado Retiro");

                                ct.retiro();

                                break;
                            case 3:
                                salir=true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 3");
                        }
                            
                    }

                    System.out.println("Descripcion de la operacion: \n");
                    System.out.println("Cliente: " +ct.cliente);
                    System.out.println("Cuenta: " +ct.cuenta);
                    System.out.println("Efectivo: " +ct.efectivo);
                    System.out.println("Operacion: " +ct.operacion);
                    System.out.println("Saldo: " +ct.saldo);

                    break;

                case 2:
                    
                    System.out.println("Has seleccionado la opcion 2");
                    ct.datos_cliente(name);

                    while(!salir){
                            
                        System.out.println("1. Deposito 1");
                        System.out.println("2. Retiro 2");
                        System.out.println("3. Salir");
                            
                        System.out.println("Escribe una de las opciones");
                        opcion = sc.nextInt();
                            
                        switch(opcion){
                            case 1:
                                System.out.println("Has seleccionado Deposito");

                                ct.deposito();

                                break;
                            case 2:
                                System.out.println("Has seleccionado Retiro");

                                ct.retiro();

                                break;
                            case 3:
                                salir=true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 3");
                        }
                            
                    }

                    System.out.println("Descripcion de la operacion: \n");
                    System.out.println("Cliente: " +name);
                    System.out.println("Cuenta: " +ct.cuenta);
                    System.out.println("Efectivo: " +ct.efectivo);
                    System.out.println("Operacion: " +ct.operacion);
                    System.out.println("Saldo: " +ct.saldo);

                    break;

                case 3:
                    
                    System.out.println("Has seleccionado la opcion 3");
                    ct.datos_cliente(name, c);

                    while(!salir){
                            
                        System.out.println("1. Deposito 1");
                        System.out.println("2. Retiro 2");
                        System.out.println("3. Salir");
                            
                        System.out.println("Escribe una de las opciones");
                        opcion = sc.nextInt();
                            
                        switch(opcion){
                            case 1:
                                System.out.println("Has seleccionado Deposito");

                                ct.deposito();

                                break;
                            case 2:
                                System.out.println("Has seleccionado Retiro");

                                ct.retiro();

                                break;
                            case 3:
                                salir=true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 3");
                        }
                            
                    }

                    System.out.println("Descripcion de la operacion: \n");
                    System.out.println("Cliente: " +name);
                    System.out.println("Cuenta: " +c);
                    System.out.println("Efectivo: " +ct.efectivo);
                    System.out.println("Operacion: " +ct.operacion);
                    System.out.println("Saldo: " +ct.saldo);

                    break;

                case 4: 
                    
                    System.out.println("Has seleccionado la opcion 4");
                    ct.datos_cliente(name, c, e);

                    while(!salir){
                            
                        System.out.println("1. Deposito 1");
                        System.out.println("2. Retiro 2");
                        System.out.println("3. Salir");
                            
                        System.out.println("Escribe una de las opciones");
                        opcion = sc.nextInt();
                            
                        switch(opcion){
                            case 1:
                                System.out.println("Has seleccionado Deposito");

                                ct.deposito();

                                break;
                            case 2:
                                System.out.println("Has seleccionado Retiro");

                                ct.retiro();

                                break;
                            case 3:
                                salir=true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 3");
                        }
                            
                    }
                    System.out.println("Descripcion de la operacion: \n");
                    System.out.println("Cliente: " +name);
                    System.out.println("Cuenta: " +c);
                    System.out.println("Efectivo: " +e);
                    System.out.println("Operacion: " +ct.operacion);
                    System.out.println("Saldo: " +ct.saldo);

                    break;

                 case 5:
                    salir=true;
                    break;

                 default:
                    System.out.println("Solo números entre 1 y 5");
            }
             
        }
        //ct.datos_cliente();
        //System.out.println("El nombre es :" + ct.cliente);

        //ct.datos_cliente(name);
        //ct.datos_cliente(name, c);
        //ct.datos_cliente(name, c, e);


        ct.deposito();

        System.out.println("Descripcion de la operacion: ");
        System.out.println("Cliente: " +ct.cliente);
        System.out.println("Cuenta: " +ct.cuenta);
        System.out.println("Efectivo: " +ct.efectivo);
        System.out.println("Operacion: " +ct.operacion);
        System.out.println("Saldo: " +ct.saldo);


        ct.retiro();

    }
}
