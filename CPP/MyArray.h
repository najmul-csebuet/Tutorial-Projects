//
// Created by najmul on 8/24/21.
//

#ifndef CPP_MYARRAY_H
#define CPP_MYARRAY_H

template<typename T>
class MyArray {
private:
    T *ptr;
    int size;
public:
    MyArray(T arr[], int s);

    void print();
};

template<typename T>
MyArray<T>::MyArray(T arr[], int s) {
    ptr = new T[s];
    size = s;
    for (int i = 0; i < size; ++i) {
        ptr[i] = arr[i];
    }
}

template<typename T>
void MyArray<T>::print() {
    for (int i = 0; i < size; ++i) {
        cout << " " << *(ptr + i);
    }
    cout << endl;
}

#endif //CPP_MYARRAY_H
