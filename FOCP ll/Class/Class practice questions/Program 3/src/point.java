import java.lang.Math;
 class point
 {
 	
       private double x;
       private double y;
       point()
       {
       	this.x=0;
       	this.y=0;
       }
       point(double x)
       {
          this.x=x;
          this.y=0;
       }
       point(double x, double y)
       {
          this.x=x;
          this.y=y;
       }

        
       public double getx()
       {
       	return this.x;
       }
       public void setx(double x)
       {
           this.x=x;
       }   

       public double gety()
       {
       	return this.y;
       }
       public void sety(double y)
       {
          this.y=y;
       }
         
         public double caldistance(point p1, point p2)
 	     {
             double dist=Math.sqrt(((p1.getx()-p2.getx())*(p1.getx()-p2.getx()))+((p1.gety()-p2.gety())*(p1.gety()-p2.gety())));
             return dist;
 	     }
 }