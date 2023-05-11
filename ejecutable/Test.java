package ejecutable;

import modelo.Fecha;

public class Test 
{
    public static void main(String[] args) 
    {
        Fecha f1Fecha=new Fecha(11, 5, 2023);
        System.out.println("Dia =" + f1Fecha.getDia());
        System.out.println("Mes =" + f1Fecha.getMes());
        System.out.println("Año =" + f1Fecha.getAnio());
        System.out.println(f1Fecha);
        

        Fecha f2Fecha=new Fecha(11, 5, 2023);
        System.out.println("Dia =" + f2Fecha.getDia());
        System.out.println("Mes =" + f2Fecha.getMes());
        System.out.println("Año =" + f2Fecha.getAnio());
        System.out.println(f2Fecha);

        if(f1Fecha.equals(f2Fecha))
        {
            System.out.println("son iguales");
        }
        else
        {
            System.out.println("no son iguales");
        }


    }

    
    
}
