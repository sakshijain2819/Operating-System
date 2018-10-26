#include<iostream>
using namespace std;
int main()
{
	int frame,n,pk[10],pq[10];
	
	cout<<"input page frame";
	cin>>frame;
	int ref[20];
	for(int i=0;i<10;i++)
	cin>>ref[i];
	int pg[frame],hit=0,miss=0,k=0;
	for(int i=0;i<10;i++)
	{
		int avail=0;
		for(int j=0;j<frame;j++)
		{
			if(avail==0)
    {
    	pg[k]=pq[i];
    	k=k+1;
    
	}	
		}
	}
	for(int i=0;i<frame;i++)
{
cout<<pq[i];

}
}
