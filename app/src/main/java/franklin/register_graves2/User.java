package franklin.register_graves2;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Tim Newport on 3/11/2018.
 */

public class User implements Parcelable {
    // TODO

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {

        @Override
        public User createFromParcel(Parcel in) {
            return new User(in.readInt(),in.readString(), in.readString(), in.readString(),in.readInt(),in.readInt(),in.readInt(),in.readInt(),in.readInt());
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }

    };

    // User(id, fName, lName, admin, spree,numLogin,bestSpree,ranking);
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private int isAdmin;
    private int spreeCnt;
    private int numLogins;
    private int bestSpree;
    private int ranking;

    public User(int id, String userName, String firstName, String lastName, int isAdmin, int spreeCnt,int numLogins, int bestSpree , int ranking) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.spreeCnt = spreeCnt;
        this.numLogins = numLogins;
        this.bestSpree = bestSpree;
        this.ranking = ranking;
    } //UND USER

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(id);
        out.writeString(userName);
        out.writeString(firstName);
        out.writeString(lastName);
        out.writeInt(isAdmin);
        out.writeInt(spreeCnt);
        out.writeInt(numLogins);
        out.writeInt(bestSpree);
        out.writeInt(ranking);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
    public int getSpreeCnt() {
        return spreeCnt;
    }

    public void setSpreeCnt(int spreeCnt) {
        this.spreeCnt = spreeCnt;
    }
    public int getNumLogins() {
        return numLogins;
    }

    public void setNumLogins(int numLogins) {
        this.numLogins = numLogins;
    }
    public int getBestSpree() {
        return bestSpree;
    }

    public void setBestSpree(int bestSpree) {
        this.bestSpree = bestSpree;
    }
    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
} //end user class
