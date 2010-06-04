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
#include "../utility.h"
#include "../Control/CContact.h"

using namespace std;

class PContactList {
public:
    static PContactList* getInstance();
    virtual ~PContactList();
    void show(bool toShow);
    void addNewContact(int ID, string name, string surname, string tel, string mail, string group);
    void removeContact(int ID);
    static void newCnt_callback(Fl_Widget* e, void *data);
    static void delCnt_callback(Fl_Widget* e, void *data);
    static void selName_callback(Fl_Widget* e, void *data);
    static void selSurname_callback(Fl_Widget* e, void *data);
    static void selTel_callback(Fl_Widget* e, void *data);
    static void selGroup_callback(Fl_Widget* e, void *data);
    static void selMail_callback(Fl_Widget* e, void *data);
    static void selID_callback(Fl_Widget* e, void *data);
    static void search_callback(Fl_Widget* e, void *data);
    static void addToGroup_callback(Fl_Widget* e, void *data);
    void delSelected();
    void change_sel(int n);
    void clear();

private:
    PContactList();
    PContactList(const PContactList& orig);
    static PContactList *instance;
    Fl_Window *window;
    Fl_Button *newCnt, *delCnt, *addToGrp, *search;
    Fl_Hold_Browser *nameList, *surnameList, *mailList, *telList, *IDList, *groupList;
    Fl_Box *labName, *labSurname, *labMail, *labTel, *labID, *labGroup;

};

#endif	/* _PCONTACTLIST_H */

