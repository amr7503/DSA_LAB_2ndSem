class Q4_PossibleStrings
  {
    public static void main(String[] args)
    {
      /*
      char[] ch={'C' , 'A' , 'R'};
      for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
          for(int k=0;k<3;k++)
            {
              if(i!=j && j!=k && i!=k)
            System.out.println(ch[i]+""+ch[j]+""+ch[k]);
            }
      */
      char[] ch={'C' , 'A' , 'R' , 'B' , 'O' , 'N'};
      for(int i=0;i<6;i++)
        for(int j=0;j<6;j++)
          for(int k=0;k<6;k++)
            for(int l=0;l<6;l++)
              for(int m=0;m<6;m++)
                for(int n=0;n<6;n++)
                  if(i!=j && i!=k && i!=l && i!=m && i!=n &&
                     j!=k && j!=l && j!=m && j!=n && 
                     k!=l   && k!=m   && k!=n && 
                     l!=m && l!=n && 
                     m!=n)
                    System.out.println(ch[i]+""+ch[j]+""+ch[k]+""+ch[l]+""+ch[m]+""+ch[n]);
                                       
    }
  }