
#include<iostream>
using namespace std;

void Merge(int *a,int low,int high,int mid){

    int i,j,k,temp[high+low-1];
    i = low;
    j = mid+1;
    k = 0;

    while(i <= mid && j <= high){
        if(a[i] < a[j]){
            temp[k] = a[i];
            i++;
            k++;
        }
        else{
            temp[k] = a[j];
            j++;
            k++;
        }
    }

    while(i <= mid){
            temp[k] = a[i];
            i++;
            k++;
    }

    while(j <= high){
            temp[k] = a[j];
            j++;
            k++;
    }
    for (i = low; i <= high; i++){
         a[i] = temp[i-low];
    }
}

void MergeSort(int *a, int low, int high)
{
    if (low < high)
    {
        int mid=(low+high)/2;

        MergeSort(a, low, mid);
        MergeSort(a, mid+1, high);

        Merge(a, low, high, mid);
    }
}
int main()
{
    int n, i;
    cout<<"Enter Elements ";
    cin>>n;
    int arr[n];
    for(i = 0; i < n; i++)
    {
        cout<<"Enter element "<<i+1<<": ";
        cin>>arr[i];
    }
    MergeSort(arr, 0, n-1);

    cout<<"Sorted Data :  ";
    for (i = 0; i < n; i++){
        cout<<arr[i]<< " : " ;
    }
    return 0;
}
