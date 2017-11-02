import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.Scanner;
public class Plano extends JFrame{
	public Plano(){
		super("Grafica");
		setSize(1300,700);
		setVisible(true);
		setLocation(30,30);
	}	
	public void paint(Graphics g,int x1, int x2, int y1, int y2){
		//Coordenadas 0,0 : 650,350
		super.paint(g);
		
		
		
		g.setColor(Color.BLACK);
		g.drawLine(50,350,1250,350);
		g.drawLine(650,50,650,650);
		
		int i;
		
		for(i=0;i<1250;i++){
			
			i--;
			i=i+50;
			g.drawLine(i,345,i,355);
		
		}
		
		for(i=0;i<700;i++){
			
			i--;
			i=i+50;
			g.drawLine(645,i,655,i);
		
		}
		
		int xt1,xt2,yt1,yt2,xf1,xf2,yf1,yf2;

		xt1=x1*50;
		xt2=x2*50;
		yt1=y1*50;
		yt2=y2*50;

		xf1=650+xt1;
		xf2=650+xt2;
		yf1=350-yt1;
		yf2=350-yt2;
		
		g.setColor(Color.BLUE);
		g.drawLine(650,350,xf1,yf1);
		g.drawLine(650,350,xf2,yf2);
		
		/*g.setColor(Color.RED);
		int x=830, y=350;
		
		for(i=0;i<=9;i++){
			
			g.drawLine(650,350,x,y);
			x=x-20;
			y=y-20;
		
		} */
		
////////////////////////////////////////////////////////////////
		/*int x1=1,y1=1;
		int xv1=0,yv1=0,xv2=0,yv2=0;
		x1=(x1)*(50);
		y1=(y1)*(-50);
		int x1=0,y1=0;
		x2=650+x1;
		y2=350-y1;
		g.drawLine(650,350,x1,y1);
		x=(-1);
		y=-1;
		xd=x*50;
		xv1=x1+
		y=(y)*(-50);
		x1=650+x;
		y1=350-y;
		g.setColor(Color.RED);
		g.drawLine(650,350,x1,y1);*/



////////////////////////////////////////////////////////////////

		
	}
	
	public static void main(String[] args){
		
		int x1,x2,y1,y2;
		double m1,m2,d1,d2;
		Scanner l = new Scanner(System.in);

		System.out.printf("Coordenada x Vector 1: ");
		x1=l.nextInt();
		System.out.printf("\nCoordenada y Vector 1: ");
		y1=l.nextInt();
		System.out.printf("\nCoordenadas x Vector 2: ");
		x2=l.nextInt();
		System.out.printf("\nCoordenadas y Vector 2: ");
		y2=l.nextInt();

		m1=Math.sqrt((x1*x1)+(y1*y1));
		m2=Math.sqrt((x2*x2)+(y2*y2));
		System.out.printf("La magnitud del vector 1 es: "+m1);
		System.out.printf("\nLa magnitud del vector 2 es: "+m2);

		d1=y1;
		d1=d1/x1;
		d2=y2;
		d2=d2/x2;
		d1=Math.toDegrees(Math.atan(d1));
		d2=Math.toDegrees(Math.atan(d2));
		System.out.printf("\nLa direccion del vector 1 es: "+d1);
		System.out.printf("\nLa direccion del vector 2 es: "+d2);

		JFrame.setDefaultLookAndFeelDecorated(true);
		Plano p = new Plano();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
