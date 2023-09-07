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

/*
 DAA
knapsack
import java.util.Scanner;
public class Kanpsack 
{
 public static void main(String[] args) 
 {
 
 Scanner sc = new Scanner(System.in);
 int i,j,m,n;
 float temp;
 float p[] = new float[10];
 float w[] = new float[10];
 float c[] = new float[10];
 
 System.out.print("Enter No. of Objects: ");
 n = sc.nextInt();
 
 System.out.println("Enter Weights:");
 for(i=1;i<=n;i++)
 w[i] = sc.nextFloat();
 
 System.out.println("Enter Profits: ");
 for(i=1;i<=n;i++)
 p[i] = sc.nextFloat();
 
 System.out.println("Enter Knapsack Size");
 m = sc.nextInt();
 
 for(i=1;i<=n;i++)
 c[i] = p[i]/w[i];
 
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=n-i;j++)
 {
 
 if(c[j] < c[j+1])
 {
 temp = c[j];
 c[j] = c[j+1];
 c[j+1]= temp;
 
 temp = w[j];
 w[j] = w[j+1];
 w[j+1] = temp;
 
 temp = p[j];
 p[j] = p[j+1];
 p[j+1] = temp;
 }
 
 }
 }
 
 System.out.println("\n\tThe Items are arranged as \n");
 System.out.print("\n\tItems\tWeights\tProfits\tProfit/Weight\n\n");
 for(i=1;i<=n;i++)
 {
 System.out.println("\t"+i+"\t"+w[i]+"\t"+p[i]+"\t"+c[i]);
 }
 
 float x[] = new float[10];
 float U, profit = 0;
 U = m;
 for(i=1;i<=n;i++)
 x[i]=0;
 for(i=1;i<=n;i++)
 {
 if(w[i] > U) break;
 x[i]=1;
 U= U-w[i];
 }
 if(i<n)
 x[i] = U/w[i];
 System.out.println("\n\t The Solution Vector is : ");
 for(i=1;i<=n;i++)
 System.out.println("\n\t\tx["+i+"] = "+x[i]);
 
 for(i=1;i<=n;i++)
 profit = profit + (p[i] * x[i]);
 System.out.println("\n\t Maximum Profit = "+profit);
 }
}
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

prims
import java.util.Scanner;
public class Prims {
 public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
 int cost[][]= new int[10][10];
 int visited[] = new int[10];
 int i, j, n,ne = 1, a = 0, b = 0, u = 0, v = 0;
 int min,mincost = 0;
 System.out.println("Enter the Number of Nodes: ");
 n = sc.nextInt();
 System.out.println("Enter the Cost Matrix:");
 for(i=1; i<=n; i++)
 {
 for(j=1; j<=n; j++)
 {
 cost[i][j] = sc.nextInt();
 }
 } 
 for(i=1;i<=n;i++)
 visited[i] = 0;
 System.out.println("\n\n\t Prims Algorithm\n");
 System.out.println("\n\tThe Edges of Spanning Trees are: ");
 visited[1] = 1;
 while(ne<n)
 {
 min = 999;
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=n;j++)
 {
 if(cost[i][j] < min)
 {
 if(visited[i] == 0)
 continue;
 else
 {
 min = cost[i][j];
 a = u = i;
 b= v = j;
 }
 }
 }
 }
 
 
 if(visited[u] == 0 || visited[v] == 0)
 {
 System.out.println("\n\t"+ne+" Edge ["+a+","+b+"] = "+min);
 ne++;
 mincost += min;
 visited[b] = 1;
 }
 cost[a][b]=cost[b][a]=999;
 }
 System.out.println("\n\tMinimum Cost = "+mincost);
 }
}

xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


quicksort
import java.util.Random; 
import java.util.Scanner; 
public class Lab4
{
public static void main(String[] args)
{
int a[]= new int[100000];
Scanner in = new Scanner(System.in); 
long start, end;
System.out.println("*********QUICK SORT PROGRAM *********"); 
System.out.println("Enter the number of elements to be sorted");
int n = in.nextInt();
Random rand= new Random();
for(int i=0;i<n;i++)
{
a[i]=rand.nextInt(10000);
}
System.out.println("Array elements to be sorted are : "); 
for(int i=0; i<n; i++)
 System.out.println(a[i]+" ");
a[n]=9999;
start=System.nanoTime();
quicksort(a,0,n-1); end=System.nanoTime();
System.out.println("\nThe sorted elements are : "); 
for(int i=0; i<n; i++)
System.out.println(a[i]+" ");
 System.out.println("\nThe time taken to sort is"+(end-start)+"ns"); 
 double best = n*Math.log(n);
 double avg = best;
 double worst = n*n;
 System.out.print("\nBest Case = "+Math.round(best)+"\nAverage = "+Math.round(avg)+"\nWorst = 
"+Math.round(worst));
 System.out.println("\n******** ******************* *******");
}
static void quicksort(int a[],int p, int q)
{
int j;
if(p < q)
{
 j=partition(a,p,q); // partition array into parts 
 quicksort(a,p,j-1); // sort left part of array 
 quicksort(a,j+1,q); // sort right part of array
}
}
static int partition(int a[], int m, int p)
{
 int i, j;
 int v=a[m]; // first element is pivot element 
 i=m;
 j=p;
while(i <= j)
{
 while(a[i] <= v) i++; 
 while(a[j] > v) j--;
if(i < j)
 interchange(a,i,j); //swap the contents
}
a[m] = a[j]; a[j] = v;
return j;
}
static void interchange(int a[], int i, int j)
{
int p;
p = a[i]; a[i] = a[j];
a[j] = p;
}
}

xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


mergesort
import java.util.Random; 
import java.util.Scanner; 
public class Mergesorts
{
public static void main(String[] args)
{
int a[]= new int[100000];
Scanner in = new Scanner(System.in); 
long start, end;
System.out.println("****** MERGE SORT PROGRAM *********");
System.out.println("Enter the number of elements to be sorted");
int n = in.nextInt();
Random rand= new Random();
 for(int i=0;i<n;i++)
 a[i]=rand.nextInt(10000);
 System.out.println("Array elements to be sorted are : "); 
 for(int i=0; i<n; i++)
 System.out.println(a[i]+" ");
 start=System.nanoTime(); 
 mergesort(a,0,n-1);
 end=System.nanoTime();
System.out.println("\nThe sorted elements are : "); 
 for(int i=0; i<n; i++)
 System.out.println(a[i]+" ");
System.out.println("\nThe time taken to sort is "+(end-start)+" ns"); 
 double best = n*Math.log(n);
 double avg = best;
 double worst = best;
 System.out.print("\nBest Case = "+Math.round(best)+"\nAverage = "+Math.round(avg)+"\nWorst = 
"+Math.round(worst));
System.out.println("\n******** ********************** *******");
}
static void mergesort(int a[], int low, int high)
{
int mid; 
if(low < high)
{
mid = (low+high)/2; 
mergesort(a, low, mid);
mergesort(a, mid+1, high); 
merge(a, low, mid, high);
}
}
static void merge(int a[], int low, int mid, int high)
{
 int i, j, h, k, b[]= new int[100000];
 h=low;
 i=low;
 j=mid+1; 
 while((h<=mid) && (j<=high))
 {
 if(a[h] < a[j])
 {
 b[i] = a[h]; 
 h=h+1;
 }
 else
 {
 b[i]=a[j];
 j=j+1;
 }
 i = i+1;
 }
 
 if(h > mid)
 {
 for(k=j; k<=high; k++)
 {
 b[i] = a[k];
 i = i+1;
 }
 }
 else
 {
 for(k=h; k<=mid; k++)
 {
 b[i] = a[k];
 i = i+1;
 }
 }
 for(k=low; k<= high; k++) 
 a[k] = b[k];
 
}
}

xxxxxxxxxxxxxxxxxxxxxxxxxxxx

kruskal
import java.util.Scanner;
public class kruskalUnion
{
static int [] parent =new int [50];
static int [][]cost = new int [10][10];
static int a,b,i,j,u,v,n,min, noe=1, mincost=0;
static int find(int w)
{
while(parent[w] != 0)
w = parent[w];
return w;
}
static void union()
{
if(u != v)
{
noe++;
System.out.println(noe-1 + "Edge("+a+","+b+")="+min);
mincost += min;
parent[v] = u;
}
cost[a][b] = cost[b][a] = 999;
}
public static void main(String[] args)
{
Scanner read = new Scanner(System.in);
System.out.println("Enter the no. of vertices:");
n=read.nextInt();
System.out.println("Enter the cost adjacency matrix, 999 for no direct path:");
for(i = 1; i <= n; i++)
for(j=1; j<=n; j++)
cost[i][j]=read.nextInt();
while(noe < n)
{
min=999;
for(i=1; i<=n ; i++)
{
for(j=1; j<=n; j++)
{
if(cost[i][j] < min)
{
min = cost[i][j];
a = u = i;
b = v = j;
}
}
}
u = find(u);
v = find(v);
union();
}
System.out.println("minimum cost ="+mincost);
}
}

xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

dj
import java.util.*;
public class dj
{
public static void main(String[] args)
{
int i, j;
int dist[]=new int[10], visited[]=new int[10];
int cost[][]=new int[10][10], path[]=new int[10];
Scanner in = new Scanner(System.in);
System.out.println("**** DIJKSTRA'S ALGORITHM ******");
System.out.println("Enter the number of nodes: ");
int n = in.nextInt();
System.out.println("Enter the cost matrix");
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
cost[i][j] = in.nextInt();
System.out.println("The entered cost matrix is");
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
System.out.print(cost[i][j]+"\t");
}
System.out.println();
}
System.out.println("Enter the source vertex: ");
int sv = in.nextInt();
dij(cost,dist,sv,n,path,visited);
printpath(sv,n,dist,path,visited );
System.out.println("\n********* *************** *********");
}
static void dij(int cost[][],int dist[],int sv,int n,int path[],int visited[])
{
int count = 2,min,v=0;
for(int i=1; i<=n; i++)
{
visited[i]=0;
dist[i] = cost[sv][i];
if(cost[sv][i] == 999)
path[i] = 0;
else

path[i] = sv;
}
visited[sv]=1;
while(count<=n)
{
min = 999;
for(int w=1; w<=n; w++)
if((dist[w]< min) && (visited[w]==0))
{
    min = dist[w];
    v = w;
}
visited[v] = 1;
count++;

for(int w=1; w<=n; w++)
{
if((dist[w]) >(dist[v] + cost[v][w]))
{
dist[w] = dist[v] + cost[v][w]; path[w] = v;
}
}
}
}
static void printpath(int sv,int n,int dist[],int path[], int visited[])
{
for(int w=1; w<=n; w++)
{
if(visited[w] == 1 && w != sv)
{
System.out.println("The shortest distance between ");
System.out.println(sv+"-> ="+w+" is :"+ dist[w]);
int t=path[w];
System.out.println("The path is:");
System.out.print(" "+w);
while(t != sv)
{
System.out.print("<-->"+t);
t=path[t];
}
System.out.print("<-->"+sv);
}
}
}
}

xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

3way
import java.util.*;
public class Mergesort
{
 public static void mergeSort3Way(Integer[] gArray)
 {
 // if array of size is zero returns null
 if (gArray == null) return;
 // creating duplicate of given array
 Integer[] fArray = new Integer[gArray.length];
 // copying elements of given array into duplicate array
 for (int i = 0; i < fArray.length; i++)
 fArray[i] = gArray[i];
 // sort function
 mergeSort3WayRec(fArray, 0, gArray.length, gArray);
 // copy back elements of duplicate array to given array
 for (int i = 0; i < fArray.length; i++)
 gArray[i] = fArray[i];
 }
 public static void mergeSort3WayRec(Integer[] gArray,int low, int high, Integer[] destArray)
 {
 // If array size is 1 then do nothing
 if (high - low < 2)
 return;
 // Splitting array into 3 parts
 int mid1 = low + ((high - low) / 3);
 int mid2 = low + 2 * ((high - low) / 3) + 1;
 // Sorting 3 arrays recursively
 mergeSort3WayRec(destArray, low, mid1, gArray);
 mergeSort3WayRec(destArray, mid1, mid2, gArray);
 mergeSort3WayRec(destArray, mid2, high, gArray);
 // Merging the sorted arrays
 merge(destArray, low, mid1, mid2, high, gArray);
 }
 public static void merge(Integer[] gArray, int low, int mid1, int mid2, int high,Integer[] destArray)
 {
 int i = low, j = mid1, k = mid2, l = low;
 while ((i < mid1) && (j < mid2) && (k < high)) // choose smaller of the smallest in the three ranges
 {
 if (gArray[i].compareTo(gArray[j]) < 0)
 {
 if (gArray[i].compareTo(gArray[k]) < 0)
 destArray[l++] = gArray[i++];
 else
 destArray[l++] = gArray[k++];
 }
 else
 {
 if (gArray[j].compareTo(gArray[k]) < 0)
 destArray[l++] = gArray[j++];
 else
 destArray[l++] = gArray[k++];
 }
 }
while ((i < mid1) && (j < mid2)) // case where first and second ranges have remaining values
 {
 if (gArray[i].compareTo(gArray[j]) < 0)
 destArray[l++] = gArray[i++];
 else
 destArray[l++] = gArray[j++];
 }
while ((j < mid2) && (k < high)) // case where second and third ranges have remaining values
 {
 if (gArray[j].compareTo(gArray[k]) < 0)
 destArray[l++] = gArray[j++];
 else
 destArray[l++] = gArray[k++];
 }
while ((i < mid1) && (k < high)) // case where first and third ranges have remaining values
 {
 if (gArray[i].compareTo(gArray[k]) < 0)
 destArray[l++] = gArray[i++];
 else
 destArray[l++] = gArray[k++];
 }
 while (i < mid1) // copy remaining values from the first range
 destArray[l++] = gArray[i++];
 while (j < mid2) // copy remaining values from the second range
 destArray[l++] = gArray[j++];
 while (k < high) // copy remaining values from the third range
 destArray[l++] = gArray[k++];
 }
 public static void main(String args[])
 {
 Integer[] data = new Integer[] {45, -2, -45, 78,30, -42, 10, 19, 73, 93};
 mergeSort3Way(data);
 System.out.println("After 3 way merge sort: ");
 for (int i = 0; i < data.length; i++)
 System.out.print(data[i] + " ");
 }
}

xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx



TSP


public class Travellingsalesman {

   
    public static void main(String[] args) {
        
        int n=0;
        int c[][]=new int[10][10],tour[]=new int[10];
        Scanner in=new Scanner (System.in);
        int i,j,cost;
        System.out.println(" TSP Dynamic Programming");
        System.out.println("Enter the number of cities");
        n=in.nextInt();
        
        if(n==1)
        {
            System.out.println("Path not possible");
            System.exit(0);
        }
        System.out.println("Enter the cost matrix");
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                c[i][j]=in.nextInt();
                
            }
        }
        
        
        System.out.println("The entered cost matrix");
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
               System.out.print( c[i][j]+"\t");
                
            }
            System.out.println();
        }

        for(i=1;i<=n;i++)
            tour[i]=i;
        cost=tspdp(c,tour,1,n);
        System.out.println("The accurate path is");
        for(i=1;i<=n;i++)
            System.out.print(tour[i]+"->");
        System.out.println('1');
        System.out.println("The accurate min cost is : "+cost);


    }
    
    static int tspdp(int c[][],int tour[],int start,int n)
    {
        int mintour[]=new int[10],temp[]=new int[10],mincost=999,cost,i,j,k;
        
        if(start==n-1)
        {
            return(c[tour[n-1]][tour[n]]+c[tour[n]][1]);
            
        }
        
        for(i=start+1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
                temp[j]=tour[j];
            temp[start+1]=tour[i];
            temp[i]=tour[start+1];
            
            if(c[tour[start]][tour[i]]+(cost=tspdp(c,temp,start+1,n))<mincost)
            {
                mincost=c[tour[start]][tour[i]]+cost;
                for(k=1;k<=n;k++)
                    mintour[k]=temp[k];
            }
        }
        for(i=1;i<=n;i++)
            tour[i]=mintour[i];
        return mincost;
        
    }
    
    
    
}



BELLMAN


package javaapplication125;
import java.util.*;
public class bellman {
    private int distances[];
    private int n;
    public static final int MAX_VALUE=999;
    
    public bellman(int n)
    {
        this.n=n;
        distances=new int[n+1];
    }
    public void bellmanevaluation(int source,int c[][])
    {
       for(int node=1;node<=n;node++)
       {
           distances[node]=MAX_VALUE;
       }
       distances[source]=0;
       for(int node=1;node<=n-1;node++)
       {
           for(int sn=1;sn<=n;sn++)
           {
               for(int dn=1;dn<=n;dn++)
               {
                   if(c[sn][dn]!=MAX_VALUE)
                   {
                       if(distances[dn]>distances[sn]+c[sn][dn])
                           distances[dn]=distances[sn]+c[sn][dn];
                   }
               }
           }
       }
       for(int sn=1;sn<=n;sn++)
       {
           for(int dn=1;dn<=n;dn++)
           {
               if(c[sn][dn]!=MAX_VALUE)
               {
                   if(distances[dn]>distances[sn]+c[sn][dn])
                       System.out.println("The graph contains negative cycle");
               }
           }
       }
       for(int vertex=1;vertex<=n;vertex++)
       {
           System.out.println("distance of source "+source+"to"+vertex+"is"+distances[vertex]);
       }
    }
    public static void main(String args[])
    {
        int n=0;
        int source;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices");
        n=sc.nextInt();
        int c[][]=new int[n+1][n+1];
        System.out.println("Enter adj matrix");
        for(int sn=1;sn<=n;sn++)
        {
            for(int dn=1;dn<=n;dn++)
            {     
                c[sn][dn]=sc.nextInt();
                if(sn==dn)
                {
                    c[sn][dn]=0;
                    continue;
               }
                if(c[sn][dn]==0)
                {
                    c[sn][dn]=MAX_VALUE;
                }
           }
        }
        System.out.println("Enter the source vertex");
        source=sc.nextInt();
        bellman bellman=new bellman(n);
        bellman.bellmanevaluation(source,c);
        sc.close();
    }
}



xxxxxxxxxxxxxxxxxxx


floyds

import java.util.Scanner;
public class floyd
{
public static void main(String[] args)
{
int a[][]=new int[10][10];
int i, j;
Scanner in = new Scanner(System.in);
System.out.println("***********FLOYD'SALGORITHM**********");
System.out.println("Enter the number of vertices: ");
int n = in.nextInt();
System.out.println("Enter the adjacency matrix");
for (i=1; i<=n; i++)
for (j=1;j<=n;j++)
a[i][j] = in.nextInt();
System.out.println("Entered adjacency matrix is: ");
for(i=1;i<=n;i++)
{
for(j=1; j<=n; j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
floydalgo(a,n);
System.out.println("All pair shortest path matrix:");
for (i=1; i<=n; i++)
{
for (j=1; j<=n; j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
System.out.println("************ ********* **************");
}
static void floydalgo(int a[][],int n)
{
for (int k=1; k<=n; k++)
{
for (int i=1; i<=n; i++)
for (int j=1; j<=n; j++)
a[i][j] = min(a[i][j], a[i][k] + a[k][j]);
}
}
static int min(int a,int b)
{
if(a>b)
else
}
}
return b;
return a;
}}

xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

subset

import java.util.Scanner;
import java.util.Scanner;
public class Bushu
{
static int c=0;
public static void main(String[] args)
{
int w[]=new int[10];
int n, d, i, sum=0; 
int x[]=new int[10]; 
Scanner in=new Scanner(System.in);
System.out.println("********** SUBSET PROBLEM ************");
System.out.println("Enter the number of elements: "); 
n=in.nextInt();
System.out.println("Enter the elements in increasing order");
for(i=0;i<n;i++) 
w[i]=in.nextInt();
System.out.println("Enter the value of d: "); 
d=in.nextInt();
for(i=0;i<n;i++)
sum=sum+w[i]; 
System.out.println("SUM ="+sum);
if(sum < d || w[0] > d)
{
System.out.println("Subset is not possible ! "); 
System.out.println("********** *********** *************"); 
System.exit(0);
}
finalsubset(0,0,sum,x,w,d);
if(c==0)
System.out.println("Subset is not possible ! ");
System.out.println("\n********** ********* *************");
}
static void finalsubset(int cs, int k, int r,int x[],int w[],int d)
{
x[k] = 1;
if(cs+w[k] == d)
{
c++;
System.out.print("\n Solution "+c+" is {");
for(int i=0;i<=k;i++)
if(x[i] == 1)
{
System.out.print(w[i]+" ");
}
System.out.print("}");
}
else if((cs + w[k] + w[k+1]) <= d)
{
finalsubset(cs + w[k], k+1, r-w[k], x, w, d);
}
if((cs + r - w[k]) >= d && (cs + w[k+1]) <= d)
{
x[k] = 0;
finalsubset(cs, k+1, r-w[k], x, w, d);
}
}
}


xxxxxxxxxxxxxxxxxxxxxxxxxxxxx
import java.util.Scanner;
public class Hamiltonion {
static int [] x = new int [25];
static void Next_Vertex(int G[][],int n,int k)
{
int j; 
while(true)
{
x[k]=(x[k]+1)%(n+1);
if(x[k]==0) return;
if(G[x[k-1]][x[k]]!=0)
{
for(j=1;j<=k-1;j++)
{
if(x[j]==x[k]) break;
}
if(j==k)
{
if((k<n)||((k==n)&&(G[x[n]][x[1]]!=0))) return;
}
}
}
}
static void H_Cycle(int G[][],int n,int k)
{
int i;
while(true)
{
Next_Vertex(G,n,k); 
if(x[k]==0) return; 
if(k==n)
{
System.out.println("\n"); 
for(i=1;i<=n;i++)
System.out.print(x[i] +"-->");
 System.out.println(x[1]);
}
else
H_Cycle(G,n,k+1);
}
}
public static void main(String[] args) 
{ 
int i,j,n;
int [][] G = new int [25][25];
Scanner read = new Scanner(System.in); 
System.out.println("Enter the number of vertices of the graph"); 
n=read.nextInt();
System.out.println("Enter the Path adjacency matrix");
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
G[i][j]=read.nextInt();
x[i]=0;
}
} x[1]=1;
System.out.println(" \n Hamiltonian Cycles are");
H_Cycle(G,n,2);
}
}


 */
