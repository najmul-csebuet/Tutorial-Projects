//
// Created by najmul on 8/24/21.
//

#ifndef CPP_MULTITYPEGENERICS_H
#define CPP_MULTITYPEGENERICS_H

template<class T, class U>
class MultiTypeGenerics {
    T x;
    U y;
public:
    MultiTypeGenerics() {
        cout << "Ctor" << endl;
    }
};


#endif //CPP_MULTITYPEGENERICS_H
