package ch05.array;

public class TwoDimArray01 { 
    public static void main(String args[]) {
       int[][] ax00 = {{1,     2,   3, 5 ,6 }, 
                       {123, 111,   5, 5, 7}, 
                       {0,    20,   0, 9, 6},  
                       {19,   29,  39, 8, 100}}  ; 
       // 橫向加總(列)
       int sum = 0 ;               
       for (int x = 0 ; x < ax00.length; x++)  {
          sum = 0 ;
          for (int a = 0 ; a < ax00[x].length; a++)  {
             sum +=  ax00[x][a]; 
          }
          System.out.println("第" + x + "列的和=" + sum ) ;
       }

       System.out.println( ) ;
       System.out.println("=========================");
    
       // 縱向加總(行)
       for (int i = 0 ; i < ax00[0].length; i++)  {
           sum = 0 ;
           for (int v = 0 ; v < ax00.length; v++)  {
              sum +=  ax00[v][i]; 
           }
           System.out.println("第" + i + "行的和="+ sum ) ;
        }
      }
  }

