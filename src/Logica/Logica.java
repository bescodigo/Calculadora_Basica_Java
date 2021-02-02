package Logica;

public class Logica {
	
	/**
     *  Manejo de los valores introducidos por el usuario. 
     *  Verifica si tiene que concatenar el valor introducido a num1 o a num2.
     */
    
        public Operacion operacion = new Operacion();

        public void valorIntroducido(String numIn)
        {
            if (operacion.opActivado == false)
            {
                operacion.num1 += numIn;

            }
            else
            {
                operacion.num2 += numIn;

            }

        }
}

