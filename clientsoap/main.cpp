/* 
 * File:   main.cpp
 * Author: rashta
 *
 * Created on 14 maggio 2010, 11.23
 */

#include <stdlib.h>
#include "Presentation/PGroupList.h"
#include "Presentation/PNewGroup.h"
#include "Presentation/PContactList.h"
#include "Presentation/PNewContact.h"
#include "Presentation/PSearchContact.h"

/*
 * 
 */
int main(int argc, char** argv) {


    PContactList* cl=PContactList::getInstance();
    cl->show(true);


    return Fl::run();
}

