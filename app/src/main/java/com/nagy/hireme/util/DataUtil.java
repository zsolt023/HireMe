package com.nagy.hireme.util;

import com.nagy.hireme.R;
import com.nagy.hireme.data.AndroidKnowledge;
import com.nagy.hireme.data.Education;
import com.nagy.hireme.data.Hobby;
import com.nagy.hireme.data.OtherKnowledge;
import com.nagy.hireme.data.ProfessionalExperience;
import com.nagy.hireme.data.ProgLangKnowledge;
import com.nagy.hireme.fragment.HobbiesFragment;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static List<ProgLangKnowledge> getProgLanguages() {
        List<ProgLangKnowledge> result = new ArrayList<>();
        result.add(new ProgLangKnowledge("Java", 5));
        result.add(new ProgLangKnowledge("Kotlin", 2));
        result.add(new ProgLangKnowledge("SQL", 4));
        result.add(new ProgLangKnowledge("Javascript", 3));
        result.add(new ProgLangKnowledge("C", 3));
        result.add(new ProgLangKnowledge("C++", 3));
        result.add(new ProgLangKnowledge("C#", 3));
        result.add(new ProgLangKnowledge("XML", 5));
        result.add(new ProgLangKnowledge("JSON", 5));
        return result;
    }

    public static List<AndroidKnowledge> getAndroidKnowledge() {
        List<AndroidKnowledge> result = new ArrayList<>();
        result.add(new AndroidKnowledge("SQL"));
        result.add(new AndroidKnowledge("SugarORM"));
        result.add(new AndroidKnowledge("SharedPreferences használata"));
        result.add(new AndroidKnowledge("Firebase Push Notification"));
        result.add(new AndroidKnowledge("Firebase Database"));
        result.add(new AndroidKnowledge("LinkedIn authentikáció"));
        result.add(new AndroidKnowledge("Facebook authentikáció"));
        result.add(new AndroidKnowledge("Facebook Graph Api"));
        result.add(new AndroidKnowledge("REST-en keresztüli api hívások (Retrofit + natív)"));
        result.add(new AndroidKnowledge("GPS adatok felhasználása"));
        result.add(new AndroidKnowledge("Google Maps"));
        result.add(new AndroidKnowledge("Google Places Api"));
        result.add(new AndroidKnowledge("App Wigdet"));
        result.add(new AndroidKnowledge("fényképkezelés"));
        result.add(new AndroidKnowledge("local és privát tárhelyen fájlok kezelése"));
        result.add(new AndroidKnowledge("force update"));
        result.add(new AndroidKnowledge("kész alkalmazás Play Store-ba feltöltése"));

        return result;
    }

    public static List<OtherKnowledge> getOtherKnowledge() {
        List<OtherKnowledge> result = new ArrayList<>();
        result.add(new OtherKnowledge("adatbáziskezelés (SQL, PostgreSQL, Liquibase)"));
        result.add(new OtherKnowledge("verziókezelés (Github, Bitbucket)"));
        result.add(new OtherKnowledge("probléma és projekt menedzsment eszköz: JIRA")); // issue and project tracking tool
        result.add(new OtherKnowledge("GWT (Google Web Toolkit)"));
        result.add(new OtherKnowledge("Spring"));
        result.add(new OtherKnowledge("JavaEE"));
        return result;
    }

    public static List<ProfessionalExperience> getProfessionalExperiences() {
        List<ProfessionalExperience> result = new ArrayList<>();
        result.add(new ProfessionalExperience(
                "Ticketing & Experience Kft-nél szerzett tapasztalatok",
                "2017-2018",
                "Ezen a helyen több androidos alkalmazást is fejleszthettem, a legtöbbjüket már a legelejétől én írtam. Vannak köztük promóciós alkalmazások, REST-en kommunikáló alkalmazások, egy GPS-es helymeghatározáson alapuló alkalmazás, olyan alkalmazás, amiben található képszerkesztés, vagy QR kód olvasás, generálás is. Több alkalmazásba is be kellet építeni a firebase-es push notification, vagy a force-update lehetőségét. Egy alkalmazáshoz integráltam a Facebook- és a LinkedIn authentikációt is."));
        result.add(new ProfessionalExperience(
                "KÓD Informatikánál szerzett tapasztalatok",
                "2016-2017",
                "Itt kezdetben már élesben használt alkalmazásokban kisebb bugfixek-et kellet végeznem, illetve később már új feature-ök írását is rám bízták. Sokat dolgoztam PostgreSQL-el, GWT-vel, JIRA-val és JavaEE-vel. Ottlétem során Android-os és IOS-es alkalmazások továbbfejlesztését is végeztem."));
        result.add(new ProfessionalExperience(
                "Schönherz Iskolaszövetkezet JAVA EE képzését lezáró projektmunka",
                "2016",
                "Itt volt első alkalmam megismerkedni a csapatmunka fogalmával. Négy fős csapatban dolgoztunk egy ügyfélnyilvántartó-rendszert megvalósító projekten. A kódot Github-on osztottuk meg, és pull request-eket hasznáva ellenőriztük egymás munkáit. Az én fő feladatom a kivételkezelés megvalósítása volt. Ezeken kívül apróbb részfeladatokban is segédgeztem, mint például a bizonyos interceptorok megírásában, vagy a frontend oldali xhtml állományokban, illetve az adatok validálásának megvalósításában."));
        return result;
    }

    public static List<Hobby> getHobbies() {
        List<Hobby> result = new ArrayList<>();
        result.add(new Hobby("Búvárkodás", R.drawable.icon_diving));
        result.add(new Hobby("Síelés", R.drawable.icon_skiing));
        result.add(new Hobby("Biciklizés", R.drawable.icon_biking));
        result.add(new Hobby("Bulizás", R.drawable.icon_partiing));
        result.add(new Hobby("Zenehallgatás", R.drawable.icon_music_listening));
        result.add(new Hobby("Gépezés", R.drawable.icon_computer_playing));
        result.add(new Hobby("Android alkalmazásfejlesztés", R.drawable.icon_programming));
        return result;
    }

    public static List<Education> getEducation() {
        List<Education> result = new ArrayList<>();
        result.add(new Education("Iskolaszövetkezet", "Schönherz Iskolaszövetkezet", "2016 - 2016"));
        result.add(new Education("Felsőoktatási intézmény", "BME-Villamosmérnöki és Informatikai Kar", "2014 - 2018"));
        result.add(new Education("Középiskola", "Veres Péter Gimnázium", "2010-2014"));
        return result;
    }
}
