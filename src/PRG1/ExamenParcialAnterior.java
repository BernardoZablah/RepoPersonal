public class ExamenParcialAnterior {
    public static void main(String[] args) {
        final String TECHO_HOTEL = "====================================";
        final String SUELO_HOTEL = "==================================";
                                    
        final String VENTANA = " [ ] ";
        final String VENTANA_LUZ_APAGADA = " [º] ";
        final String VENTANA_LUZ_ENCENDIDA = " [*] ";
        final int HORAS_SEMANA = 168;
        final int PLANTAS_HOTEL = 7;
        int contadorHoras = 0;
        
        
        
        
            for(int i = 0; i <= PLANTAS_HOTEL; i++ ){
                for(int j = 0; j <= 6; j++)
                {
                    System.out.print(VENTANA);          
                }
                System.out.println();
            }
        
        }
    }
