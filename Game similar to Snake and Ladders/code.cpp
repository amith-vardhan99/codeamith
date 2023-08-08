#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
int main()
{
    srand(time(0));
    int a,b,i,chanceA,chanceB,randA,randB;randA=0;randB=0;
    chanceA=1;chanceB=0;char c='0';int j=1;int k=1;int l=0;int u=0;int v=0;int ctr=1;int a1=0;
    int b1=0;
    a=0;b=0;int dec;
    while(1)
    {
        system("clear");
        printf(" ");
        printf("\n\n\n\n");
        if(a!=100 && b!=100)
        {
            if((a!=0 || b!=0))
            {
                if(chanceA==1 && chanceB==0)
                {
                    if(a==u)
                    {
                        printf("\n\n After player B threw the dice, the number that he/she got on it is %d\n\n\n",randB);
                    }
                    else
                    {
                        printf("\n\n\n\n\n");
                    }
                }
                if(chanceB==1 && chanceA==0)
                {
                    if(b==v)
                    {
                        printf("\n\n After player A threw the dice, the number that he/she got on it is %d\n\n\n",randA);
                    }
                    else
                    {
                        printf("\n\n\n\n\n");
                    }
                }
            }
            else if(a==0 && b==0)
            {
                printf("\n\n The game starts now\n\n\n");
            }
        }
        if(a==100 || b==100)
        {
            if(chanceA==1 && chanceB==0)
            {
                printf("\n\n After player B threw the dice, the number that he/she got on it is %d\n\n\n",randB);
            }
            if(chanceB==1 && chanceA==0)
            {
                printf("\n\n After player A threw the dice, the number that he/she got on it is %d\n\n\n",randA);
            }
        }
        printf(" ");
        for(i=100;i>=1;i--)
        {
            dec=(i-1)/10;
            if(dec%2==0 && i%10==0)
            {
                j=((dec*10)+1);
            }
            else if(dec%2!=0 && i%10==0)
            {
                j=i;
            }
            if(i>=91 && i<100)
            {printf(" ");}
            if(i<=90)
            {printf(" ");}
            if(j>=1 && j<10)
            {printf(" ");}
            if(a==j && b!=j)
            {printf("%d* ",j);}
            else if(b==j && a!=j)
            {printf("%d# ",j);}
            else if(b==j && a==j)
            {printf("%d*# ",j);}
            else
            {
                printf("%d ",j);
            }
            if((i-1)%10==0)
            {printf("\n\n");
                printf(" ");
            }
            if(dec%2==0)
            {
                j++;
            }
            else
            {
                j--;
            }
        }
        if(a==100)
        {
            sleep(3);
            system("clear");
            printf("\n\n\n Player A won!\n\n\n");
            printf(" ");
            printf("Press ENTER key to quit the game\n");
            printf(" ");
            c=getchar();
            system("clear");
            exit(0);
        }
        if(b==100)
        {
            sleep(3);
            system("clear");
            printf("\n\n\n Player B won!\n\n\n");
            printf(" ");
            printf("Press ENTER key to quit the game\n");
            printf(" ");
            c=getchar();
            system("clear");
            exit(0);
        }
        if(chanceA==1)
        {
            if(a1==0)
            {u=a;}
            if(a==u)
            {
                printf("\n\n\n\n\n\n\n");
                printf(" It's turn of player A.\n\n Player A, press ENTER key to throw the dice..\n");
                printf(" ");
                c=getchar();
                randA=((rand()%6)+1);
                u+=randA;
                if(u>100)
                {u-=randA;}
            }
            else
            {
                printf("\n\n\n\n\n\n\n\n\n\n");
            }
            if(a!=u)
            {usleep(250000);a++;}
            else
            {a=a;}
            a1++;
            if(a==u)
            {chanceB=1;chanceA=0;}
            continue;
        }
        else if(chanceB==1)
        {
            if(b1==0)
            {v=b;}
            if(v==b)
            {
                printf("\n\n\n\n\n\n\n");
                printf(" It's turn of player B.\n\n Player B, press ENTER key to throw the dice..\n");
                printf(" ");
                c=getchar();
                randB=((rand()%6)+1);
                v+=randB;
                if(v>100)
                {v-=randB;}
            }
            else
            {
                printf("\n\n\n\n\n\n\n\n\n\n");
            }
            if(b!=v)
            {usleep(250000);b++;}
            else
            {b=b;}
            b1++;
            if(b==v)
            {chanceA=1;chanceB=0;}
            continue;
        }
    }
    return 0;
}