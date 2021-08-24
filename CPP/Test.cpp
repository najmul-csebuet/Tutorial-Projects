#include <bits/stdc++.h>
#include "Stack.h"
#include "MyArray.h"
#include "MultiTypeGenerics.h"

using namespace std;

template<typename T>
inline T const &Max(T const &a, T const &b) {
    return a < b ? b : a;
}


template<class T>
inline T const &Max1(T const &a, T const &b) {
    return a < b ? b : a;
}


template<typename T>
T myMax(T a, T b) {
    return a > b ? a : b;
}

template<>
string myMax(string a, string b) {
    cout << "In template special\n";
    cout << a << ", " << b << endl;
    return "";
}


int refTest(int &a) {
    cout << a << endl;
    a = 2;
    return 0;
}

int refTest1(int *a) {
    cout << *a << endl;
    *a = 2;
    return 0;
}

int main() {

    cout << Max(1, 2) << endl;
    cout << Max(1.0, 2.2) << endl;
    cout << Max("C++", "Bis") << endl;

    cout << Max1(1, 2) << endl;
    cout << Max1(1.0, 2.2) << endl;
    cout << Max1<string>("C++", "Bismillah") << endl;

    try {
        Stack<int> stack_int;
        Stack<string> stack_string;

        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        cout << stack_int.top() << endl;
    }
    catch (exception const &ex) {
        cerr << ex.what() << endl;
    }


    cout << myMax(1, 222) << endl;
    cout << myMax<int>(1, 222) << endl;

    // template-specialization
    myMax<string>("Bismillah", "Alhamdulillah");
    cout << myMax<string>("Bismillah", "Alhamdulillah") << endl;

    int arr[5] = {1, 2, 3, 4, 5};
    MyArray<int> a(arr, 5);
    a.print();

    MultiTypeGenerics<char, char> multiTypeGenerics1;
    MultiTypeGenerics<int, double> multiTypeGenerics2;
    MultiTypeGenerics<long, string> multiTypeGenerics3;

    int aa = 10;
    refTest(aa);
    cout << aa << endl;

    int aa1 = 102;
    refTest1(&aa1);
    cout << aa1 << endl;

    return 0;
}