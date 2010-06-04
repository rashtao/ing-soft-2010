/* 
 * File:   PSearchContact.h
 * Author: denny86
 *
 * Created on 4 giugno 2010, 17.47
 */

#ifndef _PSEARCHCONTACT_H
#define	_PSEARCHCONTACT_H

#include <FL/Fl.H>
#include <FL/Fl_Window.H>
#include <FL/Fl_Box.H>
#include <FL/Fl_Button.H>
#include <FL/Fl_Return_Button.H>
#include <FL/fl_draw.H>
#include <FL/Fl_Multiline_Output.H>
#include <FL/Fl_Output.H>
#include <FL/Fl_Hold_Browser.H>
#include <FL/Fl_Choice.H>
#include <iostream>
#include <math.h>
#include <string>
#include "../utility.h"
#include "../Control/CContact.h"

class PSearchContact {
public:
    static PSearchContact* getInstance();
    virtual ~PSearchContact();
    void show(bool toShow);
    static void cerca_callback(Fl_Widget* e, void *data);
    static void annulla_callback(Fl_Widget* e, void *data);
    void search();
private:
    Fl_Choice *choise;
    Fl_Input *input;
    Fl_Return_Button *cerca;
    Fl_Button *annulla;
    Fl_Box *label;
    Fl_Window *window;
    static PSearchContact* instance;
    PSearchContact();
    PSearchContact(const PSearchContact& orig);
};

#endif	/* _PSEARCHCONTACT_H */

