1. ȸ�������� ������ ������ �� �ִ� 'web_member'���̺��� ����ÿ�.
   �÷��� : m_email / m_pw / m_tel / m_address

create table web_member(
	m_email varchar(50),
	m_pw varchar(50) not null,
	m_tel varchar(50) not null,
	m_address varchar(50) not null,
	constraint pk_e primary key(m_email)
);

select * from web_member;

--�ù��� ����
create sequence num_seq
		increment by 1
		start with 1;

create table web_message(
	m_num number,
	m_sendName varchar(50) not null,
	m_receiveEmail varchar(50) not null,
	m_content varchar(200) not null,
	m_sendDate date not null,
	constraint m_num_pk primary key(m_num)

)

select * from web_message

insert into web_message values(num_seq.nextval,'test','saga1897@naver.com','test',sysdate)







