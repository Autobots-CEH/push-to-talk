package org.sipdroid.sipua.component;

import java.util.ArrayList;

import org.sipdroid.sipua.MessageStruct;

import android.content.Context;


public class ChatArchiveStruct{

	public String mUserName;		//who I talk with
	public String mImagePath;
	public ArrayList<MessageStruct> mChatArchiveContent;

	public ChatArchiveStruct(Context context, String username, ArrayList<MessageStruct> chatArchiveContent) {
		mUserName = username;
		mChatArchiveContent = chatArchiveContent;
		Contact contact = new ContactManagement(context).getContact(mUserName);
		this.mImagePath = (contact == null) ? null : contact.mImagePath;		//if contact is a conference => set null image path (bad code => need to change later)
	}

}
