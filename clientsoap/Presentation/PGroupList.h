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

using namespace std;

class PGroupList {
public:
    PGroupList();
    PGroupList(const PGroupList& orig);
    virtual ~PGroupList();
    bool deleteGrp(string name);
    bool deleteGrp(int cod);
    bool addGroup(string name);
    void show(bool toShow);
private:
    Fl_Button* addGrp, *delGrp, *showGrp;
    Fl_Hold_Browser* grpList;
    Fl_Window* window;
    Fl_Box* labGrp;

};

#endif	/* _PGROUPLIST_H */

