package com.leedcode.arrays;

public class LongestCommonPrefix {
	    public String longestCommonPrefix(String[] strs) {
	        StringBuilder prefix=new StringBuilder();
	        if(strs.length>0){
	            for(int i=0;i<strs[0].length();i++){
	                char actual=strs[0].charAt(i);
	                for(int j=1;j<strs.length;j++){
	                    if(strs[j].length()>i){
	                        if(actual!=strs[j].charAt(i)){
	                            return prefix.toString();
	                        }
	                       
	                    }else{
	                         return prefix.toString();
	                    }

	                }
	                 prefix.append(actual);



	            }


	        }
	          return prefix.toString();
	    }
}
