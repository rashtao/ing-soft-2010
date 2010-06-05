/* 
 * File:   PGroupList.h
 * Author: denny86
 *
 * Created on 2 giugno 2010, 11.00
 */

#ifndef _PGROUPLIST_H
#define	_PGROUPLIST_H

#include <FL/Fl.H>
#include <FL/Fl_Window.H>
#include <FL/Fl_Box.H>
#include <FL/Fl_Button.H>
#include <FL/Fl_Return_Button.H>
#include <FL/fl_draw.H>
#include <FL/Fl_Multiline_Output.H>
#include <FL/Fl_Output.H>
#include <FL/Fl_Hold_Browser.H>
#include <iostream>
#include <math.h>
#include <string>
#include "../Control/CGroup.h"

using namespace std;

class PGroupList {
public:
    static PGroupList* getInstance();
    virtual ~PGroupList();
    void deleteGrp(string name);
    void deleteSelectedGrp();
    void addGroup(string name);
    void show(bool toShow);
    static void newGrp_callback(Fl_Widget* e, void *data);
    static void deleteGrp_callback(Fl_Widget* e, void *data);
    static void showGrp_callback(Fl_Widget* e, void *data);
private:
    static PGroupList* instance;
    Fl_Button* addGrp, *delGrp, *showGrp;
    Fl_Hold_Browser* grpList;
    Fl_Window* window;
    Fl_Box* labGrp;
    PGroupList();
    PGroupList(const PGroupList& orig);

};

#endif	/* _PGROUPLIST_H */

