package com.yychat.model;

public interface MessageType {
	String message_LoginFailure="0";//�ַ�������
	String message_LoginSuccess="1";
	String message_Common="2";	
	String message_RequestOnlineFriend="3";//�ͻ������������ߺ�����Ϣ
	String message_OnlineFriend="4";//�������������ߺ�����Ϣ
	/*String message_finishedEabelonlinefriend="5";
	String message_newfriendupdate="6";*/
	String message_NewOnlineFriend="5";
	//ע�����û�����6������Message�����������
	String message_RegisterSuccess="6";//ע��ɹ�����Ϣ����
	String message_RegisterFailure="7";//ע��ʧ�ܵ���Ϣ����
}