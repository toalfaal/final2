package Logic;

public class DataBase {
    /*          Methods
     * String:getId(cardID)
     * String:getPicturePath(id)
     * String:getFullName(id)
     * String:changePassword(id,newPassword)
     * String:getPhoneNumber(id)
     * boolean:setEntranceTime(id)
     * boolean:setLeavingTime(id)
     * boolean:login(String username,String password)
     *
     *
     *
     * */


    //Test unit
    String[] fati = {"DA4F7714", "985367031", "Fatemeh Ghafouri", "file:\\C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\PNG\\985367031.png", "09146633942"};
    String[] ali = {"F7D73843", "985361042", "Ali Forghani", "file:\\C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\PNG\\985361042.png", "09145030651"};
    String[] alinsrs = {"8A347114", "985367039", "Ali naseri", "file:\\C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\PNG\\985367039.jpg", "09144787269"};
    String[] tohid = {"F7B5BF49", "985367043", "Tohid Yaghmuri", "file:\\C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\PNG\\985367043.jpg", "09148683848"};
    String[] unknown = {"", "000000000", "unknown", "file:\\C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\PNG\\0.png", ""};


    public String changePassword(String id, String newPassword) {
        return null;
    }

    public String getPhoneNumber(String id) {
        if (id.equals(fati[1]))
            return fati[4];
        else if (id.equals(ali[1]))
            return ali[4];
        else if (id.equals(alinsrs[1]))
            return alinsrs[4];
        else if (id.equals(tohid[1]))
            return tohid[4];
        else
            return unknown[0];
    }

    public String getID(String cardID) {
        if (cardID.equals(fati[0]))
            return fati[1];
        else if (cardID.equals(ali[0]))
            return ali[1];
        else if (cardID.equals(alinsrs[0]))
            return alinsrs[1];
        else if (cardID.equals(tohid[0]))
            return tohid[1];
        else
            return unknown[1];
    }

    public String getPicturePath(String id) {
        if (id.equals(fati[1]))
            return fati[3];
        else if (id.equals(ali[1]))
            return ali[3];
        else if (id.equals(alinsrs[1]))
            return alinsrs[3];
        else if (id.equals(tohid[1]))
            return tohid[3];
        else
            return unknown[3];
    }

    public String getFullName(String id) {
        if (id.equals(fati[1]))
            return fati[2];
        else if (id.equals(ali[1]))
            return ali[2];
        else if (id.equals(tohid[1]))
            return tohid[2];
        else if (id.equals(alinsrs[1]))
            return alinsrs[2];
        else
            return unknown[2];
    }

}
