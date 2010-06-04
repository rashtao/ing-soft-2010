/* 
 * File:   PNewContact.h
 * Author: denny86
 *
 * Created on 2 giugno 2010, 13.12
 */

#ifndef _PNEWCONTACT_H
#define	_PNEWCONTACT_H

#include <FL/Fl.H>
#include <FL/Fl_Window.H>
#include <FL/Fl_Box.H>
#include <FL/Fl_Button.H>
#include <FL/Fl_Return_Button.H>
#include <FL/fl_draw.H>
#include <FL/Fl_Input.H>
#include <FL/Fl_Multiline_Output.H>
#include <FL/Fl_Output.H>
#include <FL/Fl_Hold_Browser.H>
#include <iostream>
#include <math.h>
#include <string>
#include "../Control/CContact.h"

class PNewContact {
public:
    static PNewContact* getInstance();
    virtual ~PNewContact();
    void show(bool toShow);
    static void completed_callback(Fl_Widget* e, void *data);
    void completed();
private:
    static PNewContact* instance;
    PNewContact();
    PNewContact(const PNewContact& orig);
    Fl_Return_Button *crea;
    Fl_Button *annulla;
    Fl_Window *window;
    Fl_Input *nameInput, *surnameInput, *mailInput, *telInput;

};

#endif	/* _PNEWCONTACT_H */

