package io;

public class User {

	
	public String name;
	public String pwd;
	public String home;
	public String shell;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getShell() {
		return shell;
	}
	public void setShell(String shell) {
		this.shell = shell;
	}
	
	
	
	
	
	
	
	public User(){};
	
	public User(String name, String pwd, String home, String shell) {
		
		this.name = name;
		this.pwd = pwd;
		this.home = home;
		this.shell = shell;
	}
	
//	public String ToString(){
//		return  "name="+name+"\tpwd="+pwd+"\thome="+home+"\tshell="+shell;
//	}
	
	public String find(String name){
		
//		if(name.equals(getName()))
			return  "name="+name+"\tpwd="+pwd+"\thome="+home+"\tshell="+shell;
//		return null ;
	}
	
	
	
	
	
}
