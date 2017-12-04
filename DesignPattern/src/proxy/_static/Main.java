package proxy._static;

import proxy.IDBQuery;

public class Main {
	public static void main(String args[]){
		IDBQuery q=new DBQueryProxy();	//ʹ�ô���
		q.request();					//������ʹ��ʱ�Ŵ�����ʵ����
	}
}
