/* 
 * File:   PGroupList.cpp
 * Author: denny86
 * 
 * Created on 2 giugno 2010, 11.00
 */

#include "PGroupList.h"


PGroupList::PGroupList() {
    window=new Fl_Window(1000, 700);
    labGrp=new Fl_Box(90, 15, 400, 100, "Group List");
    labGrp->box(FL_NO_BOX);
    labGrp->labelfont(FL_BOLD+FL_ITALIC);
    labGrp->labelsize(26);
    grpList=new Fl_Hold_Browser(15, 120, 700, 500);
    delGrp=new Fl_Button(750, 200, 200, 50, "Rimuovi Gruppo");
    addGrp=new Fl_Button(750, 300, 200, 50, "Nuovo Gruppo");
    showGrp=new Fl_Button(750, 400, 200, 50, "Visualizza Gruppo");
    window->end();
}

PGroupList::PGroupList(const PGroupList& orig) {
}

PGroupList::~PGroupList() {
    window->~Fl_Window();
}

void PGroupList::show(bool toShow){
    if(toShow)
        window->show();
    else
        window->hide();
}

bool PGroupList::addGroup(string name){
    return true;
}

bool PGroupList::deleteGrp(string name){
    return true;
}

bool PGroupList::deleteGrp(int cod){
    return true;
}