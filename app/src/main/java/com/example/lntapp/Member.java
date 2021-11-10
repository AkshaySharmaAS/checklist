package com.example.lntapp;

public class Member {
    private String DoorDisplay;
    private String ProgramSchedule;
    private String PenPad;
    private String CleanWhiteBoard;
    private String Marker;
    private String WaterBottle;
    private String Speaker;
    private String CollarMic;
    private String SlideNavigator;
    private String Projector;
    private String PCReady;
    private String SWReady;
    private String ACLightClock;
    private String y;
    private String z;
    private String ya;
    private String za;
    public Member(){}

    public Member(String doorDisplay, String programSchedule, String penPad, String cleanWhiteBoard, String marker, String waterBottle, String speaker, String collarMic, String slideNavigator, String projector, String PCReady, String SWReady, String ACLightClock,String y,String z,String ya,String za) {
       this.DoorDisplay = doorDisplay;
        this.ProgramSchedule = programSchedule;
        this.PenPad = penPad;
        this.CleanWhiteBoard = cleanWhiteBoard;
        this.Marker = marker;
        this.WaterBottle = waterBottle;
        this.Speaker = speaker;
        this.CollarMic = collarMic;
        this.SlideNavigator = slideNavigator;
        this.Projector = projector;
        this.PCReady = PCReady;
        this.SWReady = SWReady;
        this.ACLightClock = ACLightClock;
    }

    public String getYa() {
        return ya;
    }

    public void setYa(String ya) {
        this.ya = ya;
    }

    public String getZa() {
        return za;
    }

    public void setZa(String za) {
        this.za = za;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getDoorDisplay() {
        return DoorDisplay;
    }

    public void setDoorDisplay(String doorDisplay) {
        DoorDisplay = doorDisplay;
    }

    public String getProgramSchedule() {
        return ProgramSchedule;
    }

    public void setProgramSchedule(String programSchedule) {
        ProgramSchedule = programSchedule;
    }

    public String getPenPad() {
        return PenPad;
    }

    public void setPenPad(String penPad) {
        PenPad = penPad;
    }

    public String getCleanWhiteBoard() {
        return CleanWhiteBoard;
    }

    public void setCleanWhiteBoard(String cleanWhiteBoard) {
        CleanWhiteBoard = cleanWhiteBoard;
    }

    public String getMarker() {
        return Marker;
    }

    public void setMarker(String marker) {
        Marker = marker;
    }

    public String getWaterBottle() {
        return WaterBottle;
    }

    public void setWaterBottle(String waterBottle) {
        WaterBottle = waterBottle;
    }

    public String getSpeaker() {
        return Speaker;
    }

    public void setSpeaker(String speaker) {
        Speaker = speaker;
    }

    public String getCollarMic() {
        return CollarMic;
    }

    public void setCollarMic(String collarMic) {
        CollarMic = collarMic;
    }

    public String getSlideNavigator() {
        return SlideNavigator;
    }

    public void setSlideNavigator(String slideNavigator) {
        SlideNavigator = slideNavigator;
    }

    public String getProjector() {
        return Projector;
    }

    public void setProjector(String projector) {
        Projector = projector;
    }

    public String getPCReady() {
        return PCReady;
    }

    public void setPCReady(String PCReady) {
        this.PCReady = PCReady;
    }

    public String getSWReady() {
        return SWReady;
    }

    public void setSWReady(String SWReady) {
        this.SWReady = SWReady;
    }

    public String getACLightClock() {
        return ACLightClock;
    }

    public void setACLightClock(String ACLightClock) {
        this.ACLightClock = ACLightClock;
    }
}
