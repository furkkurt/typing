import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class typing{
  static String getRandomWord(){
    String[] words = {"automobile","motorcar","auto","railcar","machine","gondola","cablecar","elevatorcar","railroadcar","railwaycar","vehicle","truck","sedan","van","suv","vehicles","driver","cruiser","cab","tire","motor","limo","passenger","taxi","bus","wheel","trunk","hood","lorry","mercedes","buick","automobiles","driving","boat","engine","bodywork","motoring","automotive","trolley","wagon","wreck","escalade","chariot","carmaker","cart","backseat","cadillac","train","automaker","motors","autos","carload","cabin","road","carpark","drive","accident","parking","valet","vehicular","crate","boxcar","beater","malibu","carriage","body","tank","compartment","caboose","traffic","ride","bomb","wagons","glove","machinery","cashier","consignment","pull","warrant","cash","bombs","conveyance","carla","mine","suicide","unit","box","because","jaguar","pinto","nativity","shoot","hop","acr","coach","fund","cln","float","bandwagon","lading","calorimeter","vault","checkout","rac","cal","caisse","fiat","indictment","blueberry","crd","regt","carl","self","laurie","twisted","cha","since","marty","cals","writ","cue","rca","aut","che","kar","order","booby-trapped","drive-by","karr","kars","motor-vehicle","motormen","pmv","racs","railcars","rar","rtas","self-","stackhouse","char","drc","rda","minivan","motorcycle","motorbike","jeep","garage","racecar","camry","coupe","lamborghini","roadster","volvo","motorist","dealership","pickuptruck","scooter","bike","stationwagon","pacecar","moped","hatchback","tractor","motorscooter","oldsmobile","sportutility","wheeler","bicycle","autoist","lawnmower","kart","vetturino","ute","maserati","sportscar","steeringwheel","towtruck","minibike","flattire","squadcar","carwindow","datsun","baggagecar","vettura","minibus","lawnmower","sentra","pickup","freightliner","chevvy","miata","dumptruck","soundtruck","landrover","horselesscarriage","hotrod","golfcart","taxicab","bubblecar","tercel","headlight","mower","racecars","carmirror","armco","automobileengine","firetruck","powerboat","prius","econobox","windshield","automobilehorn","dustcart","motorvehicle","drivearound","fender","tipperlorry","pushchair","hubcap","freightcar","driveway","hotrod","chevy","limousine","tippertruck","ragtop","altima","runabout","bumper","camaro","windscreen","dragster","trike","horsebox","motorboat","prang","refrigeratorcar","jinker","carwheel","policecar","audi","gharry","trailertruck","carbattery","bmw","manumotor","sportutilityvehicle","toyota","microcar","brakedrum","amaxophobia","volkswagen","electricalsystem","tankwagon","gasup","cardoor","roadhog","carhorn","cattlecar","porsche","lexus","nissan","skibob","luggagecarrier","vehiculation","prowlcar","taxistand","wagonage","slidometer","fanbelt","motorpool","caravaneer","testdriver","chrysler","grossweight","truckage","hummer","ferrari","motory","truckgarden","chevrolet","dieselmotor","panelvan","honda","estatecar","roadtrain","ford","wheelaround","blackmaria","wagonry","peirameter","idiotlight","garageman","ahead","fast","neither","presently","new","private","big","black","red","used","open","armored","electric","armoured","blue","expensive","unmarked","stolen","nice","oncoming","empty","yellow","hired","fancy","compact","closed","shiny","wrecked","occasional","gray","damn","sleek","battered","rear","triumphal","crowded","stalled","cheap","luxurious","flashy","secondhand","fastest","bigger","abandoned","convertible","chauffeured","stationary","rental","sporty","overturned","loaded","newer","antique","aerial","lone","smart","hybrid","leading","inexpensive","damned","disabled","unfamiliar","goddamn","faster","refrigerated","runaway","locked","your","rusty","dusty","cheapest","dilapidated","interurban","powered","noisy","smashed","sealed","miniature","unlocked","lightweight","damaged","darkened","winning","suspicious","rickety","streamlined","cheaper","nicer","nondescript","economical","dependable","newest","covered","decorated","undercover","equipped","shabby","affordable","bulletproof","stranded","flaming","laden","mangled","junked","rented","enclosed","cramped","nosed","offending","goddamned","posh","ramshackle","roomy","burned","decrepit","submerged","dented","blazing","derailed","packed","goddam","demolished","rusted","winged","stylish","cute","crumpled","driverless","snazzy","stuffy","converted","beige","derelict","insured","safest","crushed","classy","clown","suspect","gilded","unsafe","overheated","spec","wheeled","customized","onrushing","supercharged","overcrowded","unattended","overloaded","unreliable","motorized","motionless","his","nicest","crappy","lousy","sexy","eastbound","futuristic","racy","stuck","waxed","junky","front","seat","back","side","house","door","top","window","home","sound","roof","price","speed","floor","wheels","lights","street","headlights","interior","owner","windows","make","damage","purchase","boot","trip","occupants","inside","sight","path","tires","corner","chauffeur","plane","keys","clothes","passengers","lead","travel","platform","doors","radio","walk"};
    int randNum = (int)Math.floor(Math.random() * (words.length));
    String word = words[randNum];
    return word;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Timer timer = new Timer();
    TimerTask task = new Helper();
    timer.schedule(task, 0, 1000);
    int words = 0;
    int score = 0;
    int extras = 0;
    System.out.println("You have 60 seconds. Go!");

    String word1 = getRandomWord();
    String word2 = getRandomWord();
    String word3 = getRandomWord();
    String word4 = getRandomWord();
    String word5 = getRandomWord();
    String entry1 = "";
    String entry2 = "";
    String entry3 = "";
    String entry4 = "";
    String entry5 = "";

    String sentence = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
    System.out.print(sentence+"\n");
    String entry = input.nextLine();
    while(Helper.seconds > 0){
      extras = 0;
      try{
      entry1 = entry.substring(0,entry.indexOf(" "));
      entry = entry.substring(entry.indexOf(" ") + 1);
      if(entry1 != "" && entry1.equals(word1))
        score++; 
      extras++;
      }
      catch(Exception e){};
      try{     
      entry2 = entry.substring(0,entry.indexOf(" "));
      entry = entry.substring(entry.indexOf(" ") + 1);
      if(entry2 != "" && entry2.equals(word2))
        score++;
      extras++;
      }
      catch(Exception e){};
      try{
      entry3 = entry.substring(0,entry.indexOf(" "));
      entry = entry.substring(entry.indexOf(" ") + 1);
      if(entry3 != "" && entry3.equals(word3))
        score++;
      extras++;
      }
      catch(Exception e){};
      try{
      entry4 = entry.substring(0,entry.indexOf(" "));
      entry = entry.substring(entry.indexOf(" ") + 1);
      if(entry4 != "" && entry4.equals(word4))
        score++;
      extras++;
      }
      catch(Exception e){};
      try{
      entry5 = entry.substring(0);
      if(entry5 != "" && entry5.equals(word5))
        score++;
      extras++;
      }
      catch(Exception e){};
      
      words += 5;
      word1 = getRandomWord();
      word2 = getRandomWord();
      word3 = getRandomWord();
      word4 = getRandomWord();
      word5 = getRandomWord();
      entry1 = "";
      entry2 = "";
      entry3 = "";
      entry4 = "";
      entry5 = "";
      sentence = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
      System.out.print(sentence+"\n");
      entry = input.nextLine();
    }
    System.out.println("TIMES UP!");
    System.out.println("wpm: " + (words+extras));
    System.out.println("Accurcy: %" + (100*score)/words);
  }
}
class Helper extends TimerTask{
  public static int seconds = 60;

  public void run(){
    seconds--;
  }
}
