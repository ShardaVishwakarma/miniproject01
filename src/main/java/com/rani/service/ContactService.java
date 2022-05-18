package com.rani.service;

import java.util.List;

import com.rani.entity.Contact;

public interface ContactService {

 public String upsert (Contact contact);  //(polymorphic method)

 public List<Contact> getAllContacts( );

 public Contact getContact (int cid);

 public String deleteContact (int cid);
}
