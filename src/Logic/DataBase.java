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
    String[] fati = {"DA4F7714","985367031","Fatemeh Ghafouri","file:\\C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\PNG\\985367031.png"};
    String[] ali = {"F7D73843","985361042","Ali Forghani","file:\\C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\PNG\\985361042.png"};
    String[] unknown = {"","000000000","unknown","file:\\C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\PNG\\0.png"};

    public String changePassword(String id ,String newPassword){
        return null;
    }
    public String getPhoneNumber(String id){
        return "09145030651";
    }
    public String getID(String cardID) {
            if (cardID.equals(fati[0]))
                return fati[1];
            else if (cardID.equals(ali[0]))
                return ali[1];
            else
                return unknown[1];
        }

    public String getPicturePath(String id){
        if (id.equals(fati[1]))
            return fati[3];
        else if (id.equals(ali[1]))
            return ali[3];
        else
            return unknown[3];
    }
    public String getFullName (String id){
        if (id.equals(fati[1]))
            return fati[2];
        else if (id.equals(ali[1]))
            return ali[2];
        else
            return unknown[2];
    }

}
