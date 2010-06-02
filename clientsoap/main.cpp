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

/*
 * 
 */
int main(int argc, char** argv) {

    PGroupList p;
    p.show(true);

    PNewGroup ng;
    ng.show(true);

    PContactList cl;
    PNewContact nc;

    return Fl::run();
}

