/* 
 * File:   utility.cpp
 * Author: denny86
 * 
 * Created on 3 giugno 2010, 18.54
 */

#include "utility.h"

utility::utility() {
}

utility::utility(const utility& orig) {
}

utility::~utility() {
}

string utility::intToString(int n){
    std::string s;
    std::stringstream out;
    out << n;
    s = out.str();
    return s;
}
