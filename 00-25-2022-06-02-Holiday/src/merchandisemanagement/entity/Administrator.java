package merchandisemanagement.entity;

import java.util.Date;

public class Administrator {
    private int AID;
    private String AAccount;
    private String APassword;
    private int AOffice;
    private float AWages;
    private float ABonus;
    private Date ATime;
    private String AEndTime;
    private String AName;
    private String ASex;
    private String ANumber;
    private String AAddress;
    private int AUser;
    private String ARemark;

    public Administrator() {
    }

    public Administrator(int AID, String AAccount, String APassword, int AOffice, float AWages, float ABonus, Date ATime, String AEndTime, String AName, String ASex, String ANumber, String AAddress, int AUser, String ARemark) {
        this.AID = AID;
        this.AAccount = AAccount;
        this.APassword = APassword;
        this.AOffice = AOffice;
        this.AWages = AWages;
        this.ABonus = ABonus;
        this.ATime = ATime;
        this.AEndTime = AEndTime;
        this.AName = AName;
        this.ASex = ASex;
        this.ANumber = ANumber;
        this.AAddress = AAddress;
        this.AUser = AUser;
        this.ARemark = ARemark;
    }

    public  Administrator(String AAccount, String APassword, int AOffice, float AWages, float ABonus, Date ATime, String AEndTime, String AName, String ASex, String ANumber, String AAddress, int AUser, String ARemark) {
        this.AAccount = AAccount;
        this.APassword = APassword;
        this.AOffice = AOffice;
        this.AWages = AWages;
        this.ABonus = ABonus;
        this.ATime = ATime;
        this.AEndTime = AEndTime;
        this.AName = AName;
        this.ASex = ASex;
        this.ANumber = ANumber;
        this.AAddress = AAddress;
        this.AUser = AUser;
        this.ARemark = ARemark;
    }

    public int getAID() {
        return AID;
    }

    public void setAID(int AID) {
        this.AID = AID;
    }

    public String getAAccount() {
        return AAccount;
    }

    public void setAAccount(String AAccount) {
        this.AAccount = AAccount;
    }

    public String getAPassword() {
        return APassword;
    }

    public void setAPassword(String APassword) {
        this.APassword = APassword;
    }

    public int getAOffice() {
        return AOffice;
    }

    public void setAOffice(int AOffice) {
        this.AOffice = AOffice;
    }

    public float getAWages() {
        return AWages;
    }

    public void setAWages(float AWages) {
        this.AWages = AWages;
    }

    public float getABonus() {
        return ABonus;
    }

    public void setABonus(float ABonus) {
        this.ABonus = ABonus;
    }

    public Date getATime() {
        return ATime;
    }

    public void setATime(Date ATime) {
        this.ATime = ATime;
    }

    public String getAEndTime() {
        return AEndTime;
    }

    public void setAEndTime(String AEndTime) {
        this.AEndTime = AEndTime;
    }

    public String getAName() {
        return AName;
    }

    public void setAName(String AName) {
        this.AName = AName;
    }

    public String getASex() {
        return ASex;
    }

    public void setASex(String ASex) {
        this.ASex = ASex;
    }

    public String getANumber() {
        return ANumber;
    }

    public void setANumber(String ANumber) {
        this.ANumber = ANumber;
    }

    public String getAAddress() {
        return AAddress;
    }

    public void setAAddress(String AAddress) {
        this.AAddress = AAddress;
    }

    public int getAUser() {
        return AUser;
    }

    public void setAUser(int AUser) {
        this.AUser = AUser;
    }

    public String getARemark() {
        return ARemark;
    }

    public void setARemark(String ARemark) {
        this.ARemark = ARemark;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "AID=" + AID +
                ", AAccount='" + AAccount + '\'' +
                ", APassword='" + APassword + '\'' +
                ", AOffice=" + AOffice +
                ", AWages=" + AWages +
                ", ABonus=" + ABonus +
                ", ATime=" + ATime +
                ", AEndTime=" + AEndTime +
                ", AName='" + AName + '\'' +
                ", ASex='" + ASex + '\'' +
                ", ANumber='" + ANumber + '\'' +
                ", AAddress='" + AAddress + '\'' +
                ", AUser=" + AUser +
                ", ARemark='" + ARemark + '\'' +
                '}';
    }
}
