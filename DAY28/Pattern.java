package DAY28;

public class Pattern {
    public static void main(String[] args) {
        int n=4;

        for(int i=1;i<=n;i++){
              for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
             for (int j = 2; j <= i; j++) {
                System.out.print(j );
            }
            System.out.println();
        }
       }
      
    }







//butterfly  
    //    for(int i=1;i<=n;i++){
    //       for(int j=0;j<i;j++){
    //         System.out.print("*");
    //       }
       
    //        for(int j=0;j<2*(n-i);j++){
    //         System.out.print(" ");
    //       }
    //         for(int j=0;j<i;j++){
    //         System.out.print("*");
    //       }
    //     System.out.println();
    //    }
    //     for(int i=n;i>=1;i--){
    //       for(int j=0;j<i;j++){
    //         System.out.print("*");
    //       }
       
    //        for(int j=0;j<2*(n-i);j++){
    //         System.out.print(" ");
    //       }
    //         for(int j=0;j<i;j++){
    //         System.out.print("*");
    //       }
    //     System.out.println();
    //    }

    //diamond
    //    for(int i=0;i<n;i++){
    //        for(int j=0;j<n-i-1;j++){
    //         System.out.print(" ");
    //        }
    //        for(int j=0;j<=i;j++){
    //         System.out.print("*");
    //        }
    //         for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //        }
    //        System.out.println();

    //     }
    //       for(int i=n-1;i>=1;i--){
    //        for(int j=0;j<n-i;j++){
    //         System.out.print(" ");
    //        }
    //        for(int j=0;j<i;j++){
    //         System.out.print("*");
    //        }
    //         for(int j=1;j<i;j++){
    //         System.out.print("*");
    //        }
    //        System.out.println();

      
