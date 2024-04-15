package org.example;

public class AppConfig {
    private static volatile AppConfig instance;

    public static AppConfig getInstance(){

        if(instance == null){
            synchronized (AppConfig.class){
                if (instance == null){
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    private AppConfig(){
    }

    private String serverUrl;
    private String username;
    private String password;
    private int port;

    public String getServerUrl(){
        return this.serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort(){
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
