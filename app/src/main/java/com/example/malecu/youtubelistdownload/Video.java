package com.example.malecu.youtubelistdownload;

/**
 * Created by malecu on 05/01/17.
 */

public class Video {

    protected String url;
    protected String name;
    protected String chanel;
    protected String length;
    protected Quality quality;
    protected String location; // null means default value
    protected VideoStatus status;

    public Video(String url, String name, String chanel) {
        this.url = url;
        this.name = name;
        this.chanel = chanel;
        this.location = null;
        this.quality = Quality.HD;
        this.length = null;
        this.status = VideoStatus.READY;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public VideoStatus getStatus() {
        return status;
    }

    public void setStatus(VideoStatus status) {
        this.status = status;
    }

    public enum VideoStatus {
        READY, DOWNLOADING, DONE, CANCELED;
    }

    public enum Quality {
        SD, HD
    }
}
