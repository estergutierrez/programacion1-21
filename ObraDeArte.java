import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JFrame;

public class ObraDeArte {
 
  private static final int ANCHO = 1000;
  private static final int ALTO = 600;
  private static final int MIN = 0;
  private static final int MAX = 6;
  private static final int SUBMATRIZ = 10;
  private int[][] dibujo;
  private JFrame f;
  private BufferedImage imagen;

  public ObraDeArte(){
  
    imagen = new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
  
    getDibujo();
  

    //R * 256 *256 
    //0-255
    //G * 256
    //0-255
    //B
    //0-255


    for(int i=0;i<ANCHO;i++){
      for(int j=0;j<ALTO;j++){
        imagen.setRGB(i,j, dibujo[i][j]);
        /*switch (dibujo[i][j]) {
          case 0:
            imagen.setRGB(i, j, 255+256*256+255*256*256);
          break;
          case 1:
            imagen.setRGB(i, j, Color.BLACK.getRGB());
          break;
          case 2:
            imagen.setRGB(i, j, Color.RED.getRGB());
          break;
          case 3:
            imagen.setRGB(i, j, Color.BLUE.getRGB());
          break;
          case 4:
            imagen.setRGB(i, j, Color.YELLOW.getRGB());
          break;      
          default:
            imagen.setRGB(i, j, Color.GREEN.getRGB());
        } //switch
        */
      } //for
    } //for
 
    f = new JFrame("Mi obra de arte"){
    public void paint(java.awt.Graphics g){
        g.drawImage(imagen,0,0,null);
      } //paint
    }; //jframe
 
 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(ANCHO,ALTO);
    f.repaint();
    f.setVisible(true);
  }// constructor
 
  public void getDibujo(){
    dibujo = new int[ANCHO][ALTO];
    int aleatorio = 0;
    //for(int i=0;i<ANCHO;i+=SUBMATRIZ){
      for(int j=0;j<ALTO;j+=SUBMATRIZ){
        int rojo = (int)(Math.random()*256);
        int verde = (int)(Math.random()*256);
        int azul = (int)(Math.random()*256);
        aleatorio = azul + verde * 256 + rojo * 256*256; //MIN + (int)(Math.random() * (MAX - MIN));
        for (int k = 0; k < ANCHO; k++) {
          for (int m = 0; m < SUBMATRIZ; m++) {
            dibujo[k][m+j] = aleatorio; 
          }
        }
      //} //for 
    }
  } //getdibujo
 
  public static void main(String[] args){
    ObraDeArte o = new ObraDeArte();
  }
}

