/* 
 * File:   PNewGroup.cpp
 * Author: denny86
 * 
 * Created on 2 giugno 2010, 11.58
 */

#include "PNewGroup.h"
#include "PGroupList.h"

PNewGroup::PNewGroup() {
    window=new Fl_Window(500, 300);
    labName=new Fl_Box(55, 10, 100, 50, "Nome Gruppo");
    labName->labelfont(FL_BOLD+FL_ITALIC);
    nameInput=new Fl_Input(15, 100, 275, 70);
    nameInput->textsize(18);
    crea=new Fl_Return_Button(325, 100, 150, 50, "Crea Gruppo");
    annulla=new Fl_Button(325, 200, 150, 50, "Annulla");
    window->end();
}

PNewGroup::PNewGroup(const PNewGroup& orig) {
}

PNewGroup::~PNewGroup() {
    window->hide();
    labName->~Fl_Widget();
    nameInput->~Fl_Input_();
    crea->~Fl_Widget();
    annulla->~Fl_Widget();
    window->~Fl_Window();
}

bool PNewGroup::createGroup(){
    return true;
}

void PNewGroup::show(bool toShow){
    if (toShow)
        window->show();
    else
        window->hide();
}