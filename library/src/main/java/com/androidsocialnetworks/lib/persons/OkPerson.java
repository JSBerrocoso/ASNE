package com.androidsocialnetworks.lib.persons;

import android.os.Parcel;
import android.os.Parcelable;

public class OkPerson extends SocialPerson implements Parcelable {

    public static final Parcelable.Creator<OkPerson> CREATOR
            = new Parcelable.Creator<OkPerson>() {
        public OkPerson createFromParcel(Parcel in) {
            return new OkPerson(in);
        }

        public OkPerson[] newArray(int size) {
            return new OkPerson[size];
        }
    };

	public String firstName;
	public String lastName;
	public String gender;
	public String birthday;
	public String age;
	public String locale; 
	public boolean has_email;
	public String current_status;
	public String online;
	public String city;
	public String country; 
	
    public OkPerson() {

    }

    private OkPerson(Parcel in) {

        firstName = in.readString();
        lastName = in.readString();
        gender = in.readString();
        birthday = in.readString();
        age = in.readString();
        locale = in.readString();
        has_email = in.readByte() != 0x00;
        current_status = in.readString();
        online = in.readString();
        city = in.readString();
        country = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(gender);
        dest.writeString(birthday);
        dest.writeString(age);
        dest.writeString(locale);
        dest.writeByte((byte) (has_email ? 0x01 : 0x00));
        dest.writeString(current_status);
        dest.writeString(online);
        dest.writeString(city);
        dest.writeString(country);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        OkPerson okPerson = (OkPerson) object;

        if (has_email != okPerson.has_email) return false;
        if (online != null ? !online.equals(okPerson.online) : okPerson.online != null)
            return false;
        if (age != null ? !age.equals(okPerson.age) : okPerson.age != null) return false;
        if (birthday != null ? !birthday.equals(okPerson.birthday) : okPerson.birthday != null)
            return false;
        if (city != null ? !city.equals(okPerson.city) : okPerson.city != null) return false;
        if (country != null ? !country.equals(okPerson.country) : okPerson.country != null)
            return false;
        if (current_status != null ? !current_status.equals(okPerson.current_status) : okPerson.current_status != null)
            return false;
        if (firstName != null ? !firstName.equals(okPerson.firstName) : okPerson.firstName != null)
            return false;
        if (gender != null ? !gender.equals(okPerson.gender) : okPerson.gender != null)
            return false;
        if (lastName != null ? !lastName.equals(okPerson.lastName) : okPerson.lastName != null)
            return false;
        if (locale != null ? !locale.equals(okPerson.locale) : okPerson.locale != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (has_email ? 1 : 0);
        result = 31 * result + (current_status != null ? current_status.hashCode() : 0);
        result = 31 * result + (online != null ? online.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OkPerson{" +
				"id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avatarURL='" + avatarURL + '\'' +
                ", profileURL='" + profileURL + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age='" + age + '\'' +
                ", locale='" + locale + '\'' +
                ", has_email=" + has_email +
                ", current_status='" + current_status + '\'' +
                ", online=" + online +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
