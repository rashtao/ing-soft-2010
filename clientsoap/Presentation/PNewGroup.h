/* 
 * File:   PNewGroup.h
 * Author: denny86
 *
 * Created on 2 giugno 2010, 11.58
 */

#ifndef _PNEWGROUP_H
#define	_PNEWGROUP_H

#include <FL/Fl.H>
#include <FL/Fl_Window.H>
#include <FL/Fl_Box.H>
#include <FL/Fl_Button.H>
#include <FL/Fl_Return_Button.H>
#include <FL/fl_draw.H>
#include <FL/Fl_Multiline_Output.H>
#include <FL/Fl_Output.H>
#include <FL/Fl_Input.H>
#include <FL/Fl_Hold_Browser.H>
#include <iostream>
#include <math.h>
#include <string>

#include "PGroupList.h"

class PNewGroup {
public:
    static PNewGroup* getInstance();
    virtual ~PNewGroup();
    void createGroup();
    void show(bool toShow);
    static void addGroup_callback(Fl_Widget* e, void *data);
private:
    static PNewGroup* instance;
    Fl_Return_Button *crea;
    Fl_Button *annulla;
    Fl_Window *window;
    Fl_Box *labName;
    Fl_Input *nameInput;
    PNewGroup();
    PNewGroup(const PNewGroup& orig);


};

#endif	/* _PNEWGROUP_H */

