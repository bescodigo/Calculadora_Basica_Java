package Logica;

public class Operacion {
	
	/**
     *  Esta clase trata de proporcionar las caracteristicas basicas de una operación,
     *  siendo ésta compuesta por dos valores y un operador, 
     *  ademas de un resultado y un booleano para saber si el operador a sido ingresado.
     */
    	
        //  Valores que ingresa el usuario.
        public String num1;
        public String num2;

        //  Esos valores luego se convertiran en double.
        public double Dnum1;
        public double Dnum2;

        //  El operador.
        public String op;
        public boolean opActivado;

        
        public String resultado;



        //  El estado inicial de un objeto operación.
        public Operacion(){
        	
            num1 = "0";
            num2 = "0";
            op = "";
            opActivado = false;
            resultado = "0";
        }

        private void ConvertirADouble(){
        	
            Dnum1 = Double.parseDouble(num1);
            Dnum2 = Double.parseDouble(num2);
        }

        /** 
         * Metodos que componen las diferentes operaciones que se 
         * podran realizar con esta Operación.
         */
        public Double Suma() {
        	
            ConvertirADouble();
            return (Dnum1 + Dnum2);
        }

        public Double Resta(){
        	
            ConvertirADouble();
            return (Dnum1 - Dnum2);
        }

        public Double Division(){
        	
            ConvertirADouble();
            if (Dnum2 != 0)
            {
                return (Dnum1 / Dnum2);
            }
            return Dnum1;
        }

        public Double Multiplicar(){
        	
            ConvertirADouble();
            if (Dnum2 != 0)
            {
                return (Dnum1 * Dnum2);
            }
            return Dnum1;
        }

        public Double Porciento(){
        	
            ConvertirADouble();
            if (Dnum2 != 0)
            {
                return (Dnum1 * Dnum2) / 100;
            }
            return Dnum1;
        }

    }

