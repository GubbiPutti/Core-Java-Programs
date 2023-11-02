//#include<iostream.h>
//#include<conin.h>
#include<stdio.h>
int main()
{
//scanf("%d",&n);
for(int j=1;j<=2000;j++){
int n=j,count=0,rem=0,sum=0;
int n2=n;

while(n>0){
 n=n/10;
 count++;
}//while
int count2=count;
//printf("Count = %d %d\n",count,n);
for(int i=1;i<=count;i++)
{
    rem=n2%10;
    int mul=1;
    while(count2>0)
    {
        mul*=rem;
        count2--;
    }
       //printf("mul %d\n",mul);
    sum+=mul;
    // printf("mul %d\n",sum);
    n2=n2/10;
    count2=count;
}//for

if(j==sum)
{
    printf("Armstrong num %d\n",j);
}

}//j loop
//printf("%d",pow(2,3));

}//main
