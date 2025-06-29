package DAY1;
// Use this editor to write, compile and run your Java code online

class SetmatrixBruteForce {
    //brute force approach
    //time complexity O(n*m*(n+m))
      public static void markrow(int i,int[][] matrix,int n,int m){
            for(int j=0;j<m;j++){
                if(matrix[i][j]!=0){
                     matrix[i][j]=-1;
                }
               
            }
        }
        
        public static void markcol(int j,int[][] matrix,int n,int m){
            for(int i=0;i<n;i++){
                 if(matrix[i][j]!=0){
                     matrix[i][j]=-1;
                }
            }
        }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int n=matrix.length;
        int m=matrix[0].length;
        //brute force
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    markrow(i,matrix,n,m);
                    markcol(j,matrix,n,m);
                }
            }
        }
       
        
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
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