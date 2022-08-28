package com.spiritofcup.aapp

import com.spiritofcup.aapp.model.StageMatches
import com.spiritofcup.aapp.model.TeamInfo

object DataManager {

    val QATAR = 0
    val ECUADOR = 1
    val SENEGAL = 2
    val NETHERLANDS = 3
    val ENGLAND = 4
    val IRAN = 5
    val USA = 6
    val WALES = 7
    val ARGENTINA = 8
    val S_ARABIA = 9
    val DENMARK = 10
    val TUNISIA = 11
    val MEXICO = 12
    val POLAND = 13
    val FRANCE = 14
    val AUSTRALIA = 15
    val MOROCCO = 16
    val CROATIA = 17
    val GERMANY = 18
    val JAPAN = 19
    val SPAIN = 20
    val COSTA_RICA = 21
    val BELGIUM = 22
    val CANADA = 23
    val SWITZERLAND = 24
    val CAMEROON = 25
    val URUGUAY = 26
    val SOUTH_KOREA = 27
    val PORTUGAL = 28
    val GHANA = 29
    private const val BRAZIL = 30
    val SERBIA = 31

    val getTeamInfo
        get() = mapOf(
            AUSTRALIA to TeamInfo(R.drawable.australia_flag, "Австралия", "Группа D", "Группа D. 1-й тур", "Группа D. 2-й тур", "Группа D. 3-й тур", "22.11.2022 22:00", "26.11.2022 13:00", "30.11.2022 18:00", "Франция - Австралия", "Тунис - Австралия", "Австралия - Дания"),
            ENGLAND to TeamInfo(R.drawable.england_flag, "Англия", "Группа B", "Группа B. 1-й тур", "Группа B. 2-й тур", "Группа B. 3-й тур", "21.11.2022 16:00", "25.11.2022 22:00", "29.11.2022 22:00", "Англия - Иран", "Англия - США", "Уэльс - Англия"),
            ARGENTINA to TeamInfo(R.drawable.argentina_flag, "Аргентина", "Группа C", "Группа C. 1-й тур", "Группа C. 2-й тур", "Группа C. 3-й тур", "22.11.2022 13:00", "26.11.2022 22:00", "30.11.2022 22:00", "Аргентина - С. Аравия", "Аргентина - Мексика", "Польша - Аргентина"),
            BELGIUM to TeamInfo(R.drawable.belgium_flag, "Бельгия", "Группа F", "Группа F. 1-й тур", "Группа F. 2-й тур", "Группа F. 3-й тур", "23.11.2022 22:00", "27.11.2022 16:00", "01.12.2022 18:00", "Бельгия - Канада", "Бельгия - Марокко", "Хорватия - Бельгия"),
            BRAZIL to TeamInfo(R.drawable.brazil_flag, "Бразилия", "Группа G", "Группа G. 1-й тур", "Группа G. 2-й тур", "Группа G. 3-й тур", "24.11.2022 22:00", "28.11.2022 19:00", "02.12.2022 22:00", "Бразилия - Сербия", "Бразилия - Швейцария", "Камерун - Бразилия"),
            GHANA to TeamInfo(R.drawable.ghana_flag, "Гана", "Группа H", "Группа H. 1-й тур", "Группа H. 2-й тур", "Группа H. 3-й тур", "24.11.2022 19:00", "28.11.2022 16:00", "02.12.2022 18:00", "Португалия - Гана", "Южная Корея - Гана", "Гана - Уругвай"),
            GERMANY to TeamInfo(R.drawable.germany_flag, "Германия", "Группа E", "Группа E. 1-й тур", "Группа E. 2-й тур", "Группа E. 3-й тур", "23.11.2022 16:00", "27.11.2022 22:00", "01.12.2022 22:00", "Германия - Япония", "Испания - Германия", "Коста-Рика - Германия"),
            DENMARK to TeamInfo(R.drawable.denmark_flag, "Дания", "Группа D", "Группа D. 1-й тур", "Группа D. 2-й тур", "Группа D. 3-й тур", "22.11.2022 16:00", "26.11.2022 19:00", "30.11.2022 18:00", "Дания - Тунис", "Франция - Дания", "Австралия - Дания"),
            IRAN to TeamInfo(R.drawable.iran_flag, "Иран", "Группа B", "Группа B. 1-й тур", "Группа B. 2-й тур", "Группа B. 3-й тур", "21.11.2022 16:00", "25.11.2022 13:00", "29.11.2022 22:00", "Англия - Иран", "Уэльс - Иран", "Иран - США"),
            SPAIN to TeamInfo(R.drawable.spain_flag, "Испания", "Группа E", "Группа E. 1-й тур", "Группа E. 2-й тур", "Группа E. 3-й тур", "23.11.2022 19:00", "27.11.2022 22:00", "01.12.2022 22:00", "Испания - Коста-Рика", "Испания - Германия", "Япония - Испания"),
            CAMEROON to TeamInfo(R.drawable.cameroon_flag, "Камерун", "Группа G", "Группа G. 1-й тур", "Группа G. 2-й тур", "Группа G. 3-й тур", "24.11.2022 13:00", "28.11.2022 13:00", "02.12.2022 22:00", "Швейцария - Камерун", "Камерун - Сербия", "Камерун - Бразилия"),
            CANADA to TeamInfo(R.drawable.canada_flag, "Камерун", "Группа F", "Группа F. 1-й тур", "Группа F. 2-й тур", "Группа F. 3-й тур", "23.11.2022 22:00", "27.11.2022 19:00", "01.12.2022 18:00", "Бельгия - Канада", "Хорватия - Канада", "Канада - Марокко"),
            QATAR to TeamInfo(R.drawable.qutar_flag, "Катар", "Группа A", "Группа A. 1-й тур", "Группа A. 2-й тур", "Группа A. 3-й тур", "20.11.2022 19:00", "25.11.2022 16:00", "29.11.2022 18:00", "Катар - Эквадор", "Катар - Синегал", "Нидерланды - Катар"),
            COSTA_RICA to TeamInfo(R.drawable.costa_rica_flag, "Коста-Рика", "Группа E", "Группа E. 1-й тур", "Группа E. 2-й тур", "Группа E. 3-й тур", "23.11.2022 19:00", "27.11.2022 13:00", "01.12.2022 22:00", "Испания - Коста-Рика", "Япония - Коста-Рика", "Коста-Рика - Германия"),
            MOROCCO to TeamInfo(R.drawable.morocco_flag, "Марокко", "Группа F", "Группа F. 1-й тур", "Группа F. 2-й тур", "Группа F. 3-й тур", "23.11.2022 13:00", "27.11.2022 16:00", "01.12.2022 18:00", "Марокко - Хорватия", "Бельгия - Марокко", "Канада - Марокко"),
            MEXICO to TeamInfo(R.drawable.mexico_flag, "Мексика", "Группа C", "Группа C. 1-й тур", "Группа C. 2-й тур", "Группа C. 3-й тур", "22.11.2022 19:00", "26.11.2022 22:00", "30.11.2022 22:00", "Мексика - Польша", "Аргентина - Мексика", "С. Аравия - Мексика"),
            NETHERLANDS to TeamInfo(R.drawable.netherlands_flag, "Нидерланды", "Группа A", "Группа A. 1-й тур", "Группа A. 2-й тур", "Группа A. 3-й тур", "21.11.2022 19:00", "25.11.2022 19:00", "29.11.2022 18:00", "Сенегал - Нидерланды", "Нидерланды - Эквадор", "Нидерланды - Катар"),
            POLAND to TeamInfo(R.drawable.poland_flag, "Польша", "Группа C", "Группа C. 1-й тур", "Группа C. 2-й тур", "Группа C. 3-й тур", "22.11.2022 19:00", "26.11.2022 16:00", "30.11.2022 22:00", "Мексика - Польша", "Польша - С. Аравия", "Польша - Аргентина"),
            PORTUGAL to TeamInfo(R.drawable.portugal_flag, "Португалия", "Группа H", "Группа H. 1-й тур", "Группа H. 2-й тур", "Группа H. 3-й тур", "24.11.2022 19:00", "28.11.2022 22:00", "02.12.2022 18:00", "Португалия - Гана", "Португалия - Уругвай", "Южная Корея - Португалия"),
            USA to TeamInfo(R.drawable.usa_flag, "США", "Группа B", "Группа B. 1-й тур", "Группа B. 2-й тур", "Группа B. 3-й тур", "21.11.2022 22:00", "25.11.2022 22:00", "29.11.2022 22:00", "США - Уэльс", "Англия - США", "Иран - США"),
            S_ARABIA to TeamInfo(R.drawable.s_arabia_flag, "Саудовская Аравия", "Группа C", "Группа C. 1-й тур", "Группа C. 2-й тур", "Группа C. 3-й тур", "22.11.2022 13:00", "26.11.2022 16:00", "30.11.2022 22:00", "Аргентина - С. Аравия", "Польша - С. Аравия", "С. Аравия - Мексика"),
            SENEGAL to TeamInfo(R.drawable.senegal_flag, "Сенегал", "Группа A", "Группа A. 1-й тур", "Группа A. 2-й тур", "Группа A. 3-й тур", "21.11.2022 19:00", "25.11.2022 16:00", "29.11.2022 18:00", "Сенегал - Нидерланды", "Катар - Сенегал", "Эквадор - Сенегал"),
            SERBIA to TeamInfo(R.drawable.serbia_flag, "Сербия", "Группа G", "Группа G. 1-й тур", "Группа G. 2-й тур", "Группа G. 3-й тур", "24.11.2022 22:00", "28.11.2022 13:00", "02.12.2022 22:00", "Бразилия - Сербия", "Камерун - Сербия", "Сербия - Швейцария"),
            TUNISIA to TeamInfo(R.drawable.tunisia_flag, "Тунис", "Группа D", "Группа D. 1-й тур", "Группа D. 2-й тур", "Группа D. 3-й тур", "22.11.2022 16:00", "26.11.2022 13:00", "30.11.2022 18:00", "Дания - Тунис", "Тунис - Австралия", "Тунис - Франция"),
            URUGUAY to TeamInfo(R.drawable.uruguay_flag, "Уругвай", "Группа H", "Группа H. 1-й тур", "Группа H. 2-й тур", "Группа H. 3-й тур", "24.11.2022 16:00", "28.11.2022 22:00", "02.12.2022 18:00", "Уругвай - Южная Корея", "Португалия - Уругвай", "Гана - Уругвай"),
            WALES to TeamInfo(R.drawable.wales_flag, "Уэльс", "Группа B", "Группа B. 1-й тур", "Группа B. 2-й тур", "Группа B. 3-й тур", "21.11.2022 22:00", "25.11.2022 13:00", "29.11.2022 22:00", "США - Уэльс", "Уэльс - Иран", "Уэльс - Англия"),
            FRANCE to TeamInfo(R.drawable.france_flag, "Франция", "Группа D", "Группа D. 1-й тур", "Группа D. 2-й тур", "Группа D. 3-й тур", "22.11.2022 22:00", "26.11.2022 19:00", "30.11.2022 18:00", "Франция - Австралия", "Франция - Дания", "Тунис - Франция"),
            CROATIA to TeamInfo(R.drawable.croatia_flag, "Хорватия", "Группа F", "Группа F. 1-й тур", "Группа F. 2-й тур", "Группа F. 3-й тур", "23.11.2022 13:00", "27.11.2022 18:00", "01.12.2022 19:00", "Марокко - Хорватия", "Хорватия - Канада", "Хорватия - Бельгия"),
            SWITZERLAND to TeamInfo(R.drawable.switzerland_flag, "Швейцария", "Группа G", "Группа G. 1-й тур", "Группа G. 2-й тур", "Группа G. 3-й тур", "24.11.2022 13:00", "28.11.2022 19:00", "02.12.2022 22:00", "Швейцария - Камерун", "Бразилия - Швейцария", "Сербия - Швейцария"),
            ECUADOR to TeamInfo(R.drawable.ecuador_flag, "Эквадор", "Группа A", "Группа A. 1-й тур", "Группа A. 2-й тур", "Группа A. 3-й тур", "20.11.2022 19:00", "25.11.2022 19:00", "29.11.2022 18:00", "Катар - Эквадор", "Нидерланды - Эквадор", "Эквадор - Сенегал"),
            SOUTH_KOREA to TeamInfo(R.drawable.south_korea_flag, "Южная Корея", "Группа H", "Группа H. 1-й тур", "Группа H. 2-й тур", "Группа H. 3-й тур", "24.11.2022 16:00", "28.11.2022 16:00", "02.12.2022 18:00", "Уругвай - Южная Корея", "Южная Корея - Гана", "Южная Корея - Португалия"),
            JAPAN to TeamInfo(R.drawable.japan_flag, "Япония", "Группа E", "Группа E. 1-й тур", "Группа E. 2-й тур", "Группа E. 3-й тур", "23.11.2022 16:00", "27.11.2022 13:00", "01.12.2022 22:00", "Германия - Япония", "Япония - Коста-Рика", "Япония - Испания"),
        )



    val getStageMatches
        get() = listOf(
        "1-й тур",
        "20 ноября",
        StageMatches("19:00", R.drawable.qatar, "Катар", QATAR, R.drawable.ecuador, "Эквадор", ECUADOR, "3.45", "3.32", "2.33"),
        "21 ноября",
        StageMatches("13:00", R.drawable.senegal, "Сенегал", SENEGAL, R.drawable.netherlands, "Нидерланды", NETHERLANDS, "5.75", "3.70", "1.70"),
        StageMatches("16:00", R.drawable.england, "Англия", ENGLAND, R.drawable.iran, "Иран", IRAN, "1.35", "5.10", "11.50"),
        StageMatches("22:00", R.drawable.usa, "США", USA, R.drawable.wales, "Уэльс", WALES, "2.58", "3.22", "3.00"),
        "22 ноября",
        StageMatches("13:00", R.drawable.argentina, "Аргентина", ARGENTINA, R.drawable.s_arabia, "С. Аравия", S_ARABIA, "1.22", "6.70", "17.00"),
        StageMatches("16:00", R.drawable.denmark, "Дания", DENMARK, R.drawable.tunisia, "Тунис",TUNISIA, "1.51", "4.30", "8.00"),
        StageMatches("19:00", R.drawable.mexico, "Мексика", MEXICO,R.drawable.poland, "Польша",
            POLAND, "2.82", "3.20", "2.74"),
        StageMatches("22:00", R.drawable.france, "Франция",
            FRANCE, R.drawable.australia, "Австралия", AUSTRALIA,"1.24", "6.50", "14.00"),
        "23 ноября",
        StageMatches("13:00", R.drawable.morrocco, "Марроко", MOROCCO,R.drawable.croatia, "Хорватия", CROATIA,"4.88", "3.38", "1.88"),
        StageMatches("16:00", R.drawable.germany, "Германия", GERMANY, R.drawable.japan, "Япония", JAPAN,"1.38", "5.20", "8.60"),
        StageMatches("19:00", R.drawable.spain, "Испания", SPAIN, R.drawable.costa_rica, "Коста-Рика", COSTA_RICA, "1.32", "5.40", "12.50"),
        StageMatches("22:00", R.drawable.belgium, "Бельгия", BELGIUM, R.drawable.canada, "Канада", CANADA,"1.28", "5.80", "13.00"),
        "24 ноября",
        StageMatches("13:00", R.drawable.switzerland, "Швейцария", SWITZERLAND, R.drawable.cameroon, "Камерун", CAMEROON, "1.94", "3.40", "4.64"),
        StageMatches("16:00", R.drawable.uruguay, "Уругвай", URUGUAY, R.drawable.south_korea, "Южная корея", SOUTH_KOREA, "1.89", "3.50", "4.82"),
        StageMatches("19:00", R.drawable.portugal, "Португалия", PORTUGAL, R.drawable.ghana, "Гана", GHANA,"1.58", "3.92", "7.20"),
        StageMatches("22:00", R.drawable.brazil, "Бразилия", BRAZIL, R.drawable.serbia, "Сербия", SERBIA, "1.51", "4.44", "7.30"),
        "2-й тур",
        "25 ноября",
        StageMatches("13:00", R.drawable.wales, "Уэльс", WALES, R.drawable.iran, "Иран", IRAN, "2.26", "3.30", "3.65"),
        StageMatches("16:00", R.drawable.qatar, "Катар", QATAR, R.drawable.senegal, "Сенегал", SENEGAL, "3.92", "3.35", "2.13"),
        StageMatches("19:00", R.drawable.netherlands, "Нидерланды", NETHERLANDS, R.drawable.ecuador, "Эквадор", ECUADOR, "1.79", "3.80", "5.00"),
        StageMatches("22:00", R.drawable.england, "Англия", ENGLAND, R.drawable.usa, "США", USA, "1.87", "3.64", "4.60"),
        "26 ноября",
        StageMatches("13:00", R.drawable.tunisia, "Тунис", TUNISIA, R.drawable.australia, "Австралия", AUSTRALIA, "2.91", "3.15", "2.80"),
        StageMatches("16:00", R.drawable.poland, "Польша", POLAND, R.drawable.s_arabia, "С. Аравия", S_ARABIA, "1.78", "3.75", "5.20"),
        StageMatches("19:00", R.drawable.france, "Франция", FRANCE, R.drawable.denmark, "Дания", DENMARK, "1.96", "3.54", "4.30"),
        StageMatches("22:00", R.drawable.argentina, "Аргентина", ARGENTINA, R.drawable.mexico, "Мексика", MEXICO, "1.67", "3.90", "6.20"),
        "27 ноября",
        StageMatches("13:00", R.drawable.japan, "Япония", JAPAN, R.drawable.costa_rica, "Коста-Рика", COSTA_RICA, "2.46", "3.20", "3.30"),
        StageMatches("16:00", R.drawable.belgium, "Бельгия", BELGIUM, R.drawable.morrocco, "Марокко", MOROCCO, "1.55", "4.30", "7.00"),
        StageMatches("19:00", R.drawable.croatia, "Хорватия", CROATIA, R.drawable.canada, "Канада", CANADA, "1.84", "3.65", "4.68"),
        StageMatches("22:00", R.drawable.spain, "Испания", SPAIN, R.drawable.germany, "Германия", GERMANY, "2.56", "3.42", "2.90"),
        "28 ноября",
        StageMatches("13:00", R.drawable.cameroon, "Камерун",
            CAMEROON, R.drawable.serbia, "Сербия", SERBIA, "3.76", "3.10", "2.32"),
        StageMatches("16:00", R.drawable.south_korea, "Южная Корея", SOUTH_KOREA, R.drawable.ghana, "Гана", GHANA,"2.85", "3.04", "2.90"),
        StageMatches("19:00", R.drawable.brazil, "Бразилия", BRAZIL, R.drawable.switzerland, "Швейцария", SWITZERLAND, "1.51", "4.32", "7.30"),
        StageMatches("22:00", R.drawable.portugal, "Португалия", PORTUGAL, R.drawable.uruguay, "Уругвай", URUGUAY,"2.14", "3.32", "3.78"),
        "3-й тур",
        "29 ноября",
        StageMatches("18:00", R.drawable.ecuador, "Эквадор", ECUADOR, R.drawable.senegal, "Сенегал", SENEGAL, "3.00", "3.20", "2.57"),
        StageMatches("18:00", R.drawable.netherlands, "Нидерланды", NETHERLANDS, R.drawable.qatar, "Катар", QATAR, "1.35", "5.10", "11.00"),
        StageMatches("22:00", R.drawable.wales, "Уэльс", WALES,  R.drawable.england, "Англия", ENGLAND, "5.90", "3.90", "1.62"),
        StageMatches("22:00", R.drawable.iran, "Иран", IRAN, R.drawable.usa, "США", USA,"3.48", "3.40", "2.22"),
        "30 ноября",
        StageMatches("18:00", R.drawable.tunisia, "Тунис", TUNISIA, R.drawable.france, "Франция", FRANCE, "15.00", "5.30", "1.26"),
        StageMatches("18:00", R.drawable.australia, "Австралия", AUSTRALIA, R.drawable.denmark, "Дания", DENMARK, "6.60", "3.65", "1.62"),
        StageMatches("22:00", R.drawable.s_arabia, "С. Аравия", S_ARABIA, R.drawable.mexico, "Мексика", MEXICO,"6.80", "4.00", "1.55"),
        StageMatches("22:00", R.drawable.poland, "Польша", POLAND, R.drawable.argentina, "Аргентина", ARGENTINA, "4.90", "3.95", "1.70"),
        "1 декабря",
        StageMatches("18:00", R.drawable.canada, "Канада", CANADA, R.drawable.morrocco, "Марокко", MOROCCO, "3.26", "3.24", "2.32"),
        StageMatches("18:00", R.drawable.croatia, "Хорватия", CROATIA, R.drawable.belgium, "Бельгия", BELGIUM, "4.10", "3.70", "1.96"),
        StageMatches("22:00", R.drawable.costa_rica, "Коста-Рика", COSTA_RICA, R.drawable.germany, "Германия", GERMANY, "11.50", "5.10", "1.34"),
        StageMatches("22:00", R.drawable.japan, "Япония", JAPAN, R.drawable.spain, "Испания", SPAIN, "12.00", "5.50", "1.30"),
        "2 декабря",
        StageMatches("18:00", R.drawable.south_korea, "Южная Корея", SOUTH_KOREA, R.drawable.portugal, "Португалия", PORTUGAL, "15.00", "5.30", "1.26"),
        StageMatches("18:00", R.drawable.ghana, "Гана", GHANA, R.drawable.uruguay, "Уругвай", URUGUAY,"6.60", "3.65", "1.62"),
        StageMatches("22:00", R.drawable.serbia, "Сербия", SERBIA, R.drawable.switzerland, "Швейцария", SWITZERLAND, "6.80", "4.00", "1.55"),
        StageMatches("22:00", R.drawable.cameroon, "Камерун", CAMEROON, R.drawable.brazil, "Бразилия", BRAZIL, "4.90", "3.95", "1.70"),
        )


}