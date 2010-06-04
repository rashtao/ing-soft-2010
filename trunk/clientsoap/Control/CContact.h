/* 
 * File:   CContact.h
 * Author: denny86
 *
 * Created on 2 giugno 2010, 14.10
 */

#ifndef _CCONTACT_H
#define	_CCONTACT_H

#include <stdlib.h>
#include <string>
#include "../Presentation/PNewContact.h"
#include "../Presentation/PContactList.h"

using namespace std;

class CContact {
public:
    static CContact* getInstance();
    virtual ~CContact();
    bool addNewContact(string name, string surname, string tel, string mail);
    bool removeContact(int ID);
    bool searchContact(string searchFor, string toSearch);
private:
    static CContact* instance;
    CContact();
    CContact(const CContact& orig);
};

#endif	/* _CCONTACT_H */

