//Programmer Henok G
//First Modified july-6-2015
//Last Modified august-13-2015

import javax.microedition.lcdui.Image;

public class FetanOperations{
    
    protected static final String suffix = "#";
    protected static final String amountPrefix = "*804";
    protected static final String rechargePrefix = "*805*";
    protected static final String transferPrefix = "*806*";
    protected static final String callMeBackPrefix = "*807*";
    protected static final String firePhoneNumber = "999";
    protected static final String policePhoneNumber = "911";
    protected static final String electricPhoneNumber = "888";

    //Phone Numbers For Hospitals
    protected static final String ambulance = "907";
    protected static final String addisKardiak = "0116634720";
    protected static final String addisHiwot = "0116180449";
    protected static final String alert = "0111711200";
    protected static final String amanuel = "0112131516";
    protected static final String asegedech = "0116622049";
    protected static final String torHayloch = "0113712020";
    protected static final String beteZata = "0115514141";
    protected static final String betel = "0113730122";
    protected static final String betsegah = "0115531216";
    protected static final String bgm = "0115521593";
    protected static final String tikurAnbessa = "0115511211";
    protected static final String biras = "0116189696";
    protected static final String cureEthiopia = "0111237767";
    protected static final String degachBalcha = "0115513205";
    protected static final String dinberua = "0116611112";
    protected static final String ethioTibeb = "0112137767";
    protected static final String internationalCardiovascular = "0114424680";
    protected static final String festula = "0113716544";
    protected static final String ganide = "0115518185";
    protected static final String girum = "0112757676";
    protected static final String hayat = "0116624488";
    protected static final String kadisko = "0116298904";
    protected static final String landmark = "0115526229";
    protected static final String minelek2 = "0111234272";
    protected static final String mmd = "0116464254";
    protected static final String mcmEthioKorea = "0116295427";
    protected static final String nazrawet = "0111564482";
    protected static final String police = "0115155017";
    protected static final String rasDeseta = "0111553395";
    protected static final String kidusGebreal = "0116613622";
    protected static final String kidusPawlos = "0112768303";
    protected static final String kidusPetros = "0111236229";
    protected static final String kidusYared = "0116454604";
    protected static final String tezeniya = "0113711208";
    protected static final String tibebu = "0111553066";
    protected static final String yekatit12 = "0111562691";
    protected static final String zenbaba = "0114431992";
    protected static final String zewdetu = "0115518085";

    //Phone Numbers For Police Stations
    protected static final String polic = "911";
    protected static final String federalPolice = "916";
    protected static final String addisAbabaPolice = "0111572121";
    protected static final String bolePolice = "0115536794";
    protected static final String lidetaPolice = "0117798649";
    protected static final String kirkosPolice = "0115534774";
    protected static final String aradaPolice = "0111573426";
    protected static final String yekaPolice = "0116181339";
    protected static final String nifasSilkLaftoPolice = "0114431529";
    protected static final String kolfeKeranyoPolice = "0112798650";
    protected static final String akakeKalitiPolice = "0114341438";
    protected static final String addisKetemaPolice = "0112132125";
    protected static final String gulelePolice = "0111575059";
    protected static final String addisAbabaTraficPolice = "0116628222";

    //Phone Numbers For Fire Stations
    protected static final String firstTabiya = "0111567040";
    protected static final String secondTabiya = "0114663420";
    protected static final String thirdTabiya = "0112769146";
    protected static final String fourthTabiya = "0114425563";
    protected static final String fifthTabiya = "0114340096";
    protected static final String sixthTabiya = "0116630373";
    protected static final String seventhTabiya = "0116648580";
    
    //Phone Numbers For Hotels
    protected static final String ambasadorHotel = "0116188281";
    protected static final String airportMotel = "0116610422";
    protected static final String araratHotel = "0116461166";
    protected static final String atlasIntHotel = "0116187432";
    protected static final String axumHotel = "0116613916";
    protected static final String beshaleHotel = "0116478181";
    protected static final String centralShewaHotel = "0116611454";
    protected static final String concordHotel = "0114654956";
    protected static final String crownHotel = "0114391430";
    protected static final String diafriqHotel = "0115517385";
    protected static final String dimtriHotel = "0116453282";
    protected static final String desalegnHotel = "0116624524";
    protected static final String deleopalHotel = "0115507777";
    protected static final String dreamlinerHotel = "0114674000";
    protected static final String ethiopiaHotel = "0115517400";
    protected static final String extremeHotel = "0111553777";
    protected static final String genetHotel = "0115518125";
    protected static final String geonHotel = "0115513222";
    protected static final String globalHotel = "0114664766";
    protected static final String harambeHotel = "0115514000";
    protected static final String harmoneyHotel = "0116183100";
    protected static final String hiltonHotel = "0115518400";
    protected static final String imperialHotel = "0116293329";
    protected static final String intercontinentalHotel = "0115505066";
    protected static final String iyerusalemHotel = "0111551712";
    protected static final String jupiterHotel = "0115527333";
    protected static final String kingsHotel = "0113711300";
    protected static final String lalibelaHotel = "0116614917";
    protected static final String meridianHotel = "0116615050";
    protected static final String nationalHotel = "0115515166";
    protected static final String plazaHotel = "0116612203";
    protected static final String nigistesabaHotel = "0116180000";
    protected static final String panoramaHotel = "0116616070";
    protected static final String rasambaHotel = "0111228080";
    protected static final String rasHotel = "0115517060";
    protected static final String riveraHotel = "0114197755";
    protected static final String semenHotel = "0111550067";
    protected static final String sheratonHotel = "0115171717";
    protected static final String wabishebeleHotel = "0115517187";
    protected static final String yoilHotel = "0116632828";
    protected static final String yordanosHotel = "0115515711";

    //Phone Numbers For Cinema
    protected static final String ambasadorCinema = "0115537637";
    protected static final String megamafitiyatirCinema = "0111553577";
    protected static final String cityhalCinema = "0111563962";
    protected static final String ednamolmatiCinema = "0116616969";
    protected static final String hagerfikirTiyatir = "0111119820";
    protected static final String rasTiyatir = "0112751060";
    protected static final String kandiTiyatir = "0111556575";
    protected static final String nisirTiyatirandPromotion = "0116630908";
    protected static final String alemCinema = "0111570466";
    protected static final String ligochandwetatochTiyatir = "011128603";
    protected static final String biherawiTiyatir = "0115158225";
    protected static final String agonaCinema = "0114661763";

    //Phone Numbers For Banks
    protected static final String abayBank = "0118302030";
    protected static final String adisintBank = "0118302761";
    protected static final String awashintBank = "0115570000";
    protected static final String abysinyaBank = "0115514030";
    protected static final String birhanintBank = "0116627113";
    protected static final String bunaintBank = "0115158390";
    protected static final String coporomiaBank = "0115506025";
    protected static final String nigidBank = "0115515004";
    protected static final String constructionandbusinessBank = "0115512300";
    protected static final String dashenBank = "0114661380";
    protected static final String developmentBank = "0115511188";
    protected static final String debubglobalBank = "0114661380";
    protected static final String inatBank = "011661380";
    protected static final String anbessaintBank = "0116627113";
    protected static final String nibintBank = "0115503288";    
    protected static final String nationalBank = "0115517430";
    protected static final String oromiaintBank = "0111561834";
    protected static final String hibretBank = "0114655222";
    protected static final String wegagenBank = "0115523800";
    protected static final String zemenBank = "0115539769";

    //Phone Numbers For AirPorts
    protected static final String ethiopiaAirport = "0116656666";
    protected static final String kenyanAirport = "0115525548";
    protected static final String egyptAirport = "0111552203";
    protected static final String saudiAirport = "0115512769";
    protected static final String yemenAirport = "0115516079";
    protected static final String emiratesAirport = "0115181818";
    protected static final String bmiAirport = "0116650494";
    protected static final String klmroyaldechAirport = "0115525541";
    protected static final String lufthansaAirport = "5515666";
    protected static final String turkAirport = "0116627781";

    //Phone Numbers For Insurances
    protected static final String abayInsurance = "0115535300";
    protected static final String awashinsurance = "0115535300";
    protected static final String africaInsurance = "0115535300";
    protected static final String birhanInsurance = "0115535300";
    protected static final String ethiopianInsuranceCorp = "0115535300";
    protected static final String ethiopianLifeInsurance = "0115535300";
    protected static final String globalInsurance = "0115535300";
    protected static final String anbessaInsurance = "0115535300";
    protected static final String niceInsurance = "0115535300";
    protected static final String nileInsurance = "0115535300";
    protected static final String nyalaInsurance = "0115535300";
    protected static final String nibInsurance = "0115535300";
    protected static final String oromiaInsurance = "0115535300";
    protected static final String sunInsurance = "0115535300";
    protected static final String hibretInsurance = "0115535300";

    //Phone Numbers For Medias
    protected static final String ethiopianzenaagelgelot = "0111550011";
    protected static final String erta = "0113717034";
    protected static final String fbc = "0115516777";
    protected static final String ethiopiapressorg = "0115157244";
    protected static final String waltainformationcenter = "0114670303";
    protected static final String fm97 = "0113717029";
    protected static final String fanafm = "0115536008";
    protected static final String shegerfm = "0111554545";
    protected static final String afrofm = "0111552200";

    //Phone Numbers For Transport
    protected static final String anbessaBus = "0116627179";
    protected static final String ethiodjibotiRailway = "0115517250";
    protected static final String ethiopiashippingShip = "0115518280";
    protected static final String ntotaxiService = "0115151722";

    //Phone Numbers For Libraries
    protected static final String kennedyLib = "0111110433";
    protected static final String britishCouncil = "0111550022";
    protected static final String nationalLib = "0115516247";
    protected static final String italianculturalInstitute = "0111113427";
    protected static final String acadofethiopianLanguage = "0115515926";
    protected static final String addisLib = "0114670867";
    protected static final String alianceethioFransic = "0111550213";
    protected static final String germanculturalInstitute = "0111552888";
    protected static final String addisababapublicLib = "0111550111";

    protected static String stripPhoneNumber(String phoneNumber){
        
        String returnVariable = "";
        int indexOfNine = phoneNumber.indexOf("9");
        
        if (phoneNumber.length()>13 || phoneNumber.length()<10){
            returnVariable = "Unsupported Phone Number";
        }
        else if (phoneNumber.indexOf("9")>4){
            returnVariable = "Unsupported Phone Number";
        }
        else{
            returnVariable = "0"+phoneNumber.substring(indexOfNine);
        }
        return returnVariable;
    }
}