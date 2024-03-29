/*
 * Given two different positions on a chess board, find the least number of moves it would take a knight to get from one to the other. The positions will be passed as two arguments in algebraic notation. For example, knight("a3", "b5") should return 1.

The knight is not allowed to move off the board. The board is 8x8.

For information on knight moves, see https://en.wikipedia.org/wiki/Knight_%28chess%29

For information on algebraic notation, see https://en.wikipedia.org/wiki/Algebraic_notation_%28chess%29

(Warning: many of the tests were generated randomly. If any do not work, the test cases will return the input, output, and expected output; please post them.)*/

import java.util.ArrayList;

public class Chess {
	public static int knight(String start, String  finish) {
        // Your code here!
		String check="";
		int count=0;
		while(!check.equals(finish)) {
		ArrayList<String> arl = nextMove(start);
		for(String s : arl) {
			if(s.equals(finish) ) {
				check = finish;
				break;
			}
		}
			
			count++;
		
		for(int i=0; i<arl.size(); i++) {
			arl=	nextMove(arl.get(i).toString());
		}
		}
		
        return count;
	
	}

	private static ArrayList nextMove(String start) {
		String str="";
		int idxLe =0;
		int idxNum = 0;
      char[] le = {'a','b','c','d','e','f','g','h'};
      char[] nu = {'1','2','3','4','5','6','7','8'};
      char staLe = start.charAt(0);
      //System.out.println(staLe);
      char stNum = start.charAt(1);
      ArrayList res = new ArrayList();
      for(int i = 0; i<le.length;i++) {
    	  if(le[i]==staLe) {
    		   idxLe =i; 
     		 //System.out.println(idxLe);
    	  }
    	  if(stNum==nu[i]) {
    		   idxNum =i; 
    	  }
    	  
      }
      if(idxLe+1<8) {
    	  if(!(idxNum+2>7)) {
    		  char str1 = le[idxLe+1];
    		  char str2= nu[idxNum+2];
    		  str = ""+str1+str2;
    		  if(!res.contains(str)) {
    	  res.add(str);
    		  }
    	  //System.out.println(idxLe);
    	 //System.out.println("str: "+str);
      }
      }
      if(idxNum-2>=0) {
    	  if(!(idxLe+1>=8)) {
    		  char str1 = le[idxLe+1];
    		  char str2= nu[idxNum-2];
    		  str = ""+str1+str2;
    		  if(!res.contains(str)) {
    	    	  res.add(str);
    	    		  }  
    	  }
      }
      if(idxLe+2<8) {
    	  if(!(idxLe+1>=8)) {
    		  char str1 = le[idxLe+2];
    		  char str2= nu[idxNum+1];
    		  str = ""+str1+str2;
    		  if(!res.contains(str)) {
    	    	  res.add(str);
    	    		  }      }
      
    	  if(!(idxNum-1>7)) {
    		  char str1 = le[idxLe+2];
    		  char str2= nu[idxNum-1];
    		  str = ""+str1+str2;
    		  if(!res.contains(str)) {
    	    	  res.add(str);
    	    		  }      }
      }
      if(!(idxLe+1>=8)) {
    	  if(!(idxNum+2>7)) {
    		  char str1 = le[idxLe+1];
    		  char str2= nu[idxNum+2];
    		  str = ""+str1+str2;
    		  if(!res.contains(str)) {
    	    	  res.add(str);
    	    		  }      }
      }
      if(!(idxLe+1>=8)) {
    	  if(!(idxNum-2>7)) {
    		  char str1 = le[idxLe+1];
    		  char str2= nu[idxNum-2];
    		  str = ""+str1+str2;
    		  if(!res.contains(str)) {
    	    	  res.add(str);
    	    		  }      }
      }
      if(!(idxLe+2>7)) {
    	  if(!(idxLe+1>=8)) {
    		  char str1 = le[idxLe+2];
    		  char str2= nu[idxNum+1];
    		  str = ""+str1+str2;
    		  if(!res.contains(str)) {
    	    	  res.add(str);
    	    		  }      }
      }
      if(!(idxLe+2>7)) {
    	  if(!(idxNum-1>7)) {
    		  char str1 = le[idxLe+2];
    		  char str2= nu[idxNum-1];
    		  str = ""+str1+str2;
    		  if(!res.contains(str)) {
    	    	  res.add(str);
    	    		  }      }
      }

          if(idxLe-1>0) {
        	  if(!(idxNum+2>7)) {
        		  char str1 = le[idxLe-1];
        		  char str2= nu[idxNum+2];
        		  str = ""+str1+str2;
        		  if(!res.contains(str)) {
        	    	  res.add(str);
        	    		  }          }
          }
          if(idxLe-1>0) {
        	  if(!(idxNum-2>7)) {
        		  char str1 = le[idxLe-1];
        		  char str2= nu[idxNum-2];
        		  str = ""+str1+str2;
        		  if(!res.contains(str)) {
        	    	  res.add(str);
        	    		  }          }
          }
          if(idxLe-2>0) {
        	  if(!(idxLe+1>=8)) {
        		  char str1 = le[idxLe-2];
        		  char str2= nu[idxNum+1];
        		  str = ""+str1+str2;
        		  if(!res.contains(str)) {
        	    	  res.add(str);
        	    		  }          }
          }
          if(idxLe-2>0) {
        	  if(!(idxNum-1>7)) {
        		  char str1 = le[idxLe-2];
        		  char str2= nu[idxNum-1];
        		  str = ""+str1+str2;
        		  if(!res.contains(str)) {
        	    	  res.add(str);
        	    		  }          }
          }
          
          for(int i =0 ; i<res.size(); i++) {
        	  System.out.println(res.get(i));
          }
          return res;
	}
	public static void test() {
		System.out.println("count "+knight("a5","d6"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

}
