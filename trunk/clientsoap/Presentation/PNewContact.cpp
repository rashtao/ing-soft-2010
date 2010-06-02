/* 
 * File:   PNewContact.cpp
 * Author: denny86
 * 
 * Created on 2 giugno 2010, 13.12
 */

#include "PNewContact.h"

PNewContact::PNewContact() {
    window=new Fl_Window(600, 500);
    window->label("Creazione nuovo contatto");
    nameInput=new Fl_Input(150, 50, 200, 50, "Nome: ");
    nameInput->labelfont(FL_ALIGN_LEFT+FL_BOLD);
    nameInput->labelsize(18);
    nameInput->textsize(18);
    surnameInput=new Fl_Input(150, 150, 200, 50, "Cognome: ");
    surnameInput->labelfont(FL_ALIGN_LEFT+FL_BOLD);
    surnameInput->labelsize(18);
    surnameInput->textsize(18);
    mailInput=new Fl_Input(150, 250, 200, 50, "e-mail: ");
    mailInput->labelfont(FL_ALIGN_LEFT+FL_BOLD);
    mailInput->labelsize(18);
    mailInput->textsize(18);
    telInput=new Fl_Input(150, 350, 200, 50, "telefono: ");
    telInput->labelfont(FL_ALIGN_LEFT+FL_BOLD);
    telInput->labelsize(18);
    telInput->textsize(18);
    crea=new Fl_Return_Button(400, 150, 150, 70, "Crea");
    annulla=new Fl_Button(400, 250, 150, 70, "Annulla");
    window->end();
}

PNewContact::PNewContact(const PNewContact& orig) {
}

PNewContact::~PNewContact() {
    window->~Fl_Window();
}

void PNewContact::show(bool toShow){
    if (toShow)
        window->show();
    else
        window->hide();
}

