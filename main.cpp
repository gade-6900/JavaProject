#include<bits/stdc++.h>

using namespace std;


int main() {

    int size = 0;
    string val;

    map<int, string> m;

for(int i = 0; i<5; i++){

    cout << "Enter size: ";
    cin >>  size;

    cout << "Enter value: ";
    cin >> val;

    push_back(size, val);
}

for(auto i: m){
    cout << i.first << i.second << endl;
}


    return 0;
}