import java.util.* ;
public class MainMatrix {
	    public static final int DIM = 25;
		public static void main(String[] args) {
			char[][] M;
            M = new char[DIM][DIM];
            RiempiMatrice(M);
            StampaMatrice(M);
		}
		public static void StampaMatrice(char[][] M) {
			
			for (int i=0; i<DIM; i++) {
				 for (int j=0; j<DIM; j++) {
					  if(j==0) System.out.print(j+i+"|"+" ");	 	  
					  System.out.print(M[i][j]+" ");
			     }
				 System.out.println();
			}
		}
		public static void RiempiMatrice(char[][] M) {
			char val=97;
			for(int x=0;x<DIM;x++){
				val=(char) (97+x);
				for(int y=0;y<DIM;y++){
				    M[x][y]=val;
					if (y>=x)val++;
					//if(x==dim-1)M[dim-1][dim-1]=dim;
			    } 
		 
		    }
		    M[DIM-1][DIM-1]=val;
			
		}
}