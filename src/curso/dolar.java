package curso;

public class dolar {

      public static double IOF = 0.06;
      
      public static double DollarToReal (double ammont, double DollarPrice) {
    	  return ammont * DollarPrice * (1.0 + IOF);
      }
	
}
