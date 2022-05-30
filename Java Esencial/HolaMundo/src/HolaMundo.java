public class HolaMundo {
	    public static void main(String[] args) {
	        int dias = 0;
	        int meses = 0;

	        while (dias < 30) {
	            dias = dias + 1;
	            int semanas = dias / 7;
	            meses = meses + 1;
	            System.out.println("Han pasado " + dias + " días, lo que supone " + semanas + " semanas");
	            System.out.println("Han pasado " + meses + " meses");
	        }
	    }
	}
