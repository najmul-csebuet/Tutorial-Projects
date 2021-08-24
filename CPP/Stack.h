//
// Created by najmul on 8/24/21.
//

#ifndef CPP_STACK_H
#define CPP_STACK_H

#include <vector>

using namespace std;

template<class T>
class Stack {
private:
    vector<T> elems;
public:
    void push(T const &);

    void pop();

    T top() const;

    bool empty() {
        return elems.empty();
    }
};

template<class T>
void Stack<T>::push(const T &elem) {
    elems.push_back(elem);
}

template<class T>
void Stack<T>::pop() {
    elems.pop_back();
}

template<class T>
T Stack<T>::top() const {
    T reference = elems.back();
    return reference;
}

#endif //CPP_STACK_H
