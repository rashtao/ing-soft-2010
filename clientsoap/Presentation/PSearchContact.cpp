/* 
 * File:   PSearchContact.cpp
 * Author: denny86
 * 
 * Created on 4 giugno 2010, 17.47
 */

#include "PSearchContact.h"

PSearchContact* PSearchContact::instance=NULL;

void PSearchContact::cerca_callback(Fl_Widget* e, void* data){
    PSearchContact::getInstance()->search();
}

void PSearchContact::annulla_callback(Fl_Widget* e, void* data){
    PSearchContact::getInstance()->show(false);
}

PSearchContact::PSearchContact() {
    int data=0;
    window=new Fl_Window(500,200, "Ricerca contatti");
    choise=new Fl_Choice(100, 50, 100, 30, "Ricerca per: ");
    choise->add("Nome");
    choise->add("Cognome");
    choise->add("telefono");
    choise->add("e-mail");
    choise->add("gruppo");
    input=new Fl_Input(250, 50, 200, 30);
    cerca=new Fl_Return_Button(200, 120, 100, 50, "Cerca");
    cerca->when(FL_WHEN_RELEASE);
    cerca->callback(cerca_callback, &data);
    annulla=new Fl_Button(350, 120, 100, 50, "Annulla");

    window->end();
}

PSearchContact::PSearchContact(const PSearchContact& orig) {
}

PSearchContact::~PSearchContact() {
    window->~Fl_Window();
}

PSearchContact* PSearchContact::getInstance(){
    if (instance==NULL)
        instance=new PSearchContact();
    return instance;
}

void PSearchContact::show(bool toShow){
    if(toShow)
        window->show();
    else
        window->hide();
}

void PSearchContact::search(){
    string searchFor=choise->text(choise->value()),
            toSearch=input->value();
    CContact::getInstance()->searchContact(searchFor, toSearch);
}