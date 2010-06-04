/* 
 * File:   utility.h
 * Author: denny86
 *
 * Created on 3 giugno 2010, 18.54
 */

#ifndef _UTILITY_H
#define	_UTILITY_H

#include <stdlib.h>
#include <string>
#include <sstream>

using namespace std;

class utility {
public:
    utility();
    utility(const utility& orig);
    virtual ~utility();
    static string intToString(int n);
private:

};

#endif	/* _UTILITY_H */

