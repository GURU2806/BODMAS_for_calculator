//check the intermediate results if not getting correct answer by removing comments having "for debugging code".
public class BODMAS
  {
	static String div(String v,int x)
	{
         String s="";int y=0;int z=0;int temp1=0,temp2=v.length();
	 for(int i=x-1;i>=0;i--)
	     {
                if(v.charAt(i)!='+'&&v.charAt(i)!='-'&&v.charAt(i)!=' ')
                 {
                  s=v.charAt(i)+s;
                 }
                else
                 {
                  temp1=i;
		  y=Integer.parseInt(s);
                  break;
 	 	 }
              }
          s="";
 
          for(int i=x+1;i<v.length();i++)
             {
                if(v.charAt(i)!='+'&&v.charAt(i)!='-'&&v.charAt(i)!='%'&&v.charAt(i)!=' '&&v.charAt(i)!='/'&&v.charAt(i)!='*')
                 {
                  s=s+v.charAt(i);
                 }
                else
                 { 
                  temp2=i;
                  z=Integer.parseInt(s);
                  break;
                 }
              }

	   s="";

           int res=y/z;
          //System.out.println(res);..>for debugging code

          for(int i=0;i<=temp1;i++)
            s=s+v.charAt(i);
     
          s=s+res;
          
          for(int i=temp2;i<v.length();i++)
            s+=v.charAt(i);

          return s;
         }
 
        static String rem(String v,int x)
         {
	  String s="";int y=0;int z=0;int temp1=0,temp2=v.length();
 	  for(int i=x-1;i>=0;i--)
	    {
 	     if(v.charAt(i)!='+'&&v.charAt(i)!='-'&&v.charAt(i)!=' ')
              {
               s=v.charAt(i)+s;
              } 
             else
              {
               temp1=i;
               y=Integer.parseInt(s);
               break;
              }
             }

           s="";
 
           for(int i=x+1;i<v.length();i++)
              {
              if(v.charAt(i)!='+'&&v.charAt(i)!='-'&&v.charAt(i)!='/'&&v.charAt(i)!=' ')
                {
                 s=s+v.charAt(i);
                }
              else
                {
                 temp2=i;
                 z=Integer.parseInt(s);
                 break;
                }
               } 
              
            s="";

            int res=y%z;
           
            for(int i=0;i<=temp1;i++)
             s=s+v.charAt(i);
       
            s=s+res;

            for(int i=temp2;i<v.length();i++)
             s+=v.charAt(i);
 	 
            return s;
          }
 
	   static String multi(String v,int x)
            {
	    String s="";int y=0;int z=0;int temp1=0,temp2=v.length();
	    for(int i=x-1;i>=0;i--)
 	     {
	      if(v.charAt(i)!='+'&&v.charAt(i)!='-'&&v.charAt(i)!=' ')
 	       {
		s=v.charAt(i)+s;
	       }
	     else
	       {
		temp1=i;
		y=Integer.parseInt(s);
		break;
	       }
	     }

	   s="";

 	   for(int i=x+1;i<v.length();i++)
	    {
             if(v.charAt(i)!='+'&&v.charAt(i)!='-'&&v.charAt(i)!='/'&&v.charAt(i)!='%'&&v.charAt(i)!=' '&&v.charAt(i)!='*')
	      {
               s=s+v.charAt(i);
	      }
	     else
	      {
	       temp2=i;
               z=Integer.parseInt(s);
               break;
              }
             }

 	   s="";

 	  int res=y*z;
          //System.out.println(res);...>for debugging code

         for(int i=0;i<=temp1;i++)
           s=s+v.charAt(i);
         
         s=s+res;

         for(int i=temp2;i<v.length();i++)
           s+=v.charAt(i);

         return s;
        }

        static String add(String v,int x)
	 {
	   String s="";int y=0;int z=0;int temp1=0,temp2=v.length();int j=0;
	     for(j=x-1;j>=0;j--)
                {
		 if(v.charAt(j)!=' ')
 		  {
	            s=v.charAt(j)+s;
		  }
		 else
		  {
		    temp1=j;
 		    y=Integer.parseInt(s);
                  }
                 }

 	    s="";
	     
            for(int i=x+1;i<v.length();i++)
 	      {
		if(v.charAt(i)!='+'&&v.charAt(i)!='-'&&v.charAt(i)!=' ')
		  {
		    s=s+v.charAt(i);
		  }
		else
		  {
 		    temp2=i;
       		    z=Integer.parseInt(s);
 	 	    break;
                   }
                 }

              s="";

              int res=y+z;

              for(int i=0;i<=temp1;i++)
                s=s+v.charAt(i);

              s=s+res;

              for(int i=temp2;i<v.length();i++)
                s+=v.charAt(i);

              return s;
             }

 	   static String sub(String v,int x)
	      {
               String s="";int y=0;int z=0;int temp1=0,temp2=v.length();int j=0;	
		for(j=x-1;j>=0;j--)
	         {
                  if(v.charAt(j)!=' ')
	           {
                    s=v.charAt(j)+s;
                   }
                else
                  {
                    temp1=j;
                     y=Integer.parseInt(s);
                   }
                  }

               s="";

               for(int i=x+1;i<v.length();i++)
                 {
                   if(v.charAt(i)!='+'&&v.charAt(i)!='-'&&v.charAt(i)!=' ')
                    {
                     s=s+v.charAt(i);
                    }
                   else
		    {
 		     temp2=i;
                     break;
                    }
                   }

                s="";

               int res=y-z;
             
               for(int i=0;i<=temp1;i++)
                 s=s+v.charAt(i);
              
               s=s+res;

               for(int i=temp2;i<v.length();i++)
                 s+=v.charAt(i);

               
              return s;
             }
 
           public static void main(String ...s2)
	   //public static String  conv(String s1)...>if used as a function in other program
           {
            String s1="10+20*20/100*2";//...>try another combination and check the result
            String s=" "+s1+" ";int c=0;int flag=0;int temp;
 	    for(int i=0;i<s.length();i++)
              { 
               if(s.charAt(i)=='/'||s.charAt(i)=='%'||s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*')
                c=c+1;
              }
            while(c>0)
             { 
               for(int i=0;i<s.length();i++)
                 {
                  flag=0;
                  if(s.charAt(i)=='/')
                    {
                      temp=i;flag=1;
                      s=div(s,temp);
                      //System.out.println(s);...>for debugging code
                      break;
                     }
                   if(s.charAt(i)=='%')
                     {
		       temp=i;flag=1;
                       s=rem(s,temp);
                       break;
                     }
                    if(s.charAt(i)=='*')
                     {
                       temp=i;flag=1;
                        s=multi(s,temp);
                        break;
                      } 
                     }
                if(flag==0)
                  {
                   for(int i=0;i<s.length();i++)
                      {
                       if(s.charAt(i)=='+')
                         {
                           temp=i;flag=0;
                           s=add(s,temp);
                           break;
                          }
                       if(s.charAt(i)=='-')
                          {
                            temp=i;
                            flag=0;
                            s=sub(s,temp);
                            break;
                           }
                        } 
                     }

               c=c-1;
              }

        System.out.println("ANSWER IS :"+s);
       }
}

