
#include <iostream>
using namespace std;


int main()
{
    int no;
    cout << "Enter No. of Items" << endl;
    cin >> no;

    float p[no];
    float w[no];
    float r[no];
    float capacity;
    float finalx[no];

    for(int i=0;i<no;i++){
        finalx[i] = 0;
    }

    cout << "Enter Capacity" << endl;
    cin >> capacity;

    cout << "Enter Weights" << endl;
    for(int i=0;i<no;i++){
        float x;
        cin >> x;
        w[i] = x;
    }

    cout << "Enter Profits" << endl;
    for(int i=0;i<no;i++){
        float x;
        cin >> x;
        p[i] = x;
    }

    //Ratio
    for(int i=0;i<no;i++){
        r[i] = p[i]/w[i];
    }

    //Bubble Sort
    float temp = 0;
    for(int i=0;i<no;i++){
        for(int j=0;j<no-i-1;j++){
            if(r[j] < r[j+1]){
                //Sorting ratio
                temp = r[j];
                r[j] = r[j+1];
                r[j+1] = temp;

                temp = p[j];
                p[j] = p[j+1];
                p[j+1] = temp;

                temp = w[j];
                w[j] = w[j+1];
                w[j+1] = temp;

            }
        }
    }
    cout << "After Sorting : " << endl;
    for(int i=0;i<no;i++){
        cout << p[i] << " : " << w[i] << " : " << r[i]<< endl;
    }

    //VALUES
    for(int i=0;i<no;i++){

        if(capacity>0 && w[i]<capacity){
            capacity = capacity - w[i];
            finalx[i] = 1;
        }
        else{
            float x = capacity/w[i];
            capacity = capacity - x;
            finalx[i] = x;
            break;
        }
    }

    for(int i=0;i<no;i++){
        cout << finalx[i] << endl;
    }


    //Maximum Profit :
    float maxf = 0,maxw = 0;
    for(int i=0;i<no;i++){
        maxf = maxf + finalx[i]*p[i];
        maxw = maxw + finalx[i]*w[i];
    }
    cout << "Max Profit : " << maxf <<endl<< " Maximum Weight : " << maxw<< endl;

    return 0;
}
