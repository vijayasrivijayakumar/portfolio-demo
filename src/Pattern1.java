class Pattern1{
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
        int count=0;
         
          for(int a=2;a<i;a++)
          {
              if(i % a == 0)
              {
                  count=1;
                  
              }
          }
          if(count==0)
          {
              System.out.println(i);
          }
            
        }
        
    }
}