package thingworx.webserver.Requests;

import thingworx.webserver.Utils;

public class Requests {
    private String SERVER_URL = "http://130.64.160.230:8080/";

    public void addText(String text, int x, int y, String color, int size, int id){
        Utils.getRequest(SERVER_URL + "add/?text=" + text +"&x=" + x + "&y=" + y + "&color=" + color + "&size=" + size + "&id=" + id);
    }

    public void updateText(String text, int x, int y, String color, int size, int id){
        Utils.getRequest(SERVER_URL + "update/?text=" + text +"&x=" + x + "&y=" + y + "&color=" + color + "&size=" + size + "&id=" + id);
    }

    public void deleteText(int id){
        Utils.getRequest(SERVER_URL + "delete/?text=0&x=0&y=0&color=0,0,0&size=0&id=" + id);
    }

    public void addImage(String url, int x, int y, int id){
        System.out.println(SERVER_URL + "add/?text=0&color=0,0,0&size=0&url=" + url +"&x=" + x + "&y=" + y + "&id=" + id);

        Utils.getRequest(SERVER_URL + "add/?text=0&color=0,0,0&size=0&url=" + url +"&x=" + x + "&y=" + y + "&id=" + id);
    }

    public void updateImage(String url, int x, int y, int id){
        Utils.getRequest(SERVER_URL + "update/?text=0&color=0,0,0&size=0&url=" + url +"&x=" + x + "&y=" + y + "&id=" + id);
    }
    public void deleteImage(int id){
        Utils.getRequest(SERVER_URL + "delete/?text=0&color=0,0,0&size=0&url=0&x=0&y=0&id=" + id);
    }
}
