package ch03.cast;                                  
                                                    
// 本程式含有 compile error, 需要更正               
public class ExplicitCastNeeded {                   
  @SuppressWarnings("unused")
public static void main(String agrs[]) {          
     short s = 200 ;                                
//     s = s + 1 ;    // 此行有錯誤                    
                                                    
     byte b = 100 ;                                 
//     b = b + 1 ;    // 此行有錯誤                     
                                                    
     int i = 100 ;                                  
     i = i + 1 ;                                    
                                                    
//     float  area0 = 30 * 30 * 3.14 ;   // 此行有錯誤
                                                    
     double area1 = 30 * 30 * 3.14 ;                
  }                                                 
} 
