package Logic;

import Extras.CodeGenerator;
import Extras.SMS;

public class ChangePassword {
    public ChangePassword(String id) {
        this.id = id;
        initCode();
        sendSMS();
    }

    private final String id;
    private String clientCode;
    private String serverCode;
    private String smsStatus;
    private String passwordStatus;
    private String newPassword;
    private String confirmNewPass;

    public String getPasswordStatus() {
        return passwordStatus;
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public ChangePassword setClientCode(String clientCode) {
        this.clientCode = clientCode;
        return this;
    }

    public ChangePassword setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public ChangePassword setConfirmNewPass(String confirmNewPass) {
        this.confirmNewPass = confirmNewPass;
        return this;
    }

    public void change() {
        if (newPassword.length()+confirmNewPass.length()>0)
        if (this.newPassword.equals(this.confirmNewPass))
            if (this.clientCode.equals(this.serverCode)) {
                DataBase dataBase = new DataBase();
                this.passwordStatus = dataBase.changePassword(this.id, this.newPassword);
            } else
                this.passwordStatus = "کد امنیتی اشتباه است.";
        else
            this.passwordStatus = "رمز عبور و تکرار آن مطابقت ندارند.";
        else
            this.passwordStatus="رمز عبور و تایید را وارد کنید.";
    }

    private void initCode() {
        CodeGenerator codeGenerator = new CodeGenerator(4);
        this.serverCode= codeGenerator.getCode();
    }

    private void sendSMS() {
        String phoneNumber = new DataBase().getPhoneNumber(this.id);
        SMS sms = new SMS(phoneNumber);
        this.smsStatus = sms.sendCode(this.serverCode);
    }


}
