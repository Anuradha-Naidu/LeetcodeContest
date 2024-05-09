// Online C compiler to run C program online
#include<stdio.h>
int main(){
    int test;
    scanf("%d", &test);
    while(test --){
        int m,x,y, arr[10000],i,count=0;
        scanf("%d%d%d",&m,&x,&y);
        for(i=0;i<100;i++)
            arr[i] =0;
        
        while(m--){
            int cop,min,max;
            scanf("%d", &cop);
            min = cop-x*y;
            max = cop+x*y;
            min<1 ? min =1:min;
            max>100?max=100:max;
            for(i = min-1;i<max;i++)
                arr[i]=1;
            
        }
        for(i=0;i<100;i++)
            if(arr[i]==0)
                count++;
        printf("%d\n", count);
        
    }
    return 0;
}
