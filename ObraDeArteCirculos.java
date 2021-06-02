import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JFrame;

public class ObraDeArteCirculos {
  
  private static final int ANCHO = 800;
  private static final int ALTO = 800;
  
  private int[][] dibujo = null;
  private int[][] dibujo2 = null;
  
  private JFrame f = null;
  private JFrame f2 = null;
  private BufferedImage imagen = null;
  private BufferedImage imagen2 = null;
  
  public ObraDeArteCirculos(){
    
    imagen = new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
    imagen2 = new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
    dibujo = new int[ANCHO][ALTO];
    dibujo2 = new int[ANCHO][ALTO];
    
    dibujarCirculosAleatorios(270,100,true);
    colorFade(0,100,0,50,100,550);
    dibujarEspiral(400,400,0, 12910000, 50);
    for(int i=0;i<ANCHO;i++){
      for(int j=0;j<ALTO;j++){
        imagen.setRGB(i, j, dibujo[i][j]);
        
      } //for
    } //for
    
    for(int i=0;i<ANCHO;i++){
      for(int j=0;j<ALTO;j++){
        imagen2.setRGB(i, j, dibujo2[i][j]);
        
      } //for
    } //for
    
    f = new JFrame("Mi obra de arte"){
      public void paint(java.awt.Graphics g){
        g.drawImage(imagen,0,0,null);
      } //paint
    }; //jframe
    
    f2 = new JFrame("Mi obra de arte Espiral"){
      public void paint(java.awt.Graphics g){
        g.drawImage(imagen2,0,0,null);
      } //paint
    }; //jframe
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(ANCHO,ALTO);
    f2.setSize(ANCHO,ALTO);
    f.repaint();
    f2.repaint();
    f.setVisible(true);
    f2.setVisible(true);
  }// constructor
  
  public void dibujarCirculosAleatorios(int cantidad, int tamMax, boolean rellenos)
  {
    for (int i = 0; i < cantidad; i++)
    {
      
      int tamMedios = tamMax/2 + 1;
      int xPos = (int)(Math.random()*(ANCHO-tamMax)+tamMedios);
      int yPos = (int)(Math.random()*(ALTO-tamMax)+tamMedios);
      int color = (int)(Math.random() * (255 + 255*255 + 255*255*255));
      dibujarCirculo(xPos, yPos, tamMax/2,color, rellenos);
    }
  }
  
  public void dibujarEspiral (int x, int y, int r, int color, int vueltas)
  {
    int veces = vueltas * 360;
    double x1, y1;
    double proporcion = 0.001;
    for(double angulo = 0; angulo < veces; angulo += 0.1)
    {
      x1 = (r+proporcion) * Math.cos(angulo * Math.PI / 180) ;
      y1 = (r+proporcion) * Math.sin(angulo * Math.PI / 180) ;
      //System.out.println("x1: " + x1 + " y1: " + y1)
      int posXFinal = (int)(x+x1);
      int posYFinal = (int)(y+y1);
      dibujo2[posXFinal][posYFinal] = color;
      proporcion += 0.002;
    }
    
  }
  public void colorFade (int r,int g, int b, 
                         int tam, 
                         int corrimiento, int veces)
  {
    //RGB value= Red + (Green*256) + (Blue*256*256)
    int rgb = 0 ;  
    int bounceR = 0;
    int bounceG = 1;
    int bounceB = 0;
    for (int i = 0 ; i < veces ; i++)
    {
      
      if ((g <= 0) || (g >= 255))
        bounceG *= -1;
      
      if ((r <= 0) || (r >= 255))
        bounceR *= -1;
      
      if ((b <= 0) || (b >= 255))
        bounceB *= -1;
      
      g += bounceG;
      r += bounceR;
      b += bounceB;
      //System.out.println("g: "+ g);
      rgb = g + (b * 256) + (r * 256 * 256);
      
      dibujarCirculo(corrimiento,corrimiento,tam,rgb, true);   
      
      //  tam-=10;
      corrimiento +=1;
      
    }
  }
  
  public void dibujarCuadro(int fI, int fF, int cI, int cF, int color)
  {
    for(int f = fI; f < fF; f++)
    {
      for (int c = cI ; c < cF; c++)
      {
        dibujo[f][c] = color; 
      }
    }
  }
  
  public void dibujarCirculo (int x, int y, int r, int color, boolean rellenar)
  {
    double x1, y1;
    
    for(double angulo = 0; angulo < 360; angulo += 1)
    {
      x1 = (r) * Math.cos(angulo * Math.PI / 180) ;
      y1 = (r) * Math.sin(angulo * Math.PI / 180) ;
      

      int posXFinal = (int)(x+x1);
      int posYFinal = (int)(y+y1);
      if (x + x1 < dibujo.length && y + y1 < dibujo[0].length){
        if (rellenar)
          dibujarLinea(x,y,posXFinal,posYFinal,color); 
        else
            dibujo[posXFinal][posYFinal] = color;
      }
      
    }
  }
  
  public void dibujarLinea(int fI, int cI, int fF, int cF, int color)
  {
    int fICopia = fI < fF ? fI: fF;
    fF = fI > fF ? fI: fF;
    fI = fICopia;
    int cICopia = cI < cF ? cI : cF;
    cF = cI > cF ? cI : cF;
    cI = cICopia;
    for(int f = fI; f < fF; f++)
    {
      for (int c = cI ; c < cF; c++)
      {
        dibujo[f][c] = color; 
      }
    }
    
  }
  
  public static void main(String[] args){
    ObraDeArteCirculos o = new ObraDeArteCirculos();
  }
}

