/* 
 * File:   PContactList.h
 * Author: denny86
 *
 * Created on 2 giugno 2010, 12.25
 */

#ifndef _PCONTACTLIST_H
#define	_PCONTACTLIST_H

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

class PContactList {
public:
    PContactList();
    PContactList(const PContactList& orig);
    virtual ~PContactList();
    void show(bool toShow);
private:
    Fl_Window *window;
    Fl_Button *newCnt, *delCnt, *addToGrp, *search;
    Fl_Hold_Browser *nameList, *surnameList, *mailList, *telList, *IDList;
    Fl_Box *labName, *labSurname, *labMail, *labTel, *labID;

};

#endif	/* _PCONTACTLIST_H */

