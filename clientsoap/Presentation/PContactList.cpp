/* 
 * File:   PContactList.cpp
 * Author: denny86
 * 
 * Created on 2 giugno 2010, 12.25
 */

#include "PContactList.h"
#include "PSearchContact.h"
#include "PGroupList.h"
#include <math.h>

PContactList* PContactList::instance=NULL;

void PContactList::newCnt_callback(Fl_Widget* e, void* data){
    PNewContact* nc=PNewContact::getInstance();
    nc->show(true);
}

void PContactList::delCnt_callback(Fl_Widget* e, void* data){
    PContactList::getInstance()->delSelected();
}

void PContactList::selName_callback(Fl_Widget* e, void* data){
    PContactList::getInstance()->change_sel(0);
}

void PContactList::selSurname_callback(Fl_Widget* e, void* data){
    PContactList::getInstance()->change_sel(1);
}

void PContactList::selMail_callback(Fl_Widget* e, void* data){
        PContactList::getInstance()->change_sel(2);
}

void PContactList::selTel_callback(Fl_Widget* e, void* data){
    PContactList::getInstance()->change_sel(3);
}

void PContactList::selGroup_callback(Fl_Widget* e, void* data){
    PContactList::getInstance()->change_sel(4);
}

void PContactList::selID_callback(Fl_Widget* e, void* data){
    PContactList::getInstance()->change_sel(5);
}

void PContactList::search_callback(Fl_Widget* e, void* data){
    PSearchContact* sc=PSearchContact::getInstance();
    sc->show(true);
}

void PContactList::addToGroup_callback(Fl_Widget* e, void* data){
    PGroupList* gl=PGroupList::getInstance();
    gl->show(true);
}

PContactList::PContactList() {
    int data=0;
    window=new Fl_Window(1300, 800);
    window->label("Lista Contatti");
    labID=new Fl_Box(20, 30, 150, 50, "ID");
    labID->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    IDList=new Fl_Hold_Browser(15, 80, 170, 650);
    IDList->when(FL_WHEN_CHANGED);
    IDList->callback(selID_callback, &data);
    labName=new Fl_Box(190, 30, 150, 50, "Nome");
    labName->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    nameList=new Fl_Hold_Browser(185, 80, 170, 650);
    nameList->when(FL_WHEN_CHANGED);
    nameList->callback(selName_callback, &data);
    labSurname=new Fl_Box(360, 30, 170, 50, "Cognome");
    labSurname->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    surnameList=new Fl_Hold_Browser(355, 80, 170, 650);
    surnameList->when(FL_WHEN_CHANGED);
    surnameList->callback(selSurname_callback, &data);
    labMail=new Fl_Box(530, 30, 150, 50, "e-mail");
    labMail->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    mailList=new Fl_Hold_Browser(525, 80, 170, 650);
    mailList->when(FL_WHEN_CHANGED);
    mailList->callback(selMail_callback, &data);
    labTel=new Fl_Box(700, 30, 150, 50, "Telefono");
    labTel->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    telList=new Fl_Hold_Browser(695, 80, 170, 650);
    telList->when(FL_WHEN_CHANGED);
    telList->callback(selTel_callback, &data);
    labGroup=new Fl_Box(870, 30, 150, 50, "Gruppo");
    labGroup->labelfont(FL_ALIGN_CENTER+FL_BOLD);
    groupList=new Fl_Hold_Browser(865, 80, 170, 650);
    groupList->when(FL_WHEN_CHANGED);
    groupList->callback(selGroup_callback, &data);
    newCnt=new Fl_Button(1070, 200, 200, 80, "Nuovo Contatto");
    newCnt->when(FL_WHEN_RELEASE);
    newCnt->callback(newCnt_callback, &data);
    delCnt=new Fl_Button(1070, 300, 200, 80, "Cancella Contatto");
    delCnt->when(FL_WHEN_RELEASE);
    delCnt->callback(delCnt_callback, &data);
    search=new Fl_Button(1070, 400, 200, 80, "Cerca Contatto");
    search->when(FL_WHEN_RELEASE);
    search->callback(search_callback, &data);
    addToGrp=new Fl_Button(1070, 500, 200, 80, "Aggiungi ad un Gruppo");
    addToGrp->when(FL_WHEN_RELEASE);
    addToGrp->callback(addToGroup_callback, &data);
    window->end();
    window->show();
}

PContactList::PContactList(const PContactList& orig) {
}

PContactList::~PContactList() {
    window->~Fl_Window();
}


PContactList* PContactList::getInstance(){
    if (instance==NULL)
        instance=new PContactList();
    return instance;
}

void PContactList::show(bool toShow){
    if (toShow)
        window->show();
    else
        window->hide();
}

void PContactList::addNewContact(int ID, string name, string surname, string tel, string mail, string group){
    IDList->add(utility::intToString(ID).data());
    nameList->add(name.data());
    surnameList->add(surname.data());
    telList->add(tel.data());
    mailList->add(mail.data());
    groupList->add(group.data());
}

void PContactList::removeContact(int ID) {
    int i = IDList->value();

    IDList->remove(i);
    nameList->remove(i);
    surnameList->remove(i);
    mailList->remove(i);
    telList->remove(i);
    groupList->remove(i);

}

void PContactList::delSelected(){
    CContact::getInstance()->removeContact(IDList->value());
}

void PContactList::change_sel(int n){
    int value=0;
    switch (n){
        case 0: value=nameList->value(); break;
        case 1: value=surnameList->value(); break;
        case 2: value=mailList->value(); break;
        case 3: value=telList->value(); break;
        case 4: value=groupList->value(); break;
        default: value=IDList->value(); break;
    }
    IDList->value(value);
    nameList->value(value);
    surnameList->value(value);
    mailList->value(value);
    telList->value(value);
    groupList->value(value);

}

void PContactList::clear(){
    for (int i=IDList->size();i>0; i--){
        IDList->remove(i);
        nameList->remove(i);
        surnameList->remove(i);
        mailList->remove(i);
        telList->remove(i);
        groupList->remove(i);
    }
    
}