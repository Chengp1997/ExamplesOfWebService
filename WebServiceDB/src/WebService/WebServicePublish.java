package WebService;
import javax.xml.ws.Endpoint;

public class WebServicePublish {
	 public static void main(String[] args) {
		          //����WebService�ķ�����ַ�������ַ�����ṩ��������Webervice��URL��ַ��URL��ַ��ʽΪ��http://ip:�˿ں�/xxxx
                    String address="http://localhost:8888/WebService";
		          //ʹ��Endpoint���ṩ��publish��������WebService������ʱҪ��֤ʹ�õĶ˿ں�û�б�����Ӧ�ó���ռ��
		          Endpoint.publish(address , new SearchUniversity());
		          System.out.println("����webservice�ɹ�!");
		      }

}
