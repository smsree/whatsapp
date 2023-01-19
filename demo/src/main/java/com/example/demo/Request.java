package com.example.demo;

public class Request {
    private String from;
    private String to;
    private String body;

    private Integer numMedia;

    private String address;

    private String profileName;

    private String mediaUrl;


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getNumMedia() {
        return numMedia;
    }

    public void setNumMedia(Integer numMedia) {
        this.numMedia = numMedia;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public Request(String from, String to, String body, Integer numMedia, String address, String profileName, String mediaUrl) {
        this.from = from;
        this.to = to;
        this.body = body;
        this.numMedia = numMedia;
        this.address = address;
        this.profileName = profileName;
        this.mediaUrl = mediaUrl;
    }

    @Override
    public String toString() {
        return "Request{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", body='" + body + '\'' +
                ", numMedia=" + numMedia +
                ", address='" + address + '\'' +
                ", profileName='" + profileName + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
                '}';
    }
}
