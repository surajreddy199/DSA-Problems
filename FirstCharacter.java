public class FirstCharacter {
    
        public static void main(String args[]) {
            int i=0;
            String s="aabb";
    
            for(i=0;i<s.length()-1;i++){
                int count=0;
                for(int j=i+1;j<s.length();j++){
                    char ch1=s.charAt(i);
                    char ch2=s.charAt(j);
                    if(ch1==ch2)
                    count++;
                    // System.out.println(count);
                }
                if(count==0)
                System.out.println("index is "+ i);
            }
            
            
        }
    
    
}
