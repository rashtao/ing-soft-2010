/* 
 * File:   PGroupList.cpp
 * Author: denny86
 * 
 * Created on 2 giugno 2010, 11.00
 */

#include "PGroupList.h"
#include "PNewGroup.h"

PGroupList* PGroupList::instance=NULL;

void PGroupList::newGrp_callback(Fl_Widget* e, void* data){
    PNewGroup* ng=PNewGroup::getInstance();
    ng->show(true);
}

void PGroupList::deleteGrp_callback(Fl_Widget* e, void* data){
    PGroupList::getInstance()->deleteSelectedGrp();
}

PGroupList::PGroupList() {
    int data=0;
    window=new Fl_Window(1000, 700);
    labGrp=new Fl_Box(90, 15, 400, 100, "Group List");
    labGrp->box(FL_NO_BOX);
    labGrp->labelfont(FL_BOLD+FL_ITALIC);
    labGrp->labelsize(26);
    grpList=new Fl_Hold_Browser(15, 120, 700, 500);
    delGrp=new Fl_Button(750, 200, 200, 50, "Rimuovi Gruppo");
    delGrp->when(FL_WHEN_RELEASE);
    delGrp->callback(deleteGrp_callback, &data);
    addGrp=new Fl_Button(750, 300, 200, 50, "Nuovo Gruppo");
    addGrp->when(FL_WHEN_RELEASE);
    addGrp->callback(newGrp_callback, &data);
    showGrp=new Fl_Button(750, 400, 200, 50, "Visualizza Gruppo");
    window->end();
}

PGroupList::PGroupList(const PGroupList& orig) {
}

PGroupList::~PGroupList() {
    window->~Fl_Window();
}

PGroupList* PGroupList::getInstance(){
    if (instance==NULL)
        instance=new PGroupList();
    return instance;
}

void PGroupList::show(bool toShow){
    if(toShow)
        window->show();
    else
        window->hide();
}

void PGroupList::addGroup(string name){
    int data=0;
    grpList->add(name.data(), &data);
}

void PGroupList::deleteGrp(string name){
    if (CGroup::getInstance()->deleteGroup(name)){
        for (int i=grpList->size(); i>0; i--)
            if (grpList->text(i)==name)
                grpList->remove(i);
    }
}

void PGroupList::deleteSelectedGrp(){
    deleteGrp(grpList->text(grpList->value()));
}