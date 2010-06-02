/* 
 * File:   PContactList.cpp
 * Author: denny86
 * 
 * Created on 2 giugno 2010, 12.25
 */

#include "PContactList.h"

PContactList::PContactList() {
    window=new Fl_Window(1200, 800);
    window->label("Lista Contatti");
    labID=new Fl_Box(20, 30, 150, 50, "ID");
    labID->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    IDList=new Fl_Hold_Browser(15, 80, 170, 650);
    labName=new Fl_Box(190, 30, 150, 50, "Nome");
    labName->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    nameList=new Fl_Hold_Browser(185, 80, 170, 650);
    labSurname=new Fl_Box(360, 30, 170, 50, "Cognome");
    labSurname->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    surnameList=new Fl_Hold_Browser(355, 80, 170, 650);
    labMail=new Fl_Box(530, 30, 150, 50, "e-mail");
    labMail->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    mailList=new Fl_Hold_Browser(525, 80, 170, 650);
    labTel=new Fl_Box(700, 30, 150, 50, "Telefono");
    labTel->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    telList=new Fl_Hold_Browser(695, 80, 170, 650);
    newCnt=new Fl_Button(900, 200, 200, 80, "Nuovo Contatto");
    delCnt=new Fl_Button(900, 300, 200, 80, "Cancella Contatto");
    search=new Fl_Button(900, 400, 200, 80, "Cerca Contatto");
    addToGrp=new Fl_Button(900, 500, 200, 80, "Aggiungi ad un Gruppo");
    window->end();
    window->show();
}

PContactList::PContactList(const PContactList& orig) {
}

PContactList::~PContactList() {
    window->~Fl_Window();
}

void PContactList::show(bool toShow){
    if (toShow)
        window->show();
    else
        window->hide();
}
