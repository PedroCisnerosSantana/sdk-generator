package com.appwrite.java;

import java.util.Hashtable;

public class Client {
  final String METHOD_GET = "GET";
  final String METHOD_POST = "POST";
  final String METHOD_PUT = "PUT";
  final String METHOD_PATCH = "PATCH";
  final String METHOD_DELETE = "DELETE";
  final String METHOD_HEAD = "HEAD";
  final String METHOD_OPTIONS = "OPTIONS";
  final String METHOD_CONNECT = "CONNECT";
  final String METHOD_TRACE = "TRACE";
  Hashtable<String, String> headers = new Hashtable<String, String>();
  public void main(String[] args) {
	headers.put("content-type", "");
	headers.put("x-sdk-version", "{{ spec.title | caseDash }}:{{ language.name | caseLower }}:{{ sdk.version }}");
  }

  /**
   * Is Self Signed Certificates Allowed?
   * 
   * @var boolean
   */
  protected boolean selfSigned = false;

  /**
   * Service host name
   * 
   * @var String
   */
  protected String endpoint = "{{spec.endpoint}}";
  /**
   * SDK constructor
   */
  public void __contruct() {

  }
  
  public Client setKey(String value) {
	this.headers.put("{{header.name}}", value);
	return this;
  }
  /**
   * @param boolean status
   * @return this
   */
  public Client setSelfSigned(boolean status) {
	this.setSelfSigned(status);
	return this;
  }
  /**
   * @param endpoint
   * @return this
   */
  public Client setEndpoint(String endpoint) {
	this.setEndpoint(endpoint);
	return this;
  }
  /**
   * @param key
   * @param value
   */
  public Client addHeader(String key, String value) {
	this.addHeader(key.toLowerCase(), value.toLowerCase());
	return this;
  }
  /**
   * Call
   * 
   * Make an API call
   * 
   * @param string method
   * @param string path
   * @param array params
   * @param array headers
   * @return array|string
   * @throws Exception
   */
  public String call(String method, String path, Hashtable<String, String> header, Hashtable<String, String> params) {
	String responseBody = "";
	return responseBody;
  }
  
}




