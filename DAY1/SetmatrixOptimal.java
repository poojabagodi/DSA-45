package DAY1;

public class SetmatrixOptimal {
    


    public static void main(String args[]){
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int n=matrix.length;
        int m=matrix[0].length;
        int col=-1;
     
     
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             if(matrix[i][j]==0){
                 matrix[0][j]=0;
                 if(j!=0){
                     matrix[i][0]=0;
                 }
                 else{
                     col=0;
                 }
             }
         }
     }
     
     
     for(int i=1;i<n;i++){
         for(int j=1;j<m;j++){
             if(matrix[i][0]==0 || matrix[0][j]==0){
                 matrix[i][j]=0;
             }
         }
     }
     
     if(col==0){
     for(int j=0;j<m;j++){
         
             matrix[0][j]=0;
         }
     }
     
      if(matrix[0][0] == 0){
     for(int i=0;i<n;i++){
        
             matrix[i][0]=0;
         }
     }
     
     
     for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    
    
    
}

}



