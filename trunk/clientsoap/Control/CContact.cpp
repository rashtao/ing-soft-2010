/* 
 * File:   CContact.cpp
 * Author: denny86
 * 
 * Created on 2 giugno 2010, 14.10
 */

#include "CContact.h"

CContact* CContact::instance=NULL;

CContact::CContact() {
}

CContact::CContact(const CContact& orig) {
}

CContact::~CContact() {
}

CContact* CContact::getInstance(){
    if (instance==NULL)
        instance=new CContact();
    return instance;
}

bool CContact::addNewContact(string name, string surname, string tel, string mail){
    int ID=0;
    //genera ID
    //crea entity e invia al server
    PContactList::getInstance()->addNewContact(ID, name, surname, tel, mail, "");
    PNewContact::getInstance()->show(false);
    return true;

}

bool CContact::removeContact(int ID){
    //inviare a server
    // if(OK)
    {
        PContactList::getInstance()->removeContact(ID);
        return true;
    }
}

bool CContact::searchContact(string searchFor, string toSearch){
    //effettua la ricerca in remoto
    // aggiungi i risultati in locale
}
