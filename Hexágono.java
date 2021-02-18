import java.awt.*;
import javax.swing.*;


public class Hexágono extends JPanel {
        
    public Hexágono() {        
        super.setPreferredSize( new Dimension( 400, 400 ) ); 
        super.setBackground( Color.YELLOW );
    }
    
    public void paintComponent( Graphics g ) {
        super.paintComponent(g); 
        int larguraTela = super.getWidth();
        int alturaTela = super.getHeight();
        
        int centroX = larguraTela / 2;
        int centroY = alturaTela  / 2;
        
        int raio = 100;
        double angulo = Math.PI / 3.0d;
                
        int[] vetorX = new int[ 6 ];
        int[] vetorY = new int[ 6 ];
        
        for( int i = 0; i < 6; i++ ) {
            double a = angulo * i;
            
            vetorX[i] = centroX + (int)Math.round( raio * Math.cos( a ) );
            vetorY[i] = centroY + (int)Math.round( raio * Math.sin( a ) );
            
        }        
        g.setColor(Color.BLUE);
        g.fillPolygon(vetorX, vetorY, 6);
        
        
        
    }
           
    public static void main(String[] args) {
        Hexágono painel = new Hexágono();
        
        JFrame f = new JFrame();
        f.setContentPane( painel ); 
        f.setTitle( "Hexágono" ); 
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 500, 500 ); 
        f.setLocationRelativeTo( f );                
        f.setVisible( true );
    }
    
}